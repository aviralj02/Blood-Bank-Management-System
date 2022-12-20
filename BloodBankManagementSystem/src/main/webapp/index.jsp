<html>
<head>
<title>Home Page</title>
<link rel="stylesheet" href="css/index.css" type="text/css">
</head>
<body>
	<h1>Blood Bank Management System</h1>
	<form id="login-box">
		<h3>Select Choice</h3>
		<label>Login As: </label>
		<br>
		<select id="dropdown" name="input-home">
			<option>Admin</option>
			<option>Donor</option>
			<option>Blood Bank</option>
		</select>
		<br><br>
		<input id="button" type="submit" value="Submit">
		<% String input=request.getParameter("input-home");
			try{
				if (input.equals("Donor")){
					response.sendRedirect("donor.jsp");
				}
				else if (input.equals("Blood Bank")){
					response.sendRedirect("bloodbank.jsp");
				}
				else if (input.equals("Admin")){
					response.sendRedirect("adminlogin.jsp");
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		%>
	</form>
</body>
</html>
