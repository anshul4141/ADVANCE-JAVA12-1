<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form action="FirstServlet" method="post">

			<h1>FirstJsp</h1>

			<table>

				<tr>
					<th>First Name:</th>
					<td><input type="text" name="firstName"
						placeholder="Enter First Name"></td>
				</tr>
				<tr>
					<th>Last Name:</th>
					<td><input type="text" name="lastName"
						placeholder="Enter Last Name"></td>
				</tr>
				<tr>
					<th>LoginId:</th>
					<td><input type="email" name="loginId"
						placeholder="Enter LoginId"></td>
				</tr>
				<tr>
					<th>Password:</th>
					<td><input type="password" name="password"
						placeholder="Enter Password"></td>
				</tr>
				<tr>
					<th>Dob:</th>
					<td><input type="date" name="dob" placeholder="Enter Dob"></td>
				</tr>
				<tr>
					<th>Gender:</th>
					<td><input type="text" name="gender"
						placeholder="Enter Gender"></td>
				</tr>
				<tr>
					<th>Click:</th>
					<td><input type="submit" name="operation"></td>
				</tr>

			</table>

		</form>
	</center>
</body>
</html>