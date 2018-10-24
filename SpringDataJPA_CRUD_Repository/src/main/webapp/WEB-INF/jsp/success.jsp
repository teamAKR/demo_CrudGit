<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function addNew() 
{
	document.success.action="registrationpage";
	document.success.submit();
	
}

function del() 
{
	document.success.action="delNew";
	document.success.submit();
	
}

function edit() 
{
	document.success.action="editNew";
	document.success.submit();
	
}

</script>
</head>
<body>
<form name="success">
<h3>${msg }</h3>
<table>

<tr>
<th>Id</th>
<th>Name</th>
<th>Uname</th>
<th>Pass</th>
<th>Cityname</th>
<th>Areaname</th>
</tr>
<c:forEach items="${students}" var="s">
<tr>
<td><input type="radio" name="id" value="${s.id}">
<td>${s.name}</td>
<td>${s.uname}</td>
<td>${s.pass}</td>
<td>${s.addr.cityname}</td>
<td>${s.addr.areaname}</td>
</tr>
</c:forEach>
</table>
<input type="button" onclick="addNew()" value="AddNew">
<input type="button" onclick="del()" value="Delete">
<input type="button" onclick="edit()" value="Edit">


</form>
</body>
</html>