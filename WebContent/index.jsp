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
<%@ page language="java" import="com.iyeedo.model.*" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="icon" href="res/image/logo.ico" type="image/x-icon" />
<link rel="shortcut icon" href="res/image/logo.ico" type="image/x-icon" />
<title>Insert title here</title>
</head>
<% 
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
	User user = (User)session.getAttribute("user");
	String userName = "";
	if(user != null)
		userName = user.getUserName();
%>
<body onload="getUserName()">
	<h1>this is index.jsp page</h1>
	<a href="login.jsp">登陆</a>
	<a href="#">注册</a>
	
	<h1>当前登录用户为:${userName}</h1>
	<h1>session 取得 <%= userName %></h1>
</body>

</html>