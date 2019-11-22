<%@page import="model.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Person</title>
</head>
<body>
<body style="background-color: ${param.color};">

	<h1>Information</h1>

	<p>Name: ${person.name}</p>
	<p>Gender: ${person.gender}</p>

	<p>Enjoy: ${person.getListOfEnjoys()}</p>

	<p>Them maths: 2 + 2 = ${2+2}</p>
	
	<p>Editable name: <input type="text" name="name" value="${person.name}" /></p>

</body>
</html>