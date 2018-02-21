<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ page import = "javax.servlet.*" %>
    <%@ page import = "javax.servlet.RequestDispatcher" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LibrarianLogin</title>
</head>
<body>
<h1 text-align="center">Welcome To Librarian Section </h1>
<h3>Login to perform task</h3>
<form action="liblogin" method="get" id="myform">
<pre>
Email:<input type="email" id="txtEmail"name="email"/>
Password:<input type="password" name="password"id="pwd"/>
<input type="submit"value="login" /><a href="home.jsp?myUrlVariable=/WEB-INF/View/librarian/LibrarianForgotpassword.jsp">Forgot Password</a>
Not Yet Registered<a  href="home.jsp?myUrlVariable=/WEB-INF/View/librarian/LibrarianSignup.jsp">Signup</a>
</pre>
</form>


<p id="error_para" ></p>

</body>
</html>