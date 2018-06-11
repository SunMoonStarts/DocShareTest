<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ognl测试</title>
</head>
<body>
	
	用户名：<s:property value="user.user_name" />
	<s:property value="map.我是key" />
	<s:property value="list[0]" />
	<s:property value="list[1]" />

</body>
</html>