<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert</title>
<style type="text/css">
body {
	background-color: #878781;
}

h1 {
	color: yellow;
	text-align: center;
}
</style>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Insert</h1>
		<form action="insertEmp" method="POST">
			<div class="form-group">
				<label>ID</label> 
				<input type="text" class="form-control" placeholder="id" name="id">
			</div>
			<div class="form-group">
				<label>Name</label> 
				<input type="text" class="form-control" placeholder="name" name="name">
			</div>
			
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>