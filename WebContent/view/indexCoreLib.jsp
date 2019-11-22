<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- taglib directive -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CoreLib Testing</title>
</head>
<body>

	<!-- 	<!-- c:out example -->

	<p>
		<c:out value="Groovy!" />
	</p>

	<!-- 	<!-- deafult value example -->

	<p>
	Hi, <c:out value="${param.name}" >John Doe</c:out>
	<c:out value="${param.name}" default="John Doe" />

	</p>

	<!-- c:set c:remove example -->
	<c:set var="salary" value="${2000*1}" />
	<p>c:set Salary: <c:out value="${salary}" /></p>
	
	<c:remove var="salary" />
	<p>c:remove Salary: <c:out value="${salary}" />default</p>

	<!-- c:if example -->
	<c:set var="salary" value="${2000*1}" />
	<c:if test="${salary > 2000 }" >
	<p>Ima se, moze se.</p>
	</c:if>

	<!-- c:choose c:when c:otherwise example-->

	<c:set var="salary" scope="session" value="${2000*1}" />
	<p>Your salary is :<c:out value="${salary}" /></p>
	
	
	<c:choose>

	<c:when test="${salary <= 0}">
	<p>Moze to i bolje.</p>
	</c:when>

	<c:when test="${salary <= 2000}">
	<p>Zivi se, jbga.</p>
	</c:when>

	<c:otherwise>
	<p>Ima se, moze se.</p>
	</c:otherwise>

	</c:choose>


	<!-- c:forEach example-->
	<c:forEach var="i" begin="0" end="10">
	<p>Line: ${i} </p>
	</c:forEach>


</body>
</html>