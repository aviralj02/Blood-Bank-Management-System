<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donor Registration</title>
<link rel="stylesheet" type="text/css" href=css/registerdonor.css>
<link rel="preconnect" href="https://fonts.googleapis.com"><link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
</head>
<body>
	<h1>Glad to see you here donor</h1>
	<h2>Kindly fill following detail to register.</h2>
	<div id="parent-box">
	<form id="register-container" method="post" action="DonorPage">
			<label>Name</label><br>
			<input class="input-field" type="text" name="name">
			<br><br>
			<label>Age</label><br>
			<input class="input-field" type="number" min=18 max=65 name="age">
			<br><br>
			<label>Blood Group</label><br>
			<input class="input-field" type="text" name="bg">
			<br><br>
			<label>Contact Number</label><br>
			<input class="input-field" type="text" name="number">
			<br><br>
			<input id="button-donor2" type="submit" value="Submit">
		</form>
		<div id="image">
			<img src="https://cdn.pixabay.com/photo/2021/04/23/09/41/blood-6201268_960_720.png">
		</div>
	</div>
</body>
</html>