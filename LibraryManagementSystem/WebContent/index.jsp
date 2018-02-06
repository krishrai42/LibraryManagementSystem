<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Library Management System</title>
</head>
<body>
<h1>Please Select your Credential</h1>
<form action="indexservlet" method="get">
<input type="radio" name="position" value="Librarian"> Librarian<br>
  <input type="radio" name="position" value="Student"> Student<br>
  <input type="submit" value="submit">
</form>
</body>
</html>