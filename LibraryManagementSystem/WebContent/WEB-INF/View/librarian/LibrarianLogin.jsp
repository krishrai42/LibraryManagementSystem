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
<h3>  ${MSG}</h3>
<form action="liblogin" method="get" id="myform">
<pre>
Email:<input type="email" id="txtEmail"name="email" onfocusout="emailFunction()"required/>
Password:<input type="password" name="password"id="pwd"onfocusout="pwdFunction()"required/>
<input type="submit"value="login"onmouseover="pwdFunction()" /><a href="home.jsp?myUrlVariable=/WEB-INF/View/librarian/LibrarianForgotpassword.jsp">Forgot Password</a>
Not Yet Registered<a  href="home.jsp?myUrlVariable=/WEB-INF/View/librarian/LibrarianSignup.jsp">Signup</a>
</pre>
</form>


<p id="error_para" ></p>
<script>
// Focus = Changes the background color of input to yellow
function emailFunction() {
    document.getElementById("txtEmail").style.background = "yellow";
    var email = document.getElementById( "txtEmail" );
    if( email.value == "" || email.value.indexOf( "@" ) == -1 )
    {
     error = " You Have To Write Valid Email Address. ";
     document.getElementById( "error_para" ).innerHTML = error;
     return false;
    }
}

// No focus = Changes the background color of input to red
function pwdFunction() {
    document.getElementById("pwd").style.background = "red";
    var password = document.getElementById( "pwd" );
    if( password.value == "")
    {
     error = " Password Cannot Be Empty. ";
     document.getElementById( "error_para" ).innerHTML = error;
     return false;
    }
}
</script>

</body>
</html>