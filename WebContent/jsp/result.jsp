<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>My JSP 'index.jsp' starting page</title>
	</head>

	<body>

		myfile:
		<s:iterator id="f" value="#request.myfileFileName">
		 	${f }<br/>
		</s:iterator>
		
		<br>
	</body>
</html>
