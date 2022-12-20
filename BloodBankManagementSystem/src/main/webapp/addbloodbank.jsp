<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blood Bank</title>
<link rel="stylesheet" href="css/addbloodbank.css" type="text/css">
</head>
<body>
	<h1>Please add Blood Bank Details below</h1>
	<form id="add-container" action="BBPage" method="post">
		<label>Blood Bank Name</label><br>
		<input class="input-field" type="text" name="bbname">
		<br><br>
		<label>Location</label><br>
		<input class="input-field" type="text" name="loc">
		<br><br>
		<label>Contact Number</label><br>
		<input class="input-field" type="text" name="cnumber">
		<br><br>
		<input id="button-bb2" type="submit" value="Submit">
	</form>
</body>
</html>