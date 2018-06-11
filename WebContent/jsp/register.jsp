<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	Object flag=request.getAttribute("registerFlag");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<!-- 为页面上的所有链接规定默认地址或默认目标 -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
<script type="text/javascript" src="js/jquery-min.js"></script>
<link rel="stylesheet" style="text/css" href="css/font-awesome.css" />
<link rel="stylesheet" style="text/css" href="css/bootstrap.css" />
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<link rel="stylesheet" style="text/css" href="css/register.css" />
<script type="text/javascript" src="js/register.js"></script>

</head>
<body>

	<div class="container">
		<div class="form row">
			<input type="hidden" value="<%=flag %>" id="regi-flag"/>
			<form class="form-horizontal col-sm-offset-3 col-md-offset-3"
				id="register_form" action="userAction!register.action" method="post">
				<h3 class="form-title">Register Account</h3>
				<div class="col-sm-9 col-md-9">
					<div class="form-group">
						<i class="fa fa-user fa-lg"></i> <input
							class="form-control required" type="text" placeholder="用户名"
							name="user.user_name" autofocus="autofocus" maxlength="20" />
					</div>
					<div class="form-group">
						<i class="fa fa-lock fa-lg"></i> <input
							class="form-control required" type="password"
							placeholder="密码" name="user.user_pwd" maxlength="8" />
					</div>
					<div class="form-group">
						<i class="fa fa-lock fa-lg"></i> <input
							class="form-control required" type="password"
							placeholder="确认密码" name="confirm_password" maxlength="8" />
					</div>
					<!-- <div class="form-group">
						<i class="fa fa-lock fa-lg"></i> <input
							class="form-control required" type="password"
							placeholder="职业" name="profession" maxlength="8" />
					</div> -->
					<div class="form-group">
						  <select class="form-control" name="user.sex"> 
						 		<option>性别</option>
								<option>男</option>
								<option>女</option>
						 </select>
						 <select class="form-control" name="user.education"> 
						 		<option>学历</option>
								<option>本科</option>
								<option>硕博</option>
								<option>专科</option>
						 </select>
						  <select class="form-control" name="user.profession"> 
						 		<option>职业</option>
								<option>Java工程师</option>
								<option>设计师</option>
								<option>架构师</option>
						 </select>
					</div>
					<div class="form-group">
						<i class="fa fa-lock fa-lg"></i> <input
							class="form-control required" type="number"
							placeholder="手机号" name="user.tele" maxlength="8" />
					</div>
					<div class="form-group">
						<i class="fa fa-lock fa-lg"></i> <input
							class="form-control required" type="email"
							placeholder="邮箱" name="user.email" maxlength="18" />
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-success pull-left" id='register'
							value="Register " />
						<input type="submit" class="btn btn-success pull-right"
							value="Login " />
					</div>
				</div>
			</form>
		</div>
	</div>

</body>
</html>
</body>
</html>