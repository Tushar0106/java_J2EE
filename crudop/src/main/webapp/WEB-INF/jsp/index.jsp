<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD Operation</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<style type="text/css">
	body {
		background-image: url("bg.jpg");
		background-size: 100%;
	}
</style>

</head>
<body>
	<div class="container">
		<div>
			<br>
		</div>
		<div class="card">
			<h5 class="card-header">Featured</h5>
			<div class="card-body">
				<br>
				<h5 class="card-title">CRUD operation</h5>
				<p class="card-text">Select operation which you want to perform.</p>
				<a href="select" class="btn btn-primary">SELECT</a>
				<a href="insert" class="btn btn-secondary">INSERT</a>
				<a href="update" class="btn btn-success">UPDATE</a>
				<a href="delete" class="btn btn-danger">DELETE</a>
				
			</div>
		</div>
	</div>

</body>
</html>