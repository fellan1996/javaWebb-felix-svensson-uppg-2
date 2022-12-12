<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Start</title>
<meta charset="UTF-8">
</head>
<body>
	<%
	// check if there is a session 
	if (session.getAttribute("isLoggedIn") != null) {
		response.sendRedirect("views/profile.jsp");
	}
	%>
	<form action="<%=request.getContextPath()%>/SessionServlett"
		method="POST">
		<input type="text" name="username" placeholder="username" required/>
		<input type="password" name="password" placeholder="password" required/>
		<input type="submit" value="Create a session" />
	</form>
</body>
</html>