<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h2>Registration</h2>
	<form action="register">
		<label>Username</label><br>
		<input type="text" name="username" required="required"><br><br>
		<label>Mobile Number</label><br>
		<input type="text" name="mobilenumber" required="required"><br><br>
		<label>Email ID</label><br>
		<input type="email" name="emailid" required="required"><br><br>
		<label>Date of Birth</label><br>
		<input type="date" name="dateofbirth" required="required"><br><br>
		<label>Password</label><br>
		<input type="password" name="password" required="required"><br><br>
		<input type="submit" value="Register">
	</form>
</body>
</html>

${msg}