<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Librarian Home Page</title>
</head>
<body>
<%
if(session.getAttribute("Role")=="Admin") {
%>


<h1>Welcome to Library Management ${Email} </h1>
<h3> ${BMSG}</h3>
<h1><a href="home.jsp?myUrlVariable=/WEB-INF/View/Function/addbook.jsp"> Add Books</a> </h1>
<h1><a href="home.jsp?myUrlVariable=/WEB-INF/View/Function/verifystudent.jsp">Verify Students</a> </h1>
<h1><a href="home.jsp?myUrlVariable=/WEB-INF/View/Function/issuebook.jsp">Issue Book </a></h1>
<h1><a href="home.jsp?myUrlVariable=/WEB-INF/View/Function/collectbook.jsp">Collect Book</a> </h1>
<h1><a href="home.jsp?myUrlVariable=/WEB-INF/View/Function/searchbook.jsp">Search Book</a></h1>
<h1><a href="home.jsp?myUrlVariable=/WEB-INF/View/Function/deletebook.jsp">Delete Book</a></h1>


<form action="Logout" method="post">
		<input type="submit" value="Logout">
	</form>
<h1>This is Librarian Home Page </h1>
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