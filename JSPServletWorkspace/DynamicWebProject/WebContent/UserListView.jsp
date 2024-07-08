<%@page import="com.rays.bean.UserBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<form action="">

		<%
			List list = (List) request.getAttribute("userlist");
		%>

		<table border="1px">

			<tr>
				<th>Id</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>LoginId</th>
				<th>DOB</th>
				<th>gender</th>
			</tr>

			<%
				Iterator it = list.iterator();
			%>

			<%
				while (it.hasNext()) {
					UserBean bean = (UserBean) it.next();
			%>
			<tr>
				<td><%=bean.getId()%></td>
				<td><%=bean.getFirstName()%></td>
				<td><%=bean.getLastName()%></td>
				<td><%=bean.getLoginId()%></td>
				<td><%=bean.getDob()%></td>
				<td><%=bean.getGender()%></td>
				<%
					}
				%>
			</tr>

		</table>

	</form>

</body>
</html>