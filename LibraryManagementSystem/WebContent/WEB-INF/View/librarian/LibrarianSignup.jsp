<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Librarian Signup</title>
</head>
<body>
<pre>
<form action="libreg" method="post"onsubmit="return Function()">
<h3>Enter The required Details</h3>
 LibrarianID:<input type="text" name="id"/>
 Name:<input type="text" id="Name"name="name"/>
 Email:<input type="email" id="email"name="email"/>
 Password:<input type="password" id="pwd"name="password"/>
 <input type="radio" name="gender" id="gender"value="male" checked> Male<br>
 <input type="radio" name="gender" id="gender"value="female"> Female<br>
 <input type="radio" name="gender" id="gender"value="other"> Other 
 <input type="submit" value="Register" /> 
</form>
</pre>
<p id="error_para" ></p>
<script>

function Function() {
  
  var Name = document.getElementById( "Name" ); 
  if( Name.value == "")
  {
   error = " Name cannot be empty. ";
   document.getElementById( "error_para" ).innerHTML = error;
   return false;
  }
  var email = document.getElementById( "email" );
    if( email.value == "" || email.value.indexOf( "@" ) == -1 ||email.value.indexOf( "." ) == -1)
    {
     error = " You Have To Write Valid Email Address. ";
     document.getElementById( "error_para" ).innerHTML = error;
     return false;
    }
    var password = document.getElementById( "pwd" );
    if( password.value == ""||password.value.length <=3)
    {
     error = " Password Cannot Be Empty or less than 3 character. ";
     document.getElementById( "error_para" ).innerHTML = error;
     return false;
    }
}


</script>

</body>
</html>