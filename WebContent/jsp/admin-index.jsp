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
<title>后台管理首页</title>
<!-- 引入的第三方jar包--JQueryUI   顺序一定   -->
<link rel="stylesheet" style="text/css" href= "css/jquery-ui.css" /> 
<link rel="stylesheet" style="text/css" href="css/jquery-ui.structure.css" /> 
<link rel="stylesheet" style="text/css" href="css/jquery-ui.theme.css" /> 

<script type="text/javascript" src="js/jquery-min.js"></script>
 <script type="text/javascript" src="js/jquery.js"></script> 
<script type="text/javascript" src="js/jquery-ui.js"></script>

<!-- 自己的css/js文件 -->
<link rel="stylesheet" type="text/css" href="css/admin-index.css" />
<script type="text/javascript" src="js/admin-index.js"></script> 
</head>
<body>
	<div class="page">
		<input class="base-path" type="hidden" name="<%=basePath%>"> 
		<div class="header"></div>
		<div class="content">
			<div class="con-left">
				<div id="accordion">
					<h3>用户管理</h3>
					<div>
						<a href="#" name="skip/skipAdminAction!skipUser.action?type=userSelect">用户查询 </a>
						<a href="#" name="skip/skipAdminAction!skipUser.action?type=userMana">用户管理</a>
					</div>
					<h3>文档管理</h3>
					<div>
						<a href="#" name="skip/skipAdminAction!skipPage.action?type=docCheck"> 文档审核</a> 
						<a href="#" name="../MemberManaServlet">文档配置 </a>
					</div>
				</div>
			</div>
			<div class="con-right">
				<div class="con-right-title">
					<div class="navi">
						<!-- 面包削导航 -->
						<a href="#"> 主页  </a>> <a id="sec_menu" href="#"> 用户管理 </a> > <a
							id="third_menu" href="#"> 用户添加 </a>
					</div>
				</div>
				<div class="con-right-page">
					<iframe src='skip/skipAdminAction!skipUser.action?type=userSelect' id='ifrm'> </iframe>
				</div>

			</div>

		</div>
		<div class="footer"></div>
	</div>
</body>
</html>