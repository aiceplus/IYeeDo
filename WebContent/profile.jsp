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
<%@page import="com.iyeedo.model.*" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<title>Insert title here</title>
</head>
<% 
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
	User user = (User)session.getAttribute("user");
	if(user == null){
		request.getRequestDispatcher("error.jsp").forward(request, response);
	}
%>
<body>
	<table>
		<tr>
			<td>用户名：</td><td><%=user.getUserName() %></td>
		</tr>
		<tr>
			<td>昵称：</td><td><%=user.getNickName() %></td>
		</tr>
		<tr>
			<td>真实姓名：</td><td><%=user.getTrueName() %></td>
		</tr>
		<tr>
			<td>性别：</td><td><%=user.getSex() %></td>
		</tr>
		<tr>
			<td>国家：</td><td><%=user.getCountry() %></td>
		</tr>
		<tr>
			<td>省份：</td><td><%=user.getProvince() %></td>
		</tr>
		<tr>
			<td>城市：</td><td><%=user.getCity() %></td>
		</tr>
		<tr>
			<td>区：</td><td><%=user.getRegion() %></td>
		</tr>
		<tr>
			<td>手机号码：</td><td><%=user.getMobile() %></td>
		</tr>
		<tr>
			<td>证件号1：</td><td><%=user.getIDCard1() %></td>
		</tr>
		<tr>
			<td>证件号2：</td><td><%=user.getIDCard2() %></td>
		</tr>
		<tr>
			<td>证件号3：</td><td><%=user.getIDCard3() %></td>
		</tr>
		<tr>
			<td>生日：</td><td><%=user.getBirthday() %></td>
		</tr>
		<tr>
			<td>注册时间：</td><td><%=user.getCreateTime() %></td>
		</tr>
		<tr>
			<td>最后一次更新时间：</td><td><%=user.getUpdateTime() %></td>
		</tr>
		<tr>
			<td>账号状态：</td><td><%=user.getUserStatus() %></td>
		</tr>
		<tr>
			<td>账号类型</td><td><%=user.getType() %></td>
		</tr>
		<tr>
			<td>金币：</td><td><%=user.getGold() %></td>
		</tr>
		<tr>
			<td><a href="#">修改资料</a></td><td><a href="index.jsp">返回首页</a></td>
		</tr>
	</table>
</body>
</html>