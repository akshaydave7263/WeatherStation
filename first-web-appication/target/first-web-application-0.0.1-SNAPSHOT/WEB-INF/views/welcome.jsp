<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
welcome ${name} 
<center>
Weather Station Center
</center>
<form action="/welcome" method="post">
<center><br><b>Enter your Zip-code<input type="text" name="Zip-code"/></b></br>
<p><a href="web/resource"> submit</a></p>
</form>

</body>
</html>
