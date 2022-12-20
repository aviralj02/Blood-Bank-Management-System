<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Donor</title>
<link rel="stylesheet" type="text/css" href="css/donor.css"> 
</head>
<body>
	<h1>Welcome Donor!</h1>
	<form id="donor-container" action="DonorPage2" method="post">
		<h3>Select Choice</h3>
		<input type="radio" id="registration" name="donor-input" value="register">
		<label for="registration">Register as a new Doner</label>
		<br><br>
		<input type="radio" id="view" name="donor-input" value="view-details">
		<label for="view">View Blood Bank Details</label>
		<br><br>
		<input id="button-donor1" type="submit" value="Submit">
	</form>
</body>
</html>