<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

<script type="text/javascript" src="js/my-doc.js"></script>
</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<p class="bg-primary">   </p>
			<p class="bg-primary">   </p>
			<div class="col-md-12 column">
				<form class="form-horizontal" role="form"
					action="docAction!myDocSearch.action">
					<div class="form-group">
						<label for="start-time" class="control-label">注册时间&nbsp;</label> <input
							type="date" class="form-inline" id="start-time"
							name="search.startTime" /> <label for="end-time"
							class="control-label">至</label> <input type="date"
							class="form-inline" id="end-time" name="search.endTime" />
					</div>
					<div class="form-group">
						<label for="" class="control-label">用户名&nbsp;</label> <input
							type="text" class="form-inline" id="user_name"
							name="search.uploader"/>
						<button type="submit" class="btn btn-primary">查询</button>
					</div>
				</form>
				<p></p>
				<table class="table table-bordered table-hover">
					<thead>
						<s:if test="userList.size()>0">
							<tr>
								<th>用户名</th>
								<th>注册时间</th>
								<th>积分</th>
								<th>上传文档数</th>
								<th>下载文档数</th>
								<th>用户状态</th>
							</tr>
						</s:if>
					</thead>
					<tbody>
						<s:iterator var="temp" value="userList">
							<tr>
								<td><s:property value="#temp.doc_title" /></td>
								<td><s:property value="#temp.upload_time" /></td>
								<td><s:property value="#temp.down_integral" /></td>
								<td><s:property value="#temp.doc_type" /></td>
								<td><s:property value="#temp.state" /></td>
							</tr>
						</s:iterator>
					</tbody>
				</table>
				<div class="pagination pagination-centered ">
					<ul style="text-align: center">
						<s:if test="userList.size()>0">
							<li style="display: inline"><a
								href="BusineServlet?operator=cardTakeSelection&option=skip&page=prev">
									上一页&nbsp; </a></li>
							<li style="display: inline"><a
								href="BusineServlet?operator=cardTakeSelection&option=skip&page=next">
									&nbsp;下一页 </a></li>
						</s:if>
					</ul>
				</div>
			</div>

		</div>
	</div>
</body>
</html>