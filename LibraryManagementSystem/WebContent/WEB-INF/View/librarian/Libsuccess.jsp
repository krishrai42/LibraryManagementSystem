<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Successful</title>
</head>
<body>
<%
if(session!=null&&session.getAttribute("Role")=="Admin") {
%>
<h3>Registration Successful</h3>
<h3>Registration Successful</h3>
<h3>Registration Successful</h3>
<h3>Registration Successful</h3>
<h3>Registration Successful</h3>

<a href="home.jsp?myUrlVariable=/WEB-INF/View/librarian/LibrarianLogin.jsp">Return to login page</a>
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