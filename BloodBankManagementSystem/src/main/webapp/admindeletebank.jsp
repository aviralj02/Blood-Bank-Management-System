<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Blood Bank</title>
<style>
* {
	background-color: #f7ede2;
	font-family: sans-serif;
}

h1{
	margin-top: 70px;
	margin-left: 30%;
}
#delete-bb-box{
	margin-left: 38%;
	margin-top: 50px;
	border: 2px solid black;
	border-radius: 8px;
	width: 260px;
	height: 180px;
	padding-left: 40px;
	padding-top: 45px;
}
.input-field{
	background-color: white;
}
#button-a4{
	border: 2px solid black;
	border-radius: 5px;
	width: 150px;
	height: 30px;
	margin-left: 10%;
	font-weight: bold;
	transition: 500ms all ease;
}
#button-a4:hover{
	background-color: #1cf5fb;
}
</style>
</head>
<body>
	<h1>Enter details of Blood Bank record you want to delete</h1>
	<form id="delete-bb-box" action="AdminBankDelete" method="post">
		<label>Enter Blood Bank Name</label><br>
		<input class="input-field" type="text" name="bb-name">
		<br><br>
		<label>Enter Blood Bank Location</label><br>
		<input class="input-field" type="text" name="bb-loc">
		<br><br>
		<input id="button-a4" type="submit" value="Delete Blood Bank">
	</form>
</body>
</html>