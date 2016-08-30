<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ramesh RadioTaxi Service</title>
</head>
<body>
<%@ include file="resources/header.html" %>
<div>
<% if(session.getAttribute("Message")!=null){
	out.print(session.getAttribute("Message"));
	session.setAttribute("Message", null);
}%>
</div>

<form action="NewUser.jsp">
<div id="register">
  <input type="submit" value="Register">
</div>
</form>
<div id="login">
<%@ include file="LoginForm.html" %>
</div>
</body>
</html>