/**
 *  主页
 */

$(function(){
	
	var bathPath=$(".base-path").attr("name");
	var iframe=$("iframe");
	//注册
	$("#register").click(function(){
		
		var url="register!skip.action";
		window.location.href=bathPath+url;
	});
	
	//我的文档
	$("#my-doc").click(function(){
		var url="skip/skipAllDocAction!skipPage.action?type=myDoc";
		iframe.attr("src",bathPath+url);
		
	});
	
	//我要上传文档页面
	$("#up-load").click(function(){
		var url="skip/skipAllDocAction!skipPage.action?type=uploadDoc";
		iframe.attr("src",bathPath+url);
		
	});
});

