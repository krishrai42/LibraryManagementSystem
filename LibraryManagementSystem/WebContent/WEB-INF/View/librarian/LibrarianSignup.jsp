<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Librarian Signup</title>
</head>
<body>
<pre>
<form action="libreg" method="post">
<h3>Enter The required Details</h3>
 LibrarianID:<input type="text" name="id"/>
 Name:<input type="text" name="name"/>
 Email:<input type="email" name="email"/>
 Password:<input type="password" name="password"/>
 <input type="radio" name="gender" value="male" checked> Male<br>
 <input type="radio" name="gender" value="female"> Female<br>
 <input type="radio" name="gender" value="other"> Other 
 <input type="submit" value="Register"/> 
</form>
</pre>

</body>
</html>