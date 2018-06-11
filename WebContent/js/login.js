/**
 * 登录
 */

$(function(){
	
	var flag=$("#login-flag").val();
	switch(flag){
	case "code-error":
		alert("验证码输入错误");
		break;
	case "login-member-fail":
		alert("用户名或密码输入错误");
		break;
	case "login-member-success":
		alert("登录成功");
		break;	
	}
	
	
	$("#vertify-code").click(function(){
		var vc=$("#vertify-code").attr("src");
		
		$("#vertify-code").attr("src",vc+"?nocache="+new Date().getTime());
		
	});
});
