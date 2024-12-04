<%@page import="com.ty.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>It is display.jsp page</h1>
	
	<%
	String name = (String) request.getAttribute("un");
	int phone = (Integer) request.getAttribute("phone");
	Student student=(Student)request.getAttribute("stu");
	%>
	
	<h2>USerName : <%=name %></h2>
	<h2>Phone : <%=phone %></h2>
	<h2>===========Student details===========</h2>
	<h3>Name : <%=student.getName() %></h3>
	<h3>Email : <%=student.getEmail() %></h3>
	
	<hr>
	
	<h2>Name : ${un}</h2>
	<h2>Phone : ${phone}</h2>
	
	<h2>--------------Student Details--------------</h2>
	<h3>Name : ${stu.name}</h3>
	<h3>Email : ${stu.email }</h3>
	
</body>
</html>