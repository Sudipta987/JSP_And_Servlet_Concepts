<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- HTML Login JSP page (index.jsp):- -->
		<h1 style='color:purple'>User Login</h1>
		<form action="userLogin" method="post">
			<div>
				<label for="email">Email</label>
				<input id="email" name="email" type="email" placeholder="Enter user name or email" required>
			</div>
			<div>
				<label for="pass">Password</label>
				<input id="pass" name="pass" type="password" placeholder="Enter Password" required>
			</div>
			<div>
				<button type="submit">Submit</button>
			</div>
		</form>

</body>
</html>