<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student List - Spring Boot Web Application Example</title>
</head>
<body>
	<h1 align="center">My Student List</h1>
	<br />
	<table border="4" cellpadding="10" align="center">
		<tr>
			<th>Roll Number</th>
			<th>Name</th>
		</tr>
		<c:forEach var="student" items="${studlist}">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>