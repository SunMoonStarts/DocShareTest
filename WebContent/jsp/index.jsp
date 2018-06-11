<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<!-- 为页面上的所有链接规定默认地址或默认目标 -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<script type="text/javascript" src="js/jquery-min.js"></script>
<link rel="stylesheet" style="text/css" href="css/font-awesome.css" />
<link rel="stylesheet" style="text/css" href="css/bootstrap.css" />
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<link rel="stylesheet" style="text/css" href="css/index.css" />
<script type="text/javascript" src="js/index.js"></script>
</head>
<body>
	<input class="base-path" type="hidden" name="<%=basePath%>"> 
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="col-md-2 column"></div>
				<div class="col-md-8 column">
					<h4 class="text-left">
						欢迎您:
						<c:out value="${user.user_name}"></c:out>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;当前积分:
						<c:out value="${user.integral.total_integral}"></c:out>
						&nbsp;&nbsp;&nbsp;
					</h4>
					<div class="col-md-12 column user-opera text-right">
						<button class="btn btn-default" type="submit" id='user-info'
							data-toggle="modal" data-target="#user-info-modal">个人信息</button>
						<button class="btn btn-default" type="button" id='my-doc'>我的文档</button>
						<button class="btn btn-default" type="button" id='up-load' name="up-load">我要上传</button>
						<button class="btn btn-default" type="button" id='down-load'>我要下载</button>
						<button class="btn btn-default" type="button" id="register" >注册</button>
						<button class="btn btn-default" type="button" id='exit'
							data-toggle="modal" data-target="#user-exit-modal">退出</button>
					</div>
				</div>
				<div class="col-md-2 column"></div>
			</div>
			<p class="bg-info">...</p>
			<div class="col-md-12 column">
				<div class="row clearfix">
					<div class="col-md-1 column"></div>
					<div class="col-md-10 column">
						<iframe class="center-block" src="skip/skipAllDocAction!skipPage.action?type=allDoc">
							
						</iframe>
					</div>
					<div class="col-md-1 column"></div>
				</div>
			</div>
		</div>
	</div>
	<!-- 退出提示--模态框--弹窗 -->
	<div class="modal fade" id="user-exit-modal" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">退出请示</h4>
				</div>
				<div class="modal-body">
					<p>是否确定退出系统？&hellip;</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default user-exit">确定</button>
					<button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
	</div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="user-info-modal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="modal-title" id="myModalLabel">个人信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id='user-info-form'>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">用户名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" placeholder="用户名" disabled
									value="${user.user_name}">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">性别</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" placeholder="性别" disabled
									value="${user.sex}">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">学历</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" placeholder="学历" disabled
									value="${user.education}">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">职业</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" placeholder="职业" disabled
									value="${user.profession}">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">电话</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" placeholder="电话" disabled
									value="${user.tele}">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">邮箱</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" placeholder="邮箱" disabled
									value="${user.email}">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="button" class="btn btn-primary"
									data-dismiss="modal">返回</button>
							</div>
						</div>
					</form>
				</div>

			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
</body>
</html>