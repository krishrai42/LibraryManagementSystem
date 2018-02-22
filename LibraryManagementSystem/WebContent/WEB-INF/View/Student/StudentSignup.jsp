<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker({ dateFormat: 'yy-mm-dd' });
  } );
  </script>
</head>
<body>
<pre>
<form action="./studreg" method="post"onsubmit="return Function()">
<h3>Enter The required Details</h3>
 StudentID:<input type="text" name="id"/>
 Name:<input type="text" name="name"id="name"/>
 Mobile:<input type="text" name="mobile"id="mobile"/>
 City:<input type="text" name="city"id="city"/>
 State:<input type="text" name="state"id="state"/>
 DateOfbirth:<input type="date" id="datepicker"name="dob"/>
 Email:<input type="text" name="email"id="email"/>
 Password:<input type="text" name="password"id="pwd"/>
 <input type="radio" name="gender" value="male" checked> Male<br>
 <input type="radio" name="gender" value="female"> Female<br>
 <input type="radio" name="gender" value="other"> Other 
 Department<select name="dept"id="dept">
  <option value="">None</option>
  <option value="cse">Computer Science</option>
  <option value="civil">Civil</option>
  <option value="mech">Mechanical</option>
  <option value="eee">Electrical&Electronics</option>
  <option value="chem">Chemical</option>
  <option value="ise">Information Science</option>
  <option value="ece">Electronics Communication</option> 
  <option value="others">Others</option>
</select>
 
 <input type="submit" value="Register"/> 
</form>
</pre>
<p id="error_para" ></p>
<script>

function Function() {
  
  var Name = document.getElementById( "name" ); 
  if( Name.value == "")
  {
   error = " Name cannot be empty. ";
   document.getElementById( "error_para" ).innerHTML = error;
   return false;
  }
  var mobile = document.getElementById( "mobile" );
  if( mobile.value == ""||mobile.value.length <=4)
  {
   error = " Mobile Cannot Be Empty or less than 5 character. ";
   document.getElementById( "error_para" ).innerHTML = error;
   return false;
  }
  var City = document.getElementById( "city" );
  if( City.value == "")
  {
   error = " City Cannot Be Empty. ";
   document.getElementById( "error_para" ).innerHTML = error;
   return false;
  }
  var State = document.getElementById( "state" );
  if( State.value == "")
  {
   error = " State cannot be empty. ";
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
    var Department = document.getElementById( "dept" );
    if( Department.value == "")
    {
     error = " Department should be not be None  ";
     document.getElementById( "error_para" ).innerHTML = error;
     return false;
    }
}


</script>
</body>
</html>