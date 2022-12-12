<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="model.LoginBean" %>
<!DOCTYPE html>
<html>
<head>
<title>Start</title>
<meta charset="UTF-8">
</head>
<body>
	<%
	
	//check if there is a session 
	if (session.getAttribute("isLoggedIn") != null) { 
	 	LoginBean catOrDog= (LoginBean) session.getAttribute("isLoggedIn");
	%>
		
		<h1>Welcome to your profile, Mr.<%=catOrDog.getUsername()%></h1>
		
		<form action="<%=request.getContextPath()%>/RemoveSessionServlet" method="POST">
		<input type="submit" value="Remove Session" />
		</form>
	<%} else { %>
		<p style="color:red;">Wrong username or password</p> 
		<jsp:include page="../index.jsp"></jsp:include>
	<% } %>
	
</body>
</html>