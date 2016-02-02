<!--
	***************
	@auto aice
	***************
	copyright 2015
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@taglib prefix="s" uri="/struts-tags" %>
<title>Insert title here</title>
</head>
<% 
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<body>
	<form action="regist" method="post">
		<s:textfield name="user.userName" label="用户名" /><br />
		<s:textfield name="user.nickName" label="昵称" /><br />
		<s:textfield name="user.trueName" label="真实姓名" /><br />
		<s:textfield name="user.psw" label="密码" /><br />
<%-- 		<s:textfield name="user.userStatus" label="用户状态" /><br /> --%>
<%-- 		<s:textfield name="user.type" label="账号类型" /><br /> --%>
		<input type="submit" value="注册" />
	</form>
</body>
</html>