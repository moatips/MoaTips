function IDandPassPlease(){
	if (document.getElementById('ID').value='学籍番号記入'){
		document.getElementById('ID').value='';
	}

};

$(".Side").hover(
	function(){
		$(this).css('background-color','#e3fadb');
	},function(){
		$(this).css('background-color','white');

	}
)


//hide in the beginning


//define hoverfunc
function hoverarea(i){
	$("#area"+i).hover(function(){
	$('#area'+i).attr('src','img/wm/area'+i+'-2.png')},function(){
	$('#area'+i).attr('src','img/wm/area'+i+'-1.png')}
);
}


function hoveruniA(i){
	$("#uniA"+i).hover(function(){
	$('#uniA'+i).attr('src','img/wm/icon.png')},function(){
	$('#uniA'+i).attr('src','img/wm/uniA'+i+'.png')}
);
}
