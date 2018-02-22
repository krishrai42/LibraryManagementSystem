<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Collect Books</title>
</head>
<body>
<%
if(session!=null&&session.getAttribute("Role")=="Admin") {
%>
<form action="collectbook" method="post">
<pre>
Student ID:<input type="text" name="sid" required>
Book ID:<input type="text" name="bid" required>
<input type="submit" value="Collect Book" >
</pre>
</form>
<%} 



else if(session.getAttribute("Role")==null)
{
	RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
	rd.forward(request, response);
	return;
}

%>  
</body>
</html>