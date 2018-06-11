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
<title>搜索所有文档的页面</title>
<script type="text/javascript" src="js/jquery-min.js"></script>
<link rel="stylesheet" style="text/css" href="css/font-awesome.css" />
<link rel="stylesheet" style="text/css" href="css/bootstrap.css" />
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
	<div class="col-md-12 column">
		<div class="row clearfix">
			<div class="col-md-2 column"></div>
			<div class="col-md-8 column">
				<form class="form-horizontal" role="form">
					<div class="form-group">
						<div class="col-sm-8">
							<input type="text" class="form-inline" id="search-doc" />
							<button for="search-doc" type="button" class="btn btn-primary">搜索文档</button>
						</div>
					</div>
				</form>
				<span>搜索结果:</span>
				<table class="table table-bordered table-hover">
					<thead>
						<tr>
							<th>文档标题</th>
							<th>上传人</th>
							<th>上传时间</th>
							<th>下载积分</th>
							<th>文档类型</th>
							<th>下载次数</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>TB - Monthly</td>
							<td>01/04/2012</td>
							<td>Default</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-md-2 column"></div>
		</div>
	</div>

</body>
</html>