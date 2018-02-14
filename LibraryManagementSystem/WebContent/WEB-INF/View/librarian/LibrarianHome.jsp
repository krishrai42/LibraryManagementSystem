<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Librarian Home Page</title>
</head>
<body>
<h1>Welcome to Library Management ${Email} </h1>
<h3> ${BMSG}</h3>
<h1><a href="home.jsp?myUrlVariable=/WEB-INF/View/Function/addbook.jsp"> Add Books</a> </h1>
<h1><a href="home.jsp?myUrlVariable=/WEB-INF/View/Function/verifystudent.jsp">Verify Students</a> </h1>
<h1><a href="home.jsp?myUrlVariable=/WEB-INF/View/Function/issuebook.jsp">Issue Book </a></h1>
<h1><a href="home.jsp?myUrlVariable=/WEB-INF/View/Function/collectbook.jsp">Collect Book</a> </h1>
<h1><a href="home.jsp?myUrlVariable=/WEB-INF/View/Function/searchbook.jsp">Search Book</a></h1>
<h1><a href="home.jsp?myUrlVariable=/WEB-INF/View/Function/deletebook.jsp">Delete Book</a></h1>


<form action="libhome" method="get">
<input type="submit" value="Add Books" name="book"/>
<input type="submit" value="Issue Books" name="book"/>
<input type="submit" value="Collect Books" name="book"/>
<input type="submit" value="Search Books" name="book"/>
<input type="submit" value="Delete Books" name="book"/>
<input type="submit" value="Verify Books" name="book"/>

</form>
<h1>This is Librarian Home Page </h1>

</body>
</html>