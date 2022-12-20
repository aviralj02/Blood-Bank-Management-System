<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Blood Bank</title>
<link rel="stylesheet" type="text/css" href="css/bloodbank.css">
</head>
<body>
	<h1>Welcome Blood Bank!</h1>
	<form id="bb-container" method="post" action="BBPage2">
		<h3>Select Choice</h3>
		<input type="radio" id="registration" name="bb-input" value="add">
		<label for="registration">Add Blood Bank Details</label>
		<br><br>
		<input type="radio" id="view" name="bb-input" value="view-list">
		<label for="view">View Donor Details</label>
		<br><br>
		<input id="button-bb1" type="submit" value="Submit">
	</form>
</body>
</html>