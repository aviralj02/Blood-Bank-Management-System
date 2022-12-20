<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log in</title>
<link rel="stylesheet" type="text/css" href="css/adminlogin.css">
</head>
<body>
	<h1>Admin Login Panel</h1>
	<form id="pass-box">
		<label>User</label><br>
		<input class="input-field" type=text name="user">
		<br><br>
		<label>Password</label><br>
		<input class="input-field" type="password" name="pass">
		<br><br>
		<input class="button-a1" type=submit value="Submit">
		<input class="button-a1" type="reset" value="Clear">
	</form>
	<%
	try{
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		if (user.equals("admin") && pass.equals("admin")){
			response.sendRedirect("admin.jsp");
		}
		else{
			response.sendRedirect("adminlogin.jsp");
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
	%>
</body>
</html>