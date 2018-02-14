<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Books To Library</title>
</head>
<body>
<h3>Enter books details to add in library</h3>
<h3> ${ERR}</h3>
<form action="addbook" method="post">
<pre>
Book ID:<input type="text" name="bid" >
Book Name:<input type="text" name="bname" >
Book Author:<input type="text" name="bauthor" >
Book Category:<input type="text" name="bcategory" >
Book Subcategory:<input type="text" name="bsubcategory" >
Book Publication:<input type="text" name="bpub" >
Book year:<input type="text" name="byear" />

Book Status:<select name="status">
  <option value="">None</option>
  <option value="Avail">Available</option>
  <option value="NotAvail">Not Available</option>
</select>
<input type="submit" value="Add Book" >

</pre>
</form>

</body>
</html>