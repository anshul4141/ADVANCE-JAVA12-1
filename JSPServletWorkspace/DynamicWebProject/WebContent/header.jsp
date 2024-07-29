<%@ page import="com.rays.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
   <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <title>Insert title here</title>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="index.jsp">Home</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <%
                    UserBean user = (UserBean) session.getAttribute("user");
                    String welcomeMsg = "Hi, ";
                    if (user != null) {
                %>
                <li class="nav-item">
                    <a class="nav-link"><%= welcomeMsg + user.getFirstName() + " " + user.getLastName() %></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="LoginCtl?operation=logout">Logout</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="UserCtl.do">Add User</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="UserListCtl.do">User List</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="MarksheetCtl.do">Add Marksheet</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="MarksheetListCtl.do">Marksheet List</a>
                </li>
                <%
                    } else {
                %>
                <li class="nav-item">
                    <a class="nav-link"><%= welcomeMsg + "Guest" %></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="UserRegistrationCtl">Sign Up</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="LoginCtl">Login</a>
                </li>
                <%
                    }
                %>
            </ul>
        </div>
    </nav>
</body>
</html>
