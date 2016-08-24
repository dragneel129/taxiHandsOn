<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Successful</title>
</head>
<body>
<h1>Welcome</h1>
<p>Your username is :<%= request.getParameter("usrName") %></p><br>
<p>Thank you</p>


</body>
</html>