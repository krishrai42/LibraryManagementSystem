<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
<pre>
<form action="./studreg" method="post">
<h3>Enter The required Details</h3>
 StudentID:<input type="text" name="id"/>
 Name:<input type="text" name="name"/>
 Mobile:<input type="text" name="mobile"/>
 City:<input type="text" name="city"/>
 State:<input type="text" name="state"/>
 DateOfbirth:<input type="date" name="dob">
 Email:<input type="text" name="email"/>
 Password:<input type="text" name="password"/>
 <input type="radio" name="gender" value="male" checked> Male<br>
 <input type="radio" name="gender" value="female"> Female<br>
 <input type="radio" name="gender" value="other"> Other 
 Department<select required>
  <option value="">None</option>
  <option value="cse">Computer Science</option>
  <option value="civil">Civil</option>
  <option value="mech">Mechanical</option>
  <option value="eee">Electrical&Electronics</option>
  <option value="chem">Chemical</option>
  <option value="ise">Information Science</option>
  <option value="ece">Electronics Communication</option> 
</select>
 
 <input type="submit" value="Register"/> 
</form>
</pre>
</body>
</html>