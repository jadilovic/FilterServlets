<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<h1>Login</h1>
	<p>Please enter your user name and password.</p>

	<form action="/LoginFilter/login" method="POST">

<%if (request.getAttribute("error")!=null){  %>
	
	<p><%=request.getAttribute("error") %></p>

<%} %>
		<p>
			Username: <br />
			<input type="text" name="username" />
		</p>
		
		<p>
			Password: <br />
			<input type="password" name="password" />
		</p>

		<input type="submit" value="Login" />

	</form>
</body>
</html>