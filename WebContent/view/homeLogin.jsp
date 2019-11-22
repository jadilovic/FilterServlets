<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome to Login Home Page</h3>

<h5>Please login</h5>
<h4>Message: ${param.message}</h4>

<form action="/LoginFilter/home" method="get">
	<p>Enter your username: <input type="text" name="username" /></p>
	<p>Enter your password: <input type="password" name="password" /></p>
	<input type="hidden" name="message" value="Your username or password is wrong. Please try again." />
	<p><input type="submit" value="OK" /></p>
</form>
</body>
</html>