<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Weather Station</title>
</head>
<body>
<p><font color ="red">${errorMessage}</font></p> 
<center>
Login page
</center>
<form action="/login" method="post">
<center><br><b>Name:<input type="text" name="name"/></b></br>
<br><b>Password:<input type="password" name="password"></b></br>
<br><input type="submit" type="login"></br></center>
</form>
</body>
</html>