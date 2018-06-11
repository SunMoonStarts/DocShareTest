/**
 * 登录
 */

$(function(){
	
	$("#admin-login").click(function(){
		
		var flag=$("#login-flag").val();
		switch(flag){
		case "login-admin-fail":
			alert("用户名或密码输入错误");
			break;
		case "login-admin-success":
			alert("登录成功");
			break;	
		}
		
	});
});
