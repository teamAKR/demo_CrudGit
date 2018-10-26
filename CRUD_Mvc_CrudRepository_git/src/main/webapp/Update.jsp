<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<body>
<form action="update">
<table align="center">
<tr><td><input type="hidden" name="id" value="${data.id}"></td></tr>

<tr><td>Name:<input type="text" name="name" value="${data.name}"></td></tr>

<tr><td>Username:<input type="text" name="name" value="${data.uname}"></td></tr>

<tr><td>Password:<input type="text" name="name" value="${data.pass}"></td></tr>

<tr><td><input type="submit"  value="update"></td></tr>
</table>

</form>
</body>
</html>