<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New User Registration</title>
</head>
<body>
<section>

<form action="AddUserServlet" method="post">
<label>Name :</label><input type="text" name="userName" id="userName"><br>
<label>Email :</label><input type="email" name="email" id="email"><br>
<label>Phone Number :</label><input type="number" name="phoneNumber" id="phoneNumber"><br>
<label>City :</label><input type="text" name="cityName" id="cityName"><br>
<label>PassWord :</label><input type="password" name="passWord" id="passWord"><br>
<input type="submit" value="Register">
</form>
  
</section>

</body>
</html>