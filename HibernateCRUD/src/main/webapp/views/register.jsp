<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${not empty successMsg }">
		<h4 style="color: green">${successMsg }</h4>
	</c:if>

	<c:if test="${not empty errorMsg }">
		<h4>${errorMsg }</h4>
	</c:if>

	<form action="submitform" method="post">
		Name: <input name="username" /> <br />
		<br /> Email: <input name="email" /><br />
		<br /> Password: <input name="password" type="password" /><br />
		<br /> <input type="submit" value="Register" /><br />
		<br />
	  AlreadyRegistered..? <a href="loginpage">Login</a>
	</form>
</body>
</html>