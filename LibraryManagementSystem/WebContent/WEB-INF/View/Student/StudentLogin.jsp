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
<form action="./studlogin" method="get"onsubmit="return Function()">
<pre>
Email:<input type="text" name="email"id="email"/>
Password:<input type="password" name="password"id="pwd"/>
<input type="submit"value="login"/><a href="home.jsp?myUrlVariable=/WEB-INF/View/Student/StudForgotpassword.jsp">Forgot Password</a>
Not Yet Registered<a href="home.jsp?myUrlVariable=/WEB-INF/View/Student/StudentSignup.jsp">Signup</a>
</pre>
</form>
<p id="error_para" ></p>
<script type="text/javascript">
function Function(){
	var email = document.getElementById( "email" );
    if( email.value == "" || email.value.indexOf( "@" ) == -1 ||email.value.indexOf( "." ) == -1)
    {
     error = " You Have To Write Valid Email Address. ";
     document.getElementById( "error_para" ).innerHTML = error;
     return false;
    }
    var password = document.getElementById( "pwd" );
    if( password.value == ""||password.value.length <=3)
    {
     error = " Password Cannot Be Empty or less than 3 character. ";
     document.getElementById( "error_para" ).innerHTML = error;
     return false;
    }
}
</script>
</body>
</html>