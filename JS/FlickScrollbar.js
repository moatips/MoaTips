/*!
 * jquery.flickScrollbar  v1.2.3   2013/04/08
 *
 * Copyright (c) 2013 N.Uehara
 * Dual licensed under the MIT and GPL licenses.
 * http://pochi-tools.com
 *
 */

(function($) {
	var flickScrollbar,
		document = window.document,
		__flickScrollbar_uid=0;

	$.fn.flickScrollbar = flickScrollbar = function(options) {
		if (typeof options === "string") {
			var args = Array.prototype.slice.call(arguments, 1),
				returnValue = this;

			this.each(function() {
				var instance = $.data(this, 'flickScrollbar'),
					value = instance && $.isFunction(instance[options]) ?
						instance[options].apply(instance, args) : instance;

				if (value !== instance && value !== undefined) {
					returnValue = value;
					return false;
				}
			});

			return returnValue;
		} else {
			return this.each(function() {
				var instance = $.data(this, 'flickScrollbar');

				if (instance) {
					$.extend(true, instance.options, options);
					instance.init();
				} else {
					$.data(this, 'flickScrollbar', new flickScrollbar.prototype.create(options, this));
				}
			});
		}
	};

	flickScrollbar.prototype = {
		options: {
			id: null,
			content: null,
			vertical: true,
			horizontal: true,
			fadeIn: 100,
			fadeOut: 100,
			color: '#000000',
			border: '1px solid #eee',
			opacity: 50,
			size: 6,
			radius: 0.7,
			useCssTansform: true,
			fade: true,
			interval: 50,
			timeout: 1000,
			watch: 200,
			sizeMethod: 'parent',			//! "parent" or "children"
			vContentsSize: 0,
			hContentsSize: 0,
			zindex: 1
		},
		layout: {
			'top': 'auto',
			'left': 'auto',
			'right': 'auto',
			'bottom': 'auto',
			'float': 'none'
		},
		disabled: false,
		prefix: 'ui-flickscrollbar',

		create: function(options, elem) {
			__flickScrollbar_uid++;
			this.MIN_SLIDER_SIZE = 10;

			this.$this = $(elem);
			this.timer = null;
			this.watcher = null;
			this.touch = false;
			this.flick = false;
			this.$headerCss=null;

			this.vRatio = 0;
			this.vHeight = 0;
			this.vMax = 0;

			this.hRatio = 0;
			this.hWidth = 0;
			this.hMax = 0;

			this.css3Fade={
				'fadeIn': this.prefix+'-fadeIn-'+__flickScrollbar_uid,
				'fadeOut': this.prefix+'-fadeOut-'+__flickScrollbar_uid
			};

			this.options=$.extend({}, this.options, options || {});

			this.orignStyle=this.$this.attr('style');

			function vender( prop ) {
				var $prefix = ['-webkit-', '-moz-', '-o-', '-ms-', ''];
				var $div = $('<div />');
				for(var i=0; i<$prefix.length; i++) {
					if (typeof $div.css($prefix[i]+prop) === "string") {
						return $prefix[i];
					}
				}
				return null;
			}

			//! Opacity vender judging
			function venderOpacity(opacity) {
				var props = [ 'opacity', '-moz-opacity', '-khtml-opacity', 'filter', '-ms-filter' ];
				var $div = $('<div />');
				for(var i=0; i<props.length; i++) {
					var key=props[i];
					var value=null;
					if (typeof $div.css(key) === "string") {
						if(key==='filter') {
							value='alpha(opacity='+opacity+')';
						}
						else if(key==='-ms-filter') {
							value='"progid:DXImageTransform.Microsoft.Alpha(Opacity='+opacity+')"';
						}
						else {
							value=opacity/100;
						}
					}
					cssOpacity={'prop': key, 'value': value};
					return {'prop': key, 'value': value};
				};
				return null;
			};

			this.borderRadius=vender('border-radius');
			this.transform=vender('transform');
			if(this.borderRadius!==null) this.borderRadius+='border-radius';
			if(this.transform!==null) this.transform+='transform';
			$.support.transform=(this.transform==null) ? false : true;

			var self = this,
				$this = this.$this,
				wrapperClass = this.prefix+'-wrapper',
				vScrollbarClass = this.prefix+'-content-vertical',
				vSliderClass = this.prefix+'-slider-vertical',
				hScrollbarClass = this.prefix+'-content-horizontal',
				hSliderClass = this.prefix+'r-slider-horizontal',
				options = this.options,
				_borderRadius=this.borderRadius,
				position = $this.css('position'),
				css3Fade=this.css3Fade;

			if (elem == window || elem == document || /^(html|body)$/i.test(elem.nodeName)) {
				this.disabled=true;
				return;
			}

			$this.wrap('<div class="'+wrapperClass+'"></div>');
			this.$ui_wrapper=$( $this.parent('.'+wrapperClass).first().eq(0) );
			this.$ui_wrapper
				.append( '<div class="'+vScrollbarClass+'"><div class="'+vSliderClass+'"></div></div>' )
				.append( '<div class="'+hScrollbarClass+'"><div class="'+hSliderClass+'"></div></div>' );
			this.$ui_vScrollbar=$( this.$ui_wrapper.find('.'+vScrollbarClass).first().eq(0) );
			this.$ui_hScrollbar=$( this.$ui_wrapper.find('.'+hScrollbarClass).first().eq(0) );
			this.$ui_vSlider=$( this.$ui_vScrollbar.find('.'+vSliderClass).first().eq(0) );
			this.$ui_hSlider=$( this.$ui_hScrollbar.find('.'+hSliderClass).first().eq(0) );
			this.$contents=$( (options.content) ? $this.find(options.content).eq(0) : $this.find(':first').eq(0) );

			if(options.id) this.$ui_wrapper.attr('id', options.id);
			this.$ui_wrapper.css('position', /(absolute|fixed)/.test(position) ? position : 'relative');
			this.$ui_vScrollbar.css({'position': 'absolute'}).hide();
			this.$ui_hScrollbar.css({'position': 'absolute'}).hide();

			var opacity= (options.opacity===100) ? null : venderOpacity(options.opacity);

			var vWidth=options.size
				+(self.toInt(this.$ui_vSlider.outerWidth())-self.toInt(this.$ui_vSlider.width()));

			var vRadius=Math.floor(vWidth*options.radius);
			this.$ui_vScrollbar.width(options.size).css({
				'z-index': options.zindex,
				'top': self.toInt(this.$this.css('border-top-width')),
				'right': self.toInt(this.$ui_vScrollbar.css('margin-right'))
			});

			this.$ui_vSlider.width(vWidth).css({

				'background-color': options.color,
				'border': options.border
			});
			if(this.borderRadius) {
				this.$ui_vSlider.css(_borderRadius, vRadius+'px');
			}
			if(opacity) {
				this.$ui_vSlider.css(opacity.prop, opacity.value);
			}

			var hHeight=options.size
				+(self.toInt(this.$ui_hScrollbar.outerHeight())-self.toInt(this.$ui_hScrollbar.height()));

			var hRadius=Math.floor(hHeight*options.radius);
			this.$ui_hScrollbar.height(options.size).css({
				'z-index': options.zindex,
				'bottom': self.toInt(this.$ui_hScrollbar.css('margin-bottom')),
				'left': self.toInt(this.$this.css('border-left-width'))
			});

			this.$ui_hSlider.height(hHeight).css({

				'background-color': options.color,
				'border': options.border
			});
			if(this.borderRadius) {
				this.$ui_hSlider.css(_borderRadius, hRadius+'px');
			}
			if(opacity) {
				this.$ui_hSlider.css(opacity.prop, opacity.value);
			}

			if(options.useCssTansform) {
				var venderPrefix=vender('animation');
				var opacityMin=venderOpacity(0);
				var opacityMax=venderOpacity(100);
				if(venderPrefix!==null && opacityMax!==null && opacityMin!==null) {
					var css='<style type="text/css">';
					css +='@'+venderPrefix+'keyframes '+css3Fade.fadeIn+' {0% {'+opacityMin.prop+': '+opacityMin.value+';} 100% {'+opacityMax.prop+': '+opacityMax.value+';}}';
					css +='@'+venderPrefix+'keyframes '+css3Fade.fadeOut+' {0% {'+opacityMax.prop+': '+opacityMax.value+';} 100% {'+opacityMin.prop+': '+opacityMin.value+';}}';
					css +='.'+css3Fade.fadeIn+'{'+venderPrefix+'animation: '+css3Fade.fadeIn+' '+options.fadeIn+'ms ease 0 1 normal;}';
					css +='.'+css3Fade.fadeOut+'{'+venderPrefix+'animation: '+css3Fade.fadeOut+' '+options.fadeIn+'ms ease 0 1 normal;'+opacityMin.prop+': '+opacityMin.value+';}';
					css +='</style>';
					this.$headerCss=$(css).appendTo('head');
				}
			}

			this.enable();

			this.init();

		},
		init: function() {
			if(this.disabled) return;
			var self = this,
				$this = this.$this,
				$ui_wrapper = this.$ui_wrapper,
				$ui_vScrollbar = this.$ui_vScrollbar,
				$ui_vSlider = this.$ui_vSlider,
				$ui_hScrollbar = this.$ui_hScrollbar,
				$ui_hSlider = this.$ui_hSlider,
				$contents=this.$contents,
				options = this.options,
				layout = this.layout;

			if(this.options.sizeMethod!='children') this.setOption('sizeMethod', 'parent');

			if(! $.support.transform) {
				if(options.useCssTansform) this.setOption('useCssTansform', false);
			}

			$contents=$( (options.content) ? $this.find(options.content).eq(0) : $this.find(':first').eq(0) );
			if(!$contents.length) {
				self.disabled=true;
				alert('[ID:'+$this.attr('id')+'] scrollable element not found');
				return;
			}

			var thisH=($this.isVisible()) ? self.toInt($this.innerHeight()) : 0;
			var thisW=($this.isVisible()) ? self.toInt($this.innerWidth()) : 0;

			//! 2013-03-22 update
			var vContentsSize=0;
			var hContentsSize=0;
			if(options.sizeMethod=='children') {
				vContentsSize=$contents.outerHeight()-$contents.innerHeight();
				hContentsSize=$contents.outerWidth()-$contents.innerWidth();

				var $children=$contents.children();
				if($children.length>1) {
					var first=$children.eq(0).position();
					var last=$children.eq($children.length-1).position();

					if(first.top==last.top && first.left==last.left) {
						//! it cannot be...
						vContentsSize=self.toInt($contents.outerHeight());
						hContentsSize=self.toInt($contents.outerWidth());
					}
					else if(first.top!=last.top && first.left!=last.left) {
						//! total of the direction in every direction
						$children.each( function(i) {
							if(first.top==$children.eq(i).position().top) hContentsSize+=$(this).outerWidth();
							if(first.left==$children.eq(i).position().left) vContentsSize+=$(this).outerHeight();
						});
					}
					else {
						if(first.top==last.top) {
							//! lining up side-by-side.  total of a transverse direction
							$children.each( function(i) {
								if(first.top==$children.eq(i).position().top) hContentsSize+=$(this).outerWidth();
							});
							if(first.left!=last.left) {
								vContentsSize+=self.toInt($children.eq(0).outerHeight());
							}
						}

						else {			//!  first.left==last.left
							//! vertical row.  total of a lengthwise direction.
							$children.each( function(i) {
								if(first.left==$children.eq(i).position().left) vContentsSize+=$(this).outerHeight();
							});
							if(first.top!=last.top) {
								hContentsSize+=self.toInt($children.eq(0).outerWidth());
							}
						}
					}
				}
				else if($children.length==1) {
					//! child elements=1
					vContentsSize+=self.toInt($children.eq(0).outerHeight());
					hContentsSize+=self.toInt($children.eq(0).outerWidth());
				}
				else {
					//! child elements=0
					vContentsSize=self.toInt($contents.outerHeight());
					hContentsSize=self.toInt($contents.outerWidth());
				}
			}
			else {
				vContentsSize=self.toInt($contents.outerHeight());
				hContentsSize=self.toInt($contents.outerWidth());
			}

			this.setOption('vContentsSize', vContentsSize);
			this.setOption('hContentsSize', hContentsSize);

			$ui_wrapper.height(thisH).width(thisW);

			var vScrollbarSize=thisH
				-self.toInt($ui_vScrollbar.outerHeight())
				+self.toInt($ui_vScrollbar.height())
				-self.toInt($ui_vScrollbar.css('margin-bottom'));

			var vHeight=(vContentsSize>0) ? thisH*vScrollbarSize/vContentsSize : 0;
			if(vHeight<self.MIN_SLIDER_SIZE) vHeight=self.MIN_SLIDER_SIZE;
			vHeight-=( self.toInt($ui_vSlider.outerHeight())-self.toInt($ui_vSlider.height()) );

			$ui_vScrollbar.height(vScrollbarSize);

			this.vMax=vScrollbarSize-vHeight;

			$ui_vSlider.height(vHeight);
			this.vHeight=vHeight;

			this.vRatio=(vContentsSize>0) ? -(vScrollbarSize/vContentsSize) : 0;

			var hScrollbarSize=thisW
				-self.toInt($ui_hScrollbar.outerWidth())
				+self.toInt($ui_hScrollbar.width())
				-self.toInt($ui_hScrollbar.css('margin-right'));

			var hWidth=(hContentsSize>0) ? thisW*hScrollbarSize/hContentsSize : 0;
			if(hWidth<self.MIN_SLIDER_SIZE) hWidth=self.MIN_SLIDER_SIZE;
			hWidth-=( self.toInt($ui_hSlider.outerWidth())-self.toInt($ui_hSlider.width()) );

			$ui_hScrollbar.width(hScrollbarSize);

			this.hMax=hScrollbarSize-hWidth;

			$ui_hSlider.width(hWidth);
			this.hWidth=hWidth;

			this.hRatio=(hContentsSize>0) ? -(hScrollbarSize/hContentsSize) : 0;

			if(options.fade) {
				$ui_vScrollbar.hide();
				$ui_hScrollbar.hide();
			}
			else {
				if($this.isVisible()) {
					if(options.vertical) $ui_vScrollbar.show();
					if(options.horizontal) $ui_hScrollbar.show();
				}
				else {
					if(options.vertical) $ui_vScrollbar.hide();
					if(options.horizontal) $ui_hScrollbar.hide();
				}
				if(options.vertical) {
					if(vContentsSize<1) $ui_vScrollbar.hide();
				}
				if(options.horizontal) {
					if(hContentsSize<1) $ui_hScrollbar.hide();
				}
			}

			$.each(layout, function(key, value) {
				if($this.css(key)!==layout[key]) {
					$ui_wrapper.css(key,  $this.css(key));
					$this.css(key, layout[key]);
				}
			});

			this.sync();

			return this;
		},

		refresh: function() {
			var css3Fade=this.css3Fade;
			if(this.$headerCss) {
				this.$ui_vScrollbar.removeClass(css3Fade.fadeIn).removeClass(css3Fade.fadeOut);
				this.$ui_hScrollbar.removeClass(css3Fade.fadeIn).removeClass(css3Fade.fadeOut);
			}
			else {
				this.$ui_vScrollbar.stop(true, true);
				this.$ui_hScrollbar.stop(true, true);
			}
			this.stopTimer();
			this.init();
			return this;
		},

		sync: function() {
			var $ui_vSlider = this.$ui_vSlider,
				$ui_hSlider = this.$ui_hSlider,
				options = this.options,
				vRatio = this.vRatio,
				vHeight = this.vHeight,
				vMax = this.vMax,
				hRatio = this.hRatio,
				hWidth = this.hWidth,
				hMax = this.hMax,
				position=this.$contents.position(),
				_transform= this.transform;

			if(options.vertical) {

				var vertical= position.top*vRatio;
				if(vertical<0) {
					vHeight+=vertical;
					vertical=0;
				}
				else if(vertical>vMax) {
					var overSize=vertical-vMax;
					if(vHeight>overSize)
						vHeight-=overSize;
					else
						vertical=vMax;
				}
				if(vHeight<1) vHeight=1;
				$ui_vSlider.height(vHeight);
				if(options.useCssTansform) {
					$ui_vSlider.css(_transform, 'translateY('+vertical+'px)');
				}
				else {
					$ui_vSlider.css({'margin-top': vertical});
				}
			}

			if(options.horizontal) {

				var horizontal= position.left*hRatio;
				if(horizontal<0) {
					hWidth+=horizontal;
					horizontal=0;
				}
				else if(horizontal>hMax) {
					var overSize=horizontal-hMax;
					if(hWidth>overSize)
						hWidth-=overSize;
					else
						horizontal=hMax;
				}
				if(hWidth<1) hWidth=1;
				$ui_hSlider.width(hWidth);
				if(options.useCssTansform) {
					$ui_hSlider.css(_transform, 'translateX('+horizontal+'px)');
				}
				else {
					$ui_hSlider.css({'margin-left': horizontal});
				}
			}

			return this;
		},

		complete: function() {
			var $ui_vScrollbar = this.$ui_vScrollbar,
				$ui_hScrollbar = this.$ui_hScrollbar,
				options = this.options,
				css3Fade=this.css3Fade;

			this.touch=false;
			this.flick=false;
			this.stopTimer();
			this.sync();
			if(options.fade) {
				if(this.$headerCss) {
					if(options.vertical) $ui_vScrollbar.removeClass(css3Fade.fadeIn).addClass(css3Fade.fadeOut);
					if(options.horizontal) $ui_hScrollbar.removeClass(css3Fade.fadeIn).addClass(css3Fade.fadeOut);
				}
				else {
					if( $ui_vScrollbar.isVisible() ) $ui_vScrollbar.stop(true, true).fadeOut(options.fadeOut);
					if( $ui_hScrollbar.isVisible() ) $ui_hScrollbar.stop(true, true).fadeOut(options.fadeOut);
				}
			}

			return this;
		},

		watch: function( parm ) {
			var self=this;
			var defaults = {
				visible: false,
			};
			var $this = this.$this,
				$contents = this.$contents,
				options = $.extend({}, defaults, parm || {});

			this.stopTimer();
			if(options.visible) {
				$this.trigger('scrollStart');
				self.scrollStart();
			}

			this.watcher=setTimeout( function () {
				try { clearInterval( self.timer ); } catch ( e ) {}
				self.timer = null;

				$this.trigger('watchTimeout');
			}, this.options.timeout );

			var elapsedTime=0;
			var prevTop=null;
			var prevLeft=null;

			this.timer = setInterval(function() {
				elapsedTime+=self.options.interval;
				var position=$contents.position();

				if(self.options.vertical) {
					if( prevTop!=position.top) {
						prevTop=position.top;
						elapsedTime=0;
					}
				}

				if(self.options.horizontal) {
					if( prevLeft!=position.left) {
						prevLeft=position.left;
						elapsedTime=0;
					}
				}

				if(elapsedTime>=self.options.watch) {
					try { clearInterval( self.watcher ); } catch ( e ) {}
					self.watcher = null;
					$this.trigger('scrollStop');
				}

				self.sync();
			}, this.options.interval );

			return this;
		},

		enable: function() {
			var self = this,
				$this = this.$this,
				namespace = '.'+this.prefix;

			$(window).bind('unload'+namespace+__flickScrollbar_uid, function(event) {
				self.destroy();

			});

			$this.bind('touchstart'+namespace+' mousedown'+namespace, function(event) {

				if (event.type === 'touchstart' && event.originalEvent.touches.length > 1) return;

				self.touch=true;

			}).bind('touchmove'+namespace+' mousemove'+namespace, function(event) {

				if (event.type === 'touchmove' && event.originalEvent.touches.length > 1) return;

				if(self.touch) {
					self.touch=false;
					self.flick=true;
					self.stopTimer();
					$this.trigger('scrollStart');
					self.scrollStart();
				}
				if(self.flick) {
					self.sync();
				}
			}).bind('touchend'+namespace+' mouseup'+namespace+' mouseleave'+namespace, function(event) {

				self.touch=false;
				if(self.flick) {
					self.flick=false;

					self.watch();
				}

			}).bind('scrollStop'+namespace+' watchTimeout'+namespace, function() {
				self.complete();
				$this.trigger('processCompleted');
			});

			this.disabled=false;
			this.sync();

			return this;
		},

		disable: function() {
			var $this = this.$this,
				namespace = '.'+this.prefix;

			this.sync();
			this.stopTimer();
			this.disabled=true;

			$this.unbind(namespace);
			$(window).unbind(namespace);

			return this;
		},

		show: function() {
			var css3Fade=this.css3Fade;
			if(this.$headerCss) {
				if(this.options.vertical) this.$ui_vScrollbar.removeClass(css3Fade.fadeIn).removeClass(css3Fade.fadeOut).show();
				if(this.options.horizontal) this.$ui_hScrollbar.removeClass(css3Fade.fadeIn).removeClass(css3Fade.fadeOut).show();
			}
			else {
				if(this.options.vertical) this.$ui_vScrollbar.stop(true, true).show();
				if(this.options.horizontal) this.$ui_hScrollbar.stop(true, true).show();
			}
			return this;
		},

		hide: function() {
			var css3Fade=this.css3Fade;
			if(this.$headerCss) {
				if(this.options.vertical) this.$ui_vScrollbar.removeClass(css3Fade.fadeIn).removeClass(css3Fade.fadeOut).hide();
				if(this.options.horizontal) this.$ui_hScrollbar.removeClass(css3Fade.fadeIn).removeClass(css3Fade.fadeOut).hide();
			}
			else {
				if(this.options.vertical) this.$ui_vScrollbar.stop(true, true).hide();
				if(this.options.horizontal) this.$ui_hScrollbar.stop(true, true).hide();
			}
			return this;
		},

		destroy: function() {
			var $this = this.$this,
				$ui_wrapper = this.$ui_wrapper,
				$ui_vScrollbar = this.$ui_vScrollbar,
				$ui_hScrollbar = this.$ui_hScrollbar,
				namespace = '.'+this.prefix;

			this.stopTimer();

			$this.unbind(namespace);
			$(window).unbind(namespace+__flickScrollbar_uid);

			if($ui_vScrollbar) $ui_vScrollbar.remove();
			if($ui_hScrollbar) $ui_hScrollbar.remove();
			if(this.$headerCss) this.$headerCss.remove();
			if($ui_wrapper) $this.unwrap();
			$ui_vScrollbar=$ui_vSlider=$ui_hScrollbar=$ui_hSlider=$ui_wrapper=undefined;
			$this.attr('style', this.orignStyle);

			return this;
		},

		stopTimer: function() {
			try { clearInterval( this.timer ); } catch ( e ) {}
			try { clearTimeout( this.watcher ); } catch ( e ) {}
			this.timer=this.watcher=null;

			return this;
		},

		scrollStart: function() {
			var $ui_vScrollbar = this.$ui_vScrollbar,
				$ui_hScrollbar = this.$ui_hScrollbar,
				options = this.options,
				css3Fade = this.css3Fade;

			if(options.fade) {
				if(this.$headerCss) {
					if(options.vertical) $ui_vScrollbar.removeClass(css3Fade.fadeOut).addClass(css3Fade.fadeIn).show();
					if(options.horizontal) $ui_hScrollbar.removeClass(css3Fade.fadeOut).addClass(css3Fade.fadeIn).show();
				}
				else {
					if(options.vertical) $ui_vScrollbar.stop(true, true).fadeIn(options.fadeIn);
					if(options.horizontal) $ui_hScrollbar.stop(true, true).fadeIn(options.fadeIn);
				}
			}
			return this;
		},

		scrollstop: function() {
			this.$this.trigger('scrollStop');
			return this;
		},
		option: function(key, value) {
			var self = this;
			var options = key;

			if (arguments.length === 0) {
				return $.extend({}, this.options);
			}

			if (typeof key === "string") {
				if (value === undefined) {
					return this.options[key];
				}
				options = {};
				options[key] = value;
			}

			$.each(options, function(key, value) {
				self.setOption(key, value);
			});

			return this;
		},
		setOption: function(key, value) {
			this.options[key] = value;
		},
		toInt: function(values) {
			if (values === undefined) return 0;
			if( isFinite( values ) ) return values;
			var val = parseInt(values.replace("px", ""), 10);
			return ( isFinite( val ) ) ? val : 0;
		}

	};

	flickScrollbar.prototype.create.prototype = flickScrollbar.prototype;

	//! jQuery visibility test
	$.fn.isVisible = function() {
		return $.expr.filters.visible(this[0]);
	};

})(jQuery);
