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
<title>我的页面</title>
<script type="text/javascript" src="js/jquery-min.js"></script>
<link rel="stylesheet" style="text/css" href="css/font-awesome.css" />
<link rel="stylesheet" style="text/css" href="css/bootstrap.css" />
<script type="text/javascript" src="js/bootstrap.min.js"></script>


</head>
<body>
	<div class="container">
		<div class="row clearfix">
				<p class="bg-primary">...</p>
			<div class="col-md-12 column">
				<form class="form-horizontal" role="form">
					<div class="form-group">
						<label for="start-time" class="control-label">上传日期&nbsp;</label>
						<input type="date" class="form-inline" id="start-time" /> 
						<label for="end-time" class="control-label">至</label> <input
							type="date" class="form-inline" id="end-time" />
					</div>
					<div class="form-group">
						<label for="doc-type" class="control-label">文档类型&nbsp;</label>
						<select class="form-inline">
								<option>PPT</option>
								<option>Word</option>
						</select>
						 <label for="check-state" class="control-label">&nbsp;审核状态&nbsp;</label> 
						 <select class="form-inline">
								<option>待审核</option>
								<option>已审核</option>
						</select>
					</div>
					<div class="form-group">
							<button type="submit" class="btn btn-primary btn-lg" >查询</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>