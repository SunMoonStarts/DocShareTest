/**
 * 注册
 */

$(function(){
	
	var flag=$("#regi-flag").val();
	switch(flag){
	case "register-same-error":
		alert("该用户名已存在");
		break;
	case "register-insert-error":
		alert("添加错误");
		break;
	case "register-success":
		alert("注册成功");
		break;	
	}
	//json判断用户名
	
	
	
	//用户名register
	$('#register').click(function(e){
		e.preventDefault();
		
		var uname=$('#register_form input').eq(0).val(); //用户名
		var pwd=$('#register_form input').eq(1).val();
		var conpwd=$('#register_form input').eq(2).val();
		var tele=$('#register_form input').eq(3).val(); //电话
		var email=$('#register_form input').eq(4).val();  //邮箱
		
		if(uname.length<=0 || pwd.length<=0 || conpwd.length<=0 || tele.length<=0){
			alert("输入有误,不能输入为空!");
			return;
		}
		
		if(pwd != conpwd){
			alert("两次输入的不一致!");
			return;
		}
		
		$('#register_form').submit();   //提交
		
	});
	
	
	
});




