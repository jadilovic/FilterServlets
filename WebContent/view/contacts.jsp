<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- taglib directive -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Address Book</title>
</head>
<body>
	<h1>Address Book</h1>

	<c:choose>
	
	<c:when test="${(fn:length(contacts) == 0)}">
		<p>Nema kontakata. Zdra'o.</p>
	</c:when>
	
	<c:otherwise>
		<c:forEach items="${contacts}" var="contact">
			<p><b><c:out value="${contact.firstName}, ${contact.lastName}" /></b></p>
			<p><c:out value="${contact.phoneNumber}" /></p>
			<p><c:out value="${contact.address}" /></p>
		</c:forEach>
	</c:otherwise>
	
	</c:choose>
</body>
</html>

