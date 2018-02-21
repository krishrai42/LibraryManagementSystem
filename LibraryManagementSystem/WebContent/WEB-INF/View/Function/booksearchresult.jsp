<%@ page language="java" import="java.util.*,com.librarymanagement.model.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Search Result</title>
</head>
<body>
<%
if(session!=null) {
%>
<%! List<BookTO> BookList; %>
 <table cellpadding="5" cellspacing="5" border="1">
                    <thead>
                        <tr>
                            <td width="10%">ID</td>
                            <td width="15%">Book Name</td>
                            <td width="15%">AUTHOR</td>
                            <td width="20%">Category</td>
                            <td width="20%">Sub Category</td>
                            <td width="10%">Publisher</td>
                            <td width="10%">year</td>
                            <td width="10%">Status</td>
                        </tr>
                    </thead>

                   <tbody>
<%

		BookList = (List<BookTO>)request.getAttribute("BOOK");
	
		if(BookList != null && !BookList.isEmpty()) {

			for(int i=0;i<BookList.size();i++) {		
		
		%>

		<tr>

			
			<td><%=BookList.get(i).getBookid() %></td>
			<td><%=BookList.get(i).getBookName() %></td>
			<td><%=BookList.get(i).getBookAuthor() %></td>
			<td><%=BookList.get(i).getBookCategory() %></td>
			<td><%=BookList.get(i).getBookSubcategory() %></td>
			<td><%=BookList.get(i).getBookPublication() %></td>
			<td><%=BookList.get(i).getBookYear() %></td>
			<td><%=BookList.get(i).getBookStatus() %></td>

		</tr>


		<%
			}
		
		} else {
	%>

		<tr>

			<td colspan="9" align="center">No Records Available</td>

		</tr>

		<%
		}
	%>
   
   				   </tbody>
                </table>
                <h3> ${BOOK}</h3>
                


<h3><a href="home.jsp?myUrlVariable=/WEB-INF/View/Function/searchbook.jsp"> Search Another Books</a> </h3>
<%
if(session!=null&&session.getAttribute("Role")=="Admin") {
%>
<h3><a href="home.jsp?myUrlVariable=/WEB-INF/View/librarian/LibrarianHome.jsp"> move to home page</a> </h3>
<%
} else if(session!=null&&session.getAttribute("Role")=="User"){
%>
<h3><a href="home.jsp?myUrlVariable=/WEB-INF/View/Student/StudentHome.jsp"> move to home page</a> </h3>
<%
}%>
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