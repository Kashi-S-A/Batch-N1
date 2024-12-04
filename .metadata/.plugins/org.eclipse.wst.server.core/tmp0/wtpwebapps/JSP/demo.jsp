<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- Declaration Tag -->
	<h1>Declaration Tag</h1>
	<%!
		int a=10;
	
		public int test(){
			return 100;
		}
		
	%>
	
	<!--Expression Tag -->
	<h2><%=a %></h2>
	
	<h2><%=test() %></h2>
	
	<h1>Scriptlet Tag</h1>
	<%
	   int b=1000;
	   out.println("Hi good evening ");
	%>
	
	<h2><%=b %></h2>
</body>
</html>