<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="register">
		<pre>

    FirstName <input type="text" name="firstname">

	LastName <input type="text" name="lastname">

    mobilenumber <input type="text" name="mobilenumber">

   	 username <input type="text" name="username">
   	 
   	 password <input type="text" name="password"> 
   	 
   	 Role    <select name="roleid">
   	 	
   	 		<option value="1">Administrator</option>
   	 		<option value="2">Manager</option>
   	 		<option value="3">User</option>
   	 </select>
   	 <input type="submit" value="submit">
</pre>
	</form>
</body>
</html>