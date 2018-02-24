<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Books To Library</title>
</head>
<body>
<%
if(session!=null&&session.getAttribute("Role")=="Admin") {
%>
<h3>Enter books details to add in library</h3>
<h3> ${ERR}</h3>
<form action="addbook" method="post"onsubmit="return Function()">
<pre>

Book Name:<input type="text" name="bname" id="bname">
Book Author:<input type="text" name="bauthor" id="bauth">
Book Category:<input type="text" name="bcategory"id="bcat" >
Book Subcategory:<input type="text" name="bsubcategory"id="bsubcat" >
Book Publication:<input type="text" name="bpub"id="bpub" >
Book year:<input type="text" name="byear"id="byear" />

Book Status:<select name="status"id="bstatus">
  <option value="">None</option>
  <option value="Avail">Available</option>
  <option value="NotAvail">Not Available</option>
</select>
<input type="submit" value="Add Book" >

</pre>
</form>
<p id="error_para" ></p>
<script>
function Function() {
   //document.getElementById("bname").style.background = "yellow";
  var Bid = document.getElementById( "bid" ); 
  if( Bid.value == "")
  {
   error = " Book Id cannot be empty. ";
   document.getElementById( "error_para" ).innerHTML = error;
   return false;
  }
  var Bname = document.getElementById( "bname" ); 
  if( Bname.value == "")
  {
   error = " Book Name cannot be empty. ";
   document.getElementById( "error_para" ).innerHTML = error;
   return false;
  }
  var Bauth = document.getElementById( "bauth" );
  if( Bauth.value == "")
    {
     error = " You Have To Write Book author name. ";
     document.getElementById( "error_para" ).innerHTML = error;
     return false;
    }
    var category = document.getElementById( "bcat" );
    if( category.value == "")
    {
     error = " category Cannot Be Empty ";
     document.getElementById( "error_para" ).innerHTML = error;
     return false;
    }
    var Subcategory = document.getElementById( "bsubcat" );
    if( Subcategory.value == "")
    {
     error = " Subcategory Cannot Be Empty ";
     document.getElementById( "error_para" ).innerHTML = error;
     return false;
    }
    var Publisher = document.getElementById( "bpub" );
    if( Publisher.value == "")
    {
     error = " Publisher Cannot Be Empty ";
     document.getElementById( "error_para" ).innerHTML = error;
     return false;
    }
    var Year = document.getElementById( "byear" );
    if( Year.value == "")
    {
     error = " Year Cannot Cannot Be Empty ";
     document.getElementById( "error_para" ).innerHTML = error;
     return false;
    }
    var Status = document.getElementById( "bstatus" );
    if( Status.value == "")
    {
     error = " Status should be Available Or NotAvailable  ";
     document.getElementById( "error_para" ).innerHTML = error;
     return false;
    }
}


</script>
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