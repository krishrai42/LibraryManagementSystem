<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Book</title>
</head>
<body>
<%
if(session!=null&&session.getAttribute("Role")=="User"||session.getAttribute("Role")=="Admin") {
%>
<form action="searchbook" method="post">
<table><tr><td><h2> Select search Category</h2></td></tr> </table>
<tr><td><select name="category">
<option value="">Select</option>
<option value="ID">BookID</option>
<option value="name">Book Name</option>
<option value="author">Author Name</option>
<option value="category">Category</option>
<option value="Subcategory">Subcategory</option>
<option value="publisher">Publisher</option>
<option value="all">all</option>

</select></td></tr>
<input type="text" name="name"/>
<input type="submit" value="Search"/>
</form>
</body>
<%} 
 


else if(session.getAttribute("Role")==null)
{
	RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
	rd.forward(request, response);
	return;
}

%> 



</html>