<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student login</title>
</head>
<body>
<h1 text-align="center">Welcome To Student Section </h1>
<h3>Please Login to Application </h3>
<h3>${MSG}</h3>
<form action="./studlogin" method="get">
<pre>
Email:<input type="text" name="email"/>
Password:<input type="text" name="password"/>
<input type="submit"value="login"/><a href="home.jsp?myUrlVariable=/WEB-INF/View/Student/StudForgotpassword.jsp">Forgot Password</a>
Not Yet Registered<a href="home.jsp?myUrlVariable=/WEB-INF/View/Student/StudentSignup.jsp">Signup</a>
</pre>
</form>
</body>
</html>