<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Forgot password</title>
</head>
<body>
<font color=red size=5>${MSG}</font>
<form action="./studforgotpwd" method="get">
EnterEmail:<input type="text" name="email"/>
<input type="submit" value="GetPassword">
</form>

</body>
</html>