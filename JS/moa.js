function IDandPassPlease(){
	if (document.getElementById('ID').value='学籍番号記入'){
		document.getElementById('ID').value='';
	}
	
};

//hoverside
$(".Side").hover(function(){
	$(this).css('opacity','0.5');	
},function(){
	$(this).css('opacity','1.0');
})

//hoveropacitychange
function opacity(selector){
	$(selector).hover(function(){
	$(this).css('opacity','0.6');	
},function(){
	$(this).css('opacity','1.0');
})
}
//hoverimg
function imgchange(selector,imgfoldername,imgtype){
	$(selector).hover(function(){
	$(this).attr('src','../img/button/'+imgfoldername+'/'+imgtype+'2-2.png');
},function(){
	$(this).attr('src','../img/button/'+imgfoldername+'/'+imgtype+'2-1.png');
})
}

//clickslide
function clickslide(clicker, subject){
	$(clicker).click(function(){
	$(subject).slideToggle(200,function(){
		
	})
})
}



//define hoverfunc
function hoverarea(i){
	$("#area"+i).hover(function(){
	$('#area'+i).attr('src','../img/wm/area'+i+'-2.png')},function(){
	$('#area'+i).attr('src','../img/wm/area'+i+'-1.png')}
);
}


function hoveruniA(i){
	$("#uniA"+i).hover(function(){
	$('#uniA'+i).attr('src','../img/wm/icon.png')},function(){
	$('#uniA'+i).attr('src','../img/wm/uniA'+i+'.png')}
);
}
