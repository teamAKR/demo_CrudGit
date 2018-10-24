<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="update">
<pre>
	<input type="hidden" name="id" value="${s.id }">
	name <input type="text" name="name" value="${s.name }">

    username<input type="text" name="uname" value="${s.uname }">

    password<input type="text" name="pass" value="${s.pass }">

	Areaname<input type="text" name="areaname" value="${s.addr.areaname }">

	Cityname<input type="text" name="cityname" value="${s.addr.cityname }">

		<input type="submit" value="Update" >
</pre>

</form>

</body>
</html>