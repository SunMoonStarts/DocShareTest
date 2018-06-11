<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<!-- 为页面上的所有链接规定默认地址或默认目标 -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台登录界面</title>

<script type="text/javascript" src="js/jquery-min.js"></script>
<link rel="stylesheet" style="text/css" href="css/bootstrap.css" />
<link rel="stylesheet" style="text/css" href="css/font-awesome.css" />
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<link rel="stylesheet" style="text/css" href="css/admin-login.css" />
<script type="text/javascript" src="js/admin-login.js"></script>

</head>
<body class="my-login-page">
	<section class="h-100">
	<div class="container h-100">
		<div class="row justify-content-md-center h-100">
			<div class="card-wrapper">
				<div class="brand">
					<img src="images/logo.jpg">
				</div>
				<div class="card fat">
					<div class="card-body">
						<h4 class="card-title">Admin-Login</h4>
						<form method="POST" action="login!adminLogin.action">

							<div class="form-group">
								<label for="username">用户名</label> <input id="username"
									type="text" class="form-control" name="username" value=""
									required autofocus>
							</div>
							<div class="form-group">
								<label for="password">密码 <a href="forgot.html"
									class="float-right"> Forgot Password? </a>
								</label> <input id="password" type="password" class="form-control"
									name="password" required data-eye>
							</div>

							<div class="form-group">
								<label> <input type="checkbox" name="remember">
									Remember Me
								</label>
							</div>

							<div class="form-group no-margin">
								<button type="submit" class="btn btn-primary btn-block" id="admin-login">
									登录</button>
							</div>
							<div class="margin-top20 text-center">
								Don't have an account? <a href="register.html">Create One</a>
							</div>
						</form>
					</div>
				</div>
				<div class="footer"></div>
			</div>
		</div>
	</div>
	</section>


</body>
</html>