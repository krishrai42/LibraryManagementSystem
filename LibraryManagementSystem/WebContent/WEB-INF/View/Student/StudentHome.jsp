<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Home</title>
</head>
<body>
<%
if(session!=null&&session.getAttribute("Role")=="User") {
%>
<h1><a href="home.jsp?myUrlVariable=/WEB-INF/View/Function/searchbook.jsp">Search Book</a></h1>
<form action="showstudaccount" method="post">
<input type="submit" value="Show Account" >
</form>
<h1>this is student Home page</h1>
<form action="StudLogout" method="post">
		<input type="submit" value="Logout">
	</form>
<h3>  ${BOOKSDETAIL}</h3>
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