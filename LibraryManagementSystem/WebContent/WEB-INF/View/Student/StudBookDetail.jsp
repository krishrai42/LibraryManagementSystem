<%@ page language="java" import="java.util.*,com.librarymanagement.model.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Issued Book Detail</title>
</head>
<body>
<%
if(session!=null&&session.getAttribute("Role")=="User") {
%>
<%! List<BookIssueTO> BookList; %>
 <table cellpadding="5" cellspacing="5" border="1">
                    <thead>
                        <tr>
                            <td width="10%">SID</td>
                             <td width="10%">BID</td>
                            <td width="15%">Book Name</td>
                            <td width="15%">Issue_Date</td>
                            <td width="20%">Return_Date</td>
                            <td width="20%">Fine Till Date</td>
                          
                        </tr>
                    </thead>

                   <tbody>
<%

		BookList = (List<BookIssueTO> )request.getAttribute("BOOKSDETAIL");
	
		if(BookList != null && !BookList.isEmpty()) {

			for(int i=0;i<BookList.size();i++) {		
		
		%>

		<tr>

			
		
			<td><%=BookList.get(i).getSid() %></td>
			<td><%=BookList.get(i).getBid() %></td>
			<td><%=BookList.get(i).getBname() %></td>
			<td><%=BookList.get(i).getIssue_date() %></td>
			<td><%=BookList.get(i).getReturn_date() %></td>
			<td><%=BookList.get(i).getFine() %></td>
			

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
                <h3> ${BOOKSDETAIL}</h3>
                


<h3><a href="home.jsp?myUrlVariable=/WEB-INF/View/Function/searchbook.jsp"> Search Another Books</a> </h3>

<h3><a href="home.jsp?myUrlVariable=/WEB-INF/View/librarian/LibrarianHome.jsp"> move to home page</a> </h3>
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