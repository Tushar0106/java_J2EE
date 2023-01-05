<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Test img</title>
</head>
<style type="text/css">
body {
	background-image: url('bg.jpg');
	background-size: 100%;
}

h3 {
	text-align: center;
	color: white;
}
</style>

<body>
	<div>
		<br>
	</div>
	<h3>Employee List</h3>
	<table align="center" border="4" cellpadding="10">
		<tr>
			<th>ID</th>
			<th>Name</th>
		</tr>
<c:forEach var="employee" items="${empdata}">
		<tr>
			
				<td>${employee.id}</td>
				<td>${employee.name}</td>
			
		</tr>
</c:forEach>
	</table>
</body>
</html>