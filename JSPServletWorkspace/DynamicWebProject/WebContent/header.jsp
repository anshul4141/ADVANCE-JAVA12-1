<%@page import="com.rays.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		UserBean user = (UserBean) session.getAttribute("user");
	%>

	<%
		if (user != null) {
	%>
	<a href="LoginCtl?operation=logout">logout</a> |
	<a href="UserCtl">AddUser</a> |
	<a href="UserListCtl">UserList</a> |
	<%
		} else {
	%>
	<a href="UserRegistrationCtl">SignUp</a> |
	<a href="LoginCtl">login</a>
	<%
		}
	%>


	<hr>
</body>
</html>