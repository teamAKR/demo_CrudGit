<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function add()
{
	alert("Add");
<<<<<<< HEAD
	doccument.myform.action="add";
=======
	document.myform.action="registerpage";
	alert("url add")
>>>>>>> branch 'master' of https://github.com/teamAKR/demo_CrudGit.git
	document.myform.submit();
}
function del()
{
	alert("Delete");
<<<<<<< HEAD
	document.myform.action="del";
=======
	document.myform.action="del()";
>>>>>>> branch 'master' of https://github.com/teamAKR/demo_CrudGit.git
	document.myform.submit();
}
function edit()
{
	alert("Edit");
	document.myform.action="edit";
	document.myform.submit();
}
</script>
<title>Success_Page</title>
</head>
<body bgcolor="pink">
<form name="myform">
<center><h3>"${msg}"</h3></center>
<table align="center">
<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Username</th>
		<th>Password</th>
</tr>
<c:forEach items="${data }" var="s"> 
<tr>
<<<<<<< HEAD

	<td><input type="radio" name="id" value="${s.id}">
	<td>"${s.name}"</td>
	<td>"${s.uname}"</td>
	<td>"${s.pass}"</td>
=======
	<td>${s.id}</td>
	<td>${s.name}</td>
	<td>${s.uname}</td>
	<td>${s.pass}</td>
>>>>>>> branch 'master' of https://github.com/teamAKR/demo_CrudGit.git
</tr>
</c:forEach>
</table>
<table align="center"> 
		<tr>
		<td><input type="button"  onclick="add()" value="Add"></td>
		<td><input type="button"  onclick="edit()" value="Edit"></td>
		<td><input type="button"  onclick="del()" value="Delete"></td>
		</tr>
</table>
</form>
</body>
</html>