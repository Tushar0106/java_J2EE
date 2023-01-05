<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Question</title>
<style type="text/css">
	select {
		padding: 4px;
		width: 170px;
	}
</style>

</head>
<body>
${msg}
	<h2>Add Question</h2>
	<form action="addQuestion">
	<label>Question Number</label><br>
	<input type="text" name="qno"><br><br>
	<label>Question</label><br>
	<input type="text" name="question"><br><br>
	<label>Answer</label><br>
	<input type="text" name="answer"><br><br>
	<label>Option1</label><br>
	<input type="text" name="option1"><br><br>
	<label>Option2</label><br>
	<input type="text" name="option2"><br><br>
	<label>Option3</label><br>
	<input type="text" name="option3"><br><br>
	<label>Option4</label><br>
	<input type="text" name="option4"><br><br>
	<label>Subject</label><br>
	
	
	<select name="subject">
		<option value="GK">GK</option>
		<option value="C">C</option>
		<option value="CPP">CPP</option>
		<option value="JAVA">JAVA</option>
	</select><br><br>
	<input type="submit" value="Submit">
	</form>
</body>
</html>