<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
				<form class="form-horizontal" role="form" action="docAction!allDocSearch.action">
					<div class="form-group">
						<div class="col-sm-8">
							<input type="text" class="form-inline" id="search-doc" name="search.condition"/>
							<button for="search-doc" type="submit" class="btn btn-primary">搜索文档</button>
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
							<th>文件名</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator var="temp" value="docList">
							<tr>
								<td>
									<s:a href="download.action?fname=%{doc_name}" name="fname">
										<s:property value="#temp.doc_title" />
									</s:a>
								</td>
								<td><s:property value="#temp.uploader" /></td>
								<td><s:property value="#temp.upload_time" /></td>
								<td><s:property value="#temp.down_integral" /></td>
								<td><s:property value="#temp.doc_type" /></td>
								<td><s:property value="#temp.down_count" /></td>
								<td><s:property value="#temp.doc_name" /></td>
							</tr>
						</s:iterator>
					</tbody>
				</table>
				<div class="pagination pagination-centered ">
				<s:if test="docList.size()>0">
					<ul style="text-align: center">
						<li style="display: inline"><a
							href="BusineServlet?operator=cardTakeSelection&option=skip&page=prev">
								上一页&nbsp; </a></li>
						<li style="display: inline"><a
							href="BusineServlet?operator=cardTakeSelection&option=skip&page=next">
								&nbsp;下一页 </a></li>
					</ul>
				</s:if>
				</div>
			</div>
			<div class="col-md-2 column"></div>
		</div>
	</div>

</body>
</html>