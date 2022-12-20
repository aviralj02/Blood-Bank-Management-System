<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<link rel="stylesheet" type="text/css" href="css/admin.css">
</head>
<body>
	<h1>Choose operation to perform</h1>
	<form id="op-box" action="AdminPanel" method="post">
		<h3>What would you like to do:-</h3>
		<input type="radio" id="view-donor" name="admin-input" value="view-donor">
		<label for="view-donor">View Donor Data</label>
		<br><br>
		<input type="radio" id="view-bb" name="admin-input" value="view-bb">
		<label for="view-bb">View Blood Bank Data</label>
		<br><br>
		<input type="radio" id="add-donor" name="admin-input" value="add-donor">
		<label for="add-donor">Add to Donor details</label>
		<br><br>
		<input type="radio" id="add-bb" name="admin-input" value="add-bb">
		<label for="add-bb">Add to Blood Bank details</label>
		<br><br>
		<input type="radio" id="delete-donor" name="admin-input" value="delete-donor">
		<label for="delete-donor">Delete Donor Records</label>
		<br><br>
		<input type="radio" id="delete-bb" name="admin-input" value="delete-bb">
		<label for="delete-bb">Delete Blood Bank Records</label>
		<br><br>
		<input id="button-a2" type="submit" value="Submit">	
	</form>
</body>
</html>