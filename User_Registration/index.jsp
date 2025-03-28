<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
			<!-- HTML form(Signup Page) -->
<body>
		<h1><b>SignUp Page</b></h1>
		<form action="regForm" method="post">
			<div>
				<label for="name">Name</label>
				<input id="name" name="name" type="text" placeholder="Enter Your Name" required>
			</div>
			<div>
				<label for="email">Email</label>
				<input id="email" name="email" type="email" placeholder="Enter Your Eamil" required>
			</div>
			<div>
				<label for="pass">Password</label>
				<input id="pass" name="pass" type="password" placeholder="Enter Password" required>
			</div>
			<div>
				<label for="gender">Gender</label>
				<select id="gender" name="gender" required>
					<option value="" disabled selected>Select Gender</option>
					<option value="male">Male</option>
					<option value="female">Female</option>
					<option value="other">Other</option>
				</select>
			</div>
			<div>
				<button type="submit">Register</button>
			</div>
		</form>
</body>
</html>