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
<%@page import="com.iyeedo.model.*"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<title>个人资料</title>
</head>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
	response.setCharacterEncoding("UTF-8");
%>
<body>
	<form action="update" method="post">
	<s:hidden value="%{#session.user.id}" name="user.id"/>
		<table border="1px">
			<tr>
				<td><s:textfield value="%{#session.user.userName}" label="用户名"
						name="user.userName"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.nickName}" label="昵称"
						name="user.nickName"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.psw}" label="密码"
						name="user.psw"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.trueName}" label="真实姓名"
						name="user.trueName"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.sex}" label="性别"
						name="user.sex"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.country}" label="国家"
						name="user.country"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.province}" label="省份"
						name="user.province"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.city}" label="城市"
						name="user.city"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.region}" label="区"
						name="user.region"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.mobile}" label="手机号码"
						name="user.mobile"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.IDCard1}" label="证件号1"
						name="user.IDCard1"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.IDCard2}" label="证件号2"
						name="user.IDCard2"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.IDCard3}" label="证件号3"
						name="user.IDCard3"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.birthday}" label="生日"
						name="user.birthday"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.createTime}"
						label="注册时间" name="user.createTime"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.updateTime}"
						label="最后一次更新时间" name="user.updateTime"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.userStatus}"
						label="账号状态" name="user.userStatus"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.type}" label="账号类型"
						name="user.type"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield value="%{#session.user.gold}" label="金币"
						name="user.gold"></s:textfield></td>
			</tr>
			<tr>
				<td><input type="submit" value="保存资料"></td>
				<td><a href="index.jsp">返回首页</a></td>
			</tr>

		</table>
	</form>
</body>
</html>