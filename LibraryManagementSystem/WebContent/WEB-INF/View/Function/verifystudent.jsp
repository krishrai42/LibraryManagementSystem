<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Verify Student</title>
</head>
<body>
<%
if(session!=null&&session.getAttribute("Role")=="Admin") {
%>
<form action="verifystud" method="post">
Enter StudentID:<input type="text" name="name" required/>
<input type="submit" value="Search Student"/>
<%} 
 


else if(session.getAttribute("Role")==null)
{
	RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
	rd.forward(request, response);
	return;
}

%> 
</form>
</body>
</html>