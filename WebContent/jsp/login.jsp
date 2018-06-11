<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
Object flag=request.getAttribute("login");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">   <!-- 为页面上的所有链接规定默认地址或默认目标 -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>

<script type="text/javascript" src="js/jquery-min.js"></script>
<link rel="stylesheet" style="text/css" href="css/bootstrap.css" />
<link rel="stylesheet" style="text/css" href="css/font-awesome.css" />
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<link rel="stylesheet" style="text/css" href="css/login.css" />
<script type="text/javascript" src="js/login.js"></script>


</head>
<body>
	<div class="container">
        <div class="form row">
				<input type="hidden" id="login-flag" value="<%=flag %>" />
	            <form class="form-horizontal col-md-offset-3" id="login_form" action="userAction!login.action?type=member" method="post">
	                <h3 class="form-title">LOGIN</h3>
	                <div class="col-md-9">
	                    <div class="form-group">
	                        <i class="fa fa-user fa-lg"></i>
	                        <input class="form-control required" type="text" placeholder="Username" id="username" name="user.user_name" autofocus="autofocus" maxlength="20"/>
	                    </div>
	                    <div class="form-group">
	                            <i class="fa fa-lock fa-lg"></i>
	                            <input class="form-control required" type="password" placeholder="Password" id="password" name="user.user_pwd" maxlength="8"/>
	                    </div>
	                     <div class="form-group">
	                            <i class="fa fa-lock fa-lg"></i>
	                            <input class="form-control required" type="text" placeholder="验证码"  name="vcode" maxlength="4"/>
	                            <img id="vertify-code" alt="验证码" src="createImage.action"><span><c:out value="${tips}"></c:out></span>
	                    </div>
	                    
	                    <div class="form-group col-md-offset-9">
	                        <button type="submit" class="btn btn-success pull-right" name="submit">登录</button>
	                    </div>
	                </div>
	             </form>  
        </div>
    </div>
	
</body>
</html>