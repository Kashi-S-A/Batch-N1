<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="myTag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>JSTL Tags</h1>
	
	<myTag:set var="a" value="10"></myTag:set>
	
	<h2><myTag:out value="${a}"></myTag:out></h2>
	
	<hr>
	
	<myTag:if test="${10==10 }">Yes the number is 10</myTag:if>
	
	<hr>
	
	<myTag:choose>
		<myTag:when test="${a==100}">a value is equal 100</myTag:when>
		<myTag:when test="${a>100}">a value is greater than 100</myTag:when>
		<myTag:otherwise>a is less than 100</myTag:otherwise>
	</myTag:choose>
	
	<hr>
	
	<%-- <myTag:redirect url="https://www.wikipedia.org/"></myTag:redirect> --%>
	
	<%-- <myTag:import url="https://www.instagram.com/"></myTag:import> --%>

</body>
</html>