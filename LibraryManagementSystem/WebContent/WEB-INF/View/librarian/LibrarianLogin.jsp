<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LibrarianLogin</title>
</head>
<body>
<h1 text-align="center">Welcome To Librarian Section </h1>
<h3>Login to perform task</h3>
<form action="./liblogin" method="get">
<pre>
Email:<input type="text" name="email"/>
Password:<input type="text" name="email"/>
<input type="submit"value="login"/><a href="LibrarianForgotpassword.jsp">Forgot Password</a>
Not Yet Registered<a href="LibrarianSignup.jsp">Signup</a>
</pre>
</form>

</body>
</html>