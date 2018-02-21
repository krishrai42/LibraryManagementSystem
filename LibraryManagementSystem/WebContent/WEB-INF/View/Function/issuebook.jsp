<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Issue Book </title>
<title>jQuery UI Datepicker - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker({ dateFormat: 'yy-mm-dd' });
  } );
  </script>
</head>
<body>
<%
if(session!=null&&session.getAttribute("Role")=="Admin") {
%>
<h3> ${ISSUEBOOKERR}</h3>
<form action="issuebook" method="post">
<pre>
Student ID:<input type="text" name="sid" >
Book ID:<input type="text" name="bid" >
Issue Date:<input type="text"id="datepicker" name="date" >

<input type="submit" value="Issue Book" >
</pre>
</form>
<%} %>
</body>
</html>