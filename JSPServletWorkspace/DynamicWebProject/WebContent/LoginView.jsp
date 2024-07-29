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
	<center>
		<form action="LoginCtl" method="post">
			<%
				String msg = (String) request.getAttribute("msg");
			%>
			<%
				if (msg != null) {
			%>
			<div class="alert alert-danger">
				<%=msg%>
			</div>
			<%
				}
			%>
			<table>
				<tr>
					<th>loginId</th>
					<td><input type="email" name="loginId"
						placeholder="Enter loginId"></td>
				</tr>
				<tr>
					<th>password</th>
					<td><input type="password" name="password"
						placeholder="Enter password"></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" name="operation"
						class="btn btn-primary" value="signIn"></td>
				</tr>
			</table>
		</form>
	</center>
	<%@ include file="footer.jsp"%>

</body>
</html>