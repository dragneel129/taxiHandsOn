<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book a Cab</title>
</head>
<body>
<%@ include file="resources/insideHeader.html" %>
<table>
  <tr>
    <td><label>Name of Passenger</label></td>
    <td><input type="text" name="pasName" id="pasName"></td>
  </tr>
  <tr>
    <td><label>Telephone</label></td>
    <td><input type="number" name="telephone" id="telephone" ></td>
  </tr>
  <tr>
    <td><label>Booking type</label></td>
    <td><select name="bookingType" id="bookingType">
    <option value="type1">type 1</option>
    <option value="type2">type 2</option>
    <option value="type3">type 3</option>
    <option value="type4">type 4</option>
    
    </select></td>
  </tr>
  <tr>
    <td><label>Pickup Place</label></td>
    <td><input type="text" name="pickPlace" id="pickPlace"></td>
  </tr>
    <tr>
    <td><label>Drop Place</label></td>
    <td><input type="text" name="dropPlace" id="dropPlace"></td>
  </tr>
    <tr>
    <td><input type="reset" value="Reset"></td>
    <td><input type="submit" value="BookNow" id="pickPlace"></td>
  </tr>
  

</table>

</body>
</html>