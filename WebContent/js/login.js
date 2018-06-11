/**
 * 登录
 */

$(function(){
	
	$("#vertify-code").click(function(){
		var vc=$("#vertify-code").attr("src");
		
		$("#vertify-code").attr("src",vc+"?nocache="+new Date().getTime());
		
	});
});
