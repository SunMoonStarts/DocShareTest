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
<title>上传文档</title>
<script type="text/javascript" src="js/jquery-min.js"></script>
<link rel="stylesheet" style="text/css" href="css/font-awesome.css" />
<link rel="stylesheet" style="text/css" href="css/bootstrap.css" />
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<script type="text/javascript" src="js/up-load.js"></script>


</head>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<!-- <form class="form-horizontal"> -->
					<div class="control-group">
						<label class="control-label" for="doc-title">文档标题</label>
						<div class="controls">
							<input id="doc-title" type="text" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">文档简介</label>
						<div class="controls">
							<textarea class="form-control" rows="4"></textarea>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="">请选择上传文档</label>
						<s:form action="upload" theme="simple"
							enctype="multipart/form-data" method="post">
							<table class="table table-bordered table-hover">
								<tr>
									<td>file</td>
									<td id="more">
										<input type="file" name="myfiles" id="upload-doc"/>  <%-- <s:file
											name="myfile"> </s:file>--%><input type="button"
										value="Add More.." onclick="addMore()">
									</td>
									<td><s:reset value=" reset "></s:reset></td>
								</tr>
								<!--  <tr>
									<td><button type="submit" class="btn btn-info">提交</button></td>
								</tr>  -->
							</table>

						</s:form>

					</div>
					<div class="control-group">
						<label class="control-label" for="">下载积分</label> <input
							type="text" />
					</div>
					<div class="control-group">
						<div class="controls">
							<button type="submit" class="btn btn-primary">提交</button>
							<button type="submit" class="btn btn-default">返回</button>
						</div>
					</div>
				<!-- </form> -->
				<%-- <s:form action="upload" theme="simple" enctype="multipart/form-data">

					<table align="center" width="50%" border="1">

						<tr>
							<td>file</td>

							<td id="more">
								<!-- <input type="file" name="myfiles"/> --> <s:file
									name="myfile"></s:file><input type="button" value="Add More.."
								onclick="addMore()">
							</td>
						</tr>

						<tr>
							<td><s:submit value=" submit "></s:submit></td>

							<td><s:reset value=" reset "></s:reset></td>
						</tr>
					</table>

				</s:form> --%>
			</div>
		</div>
	</div>



</body>
</html>