<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
            <!-- Profile JSP page (profile.jsp):- -->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<%
			String name=(String) request.getAttribute("name_key");
			String email=(String) request.getAttribute("email");
			String gender=(String) request.getAttribute("gender");
			
			%>


	<h1 style="color:blue">Welcome <%= name %></h1>
    <div style="height:200px; border:1px solid black">
        <h2 style="color:green">Profile</h2>
        <h4 style="color:blue">Name: <%= name %></h4>
        <h4 style="color:blue">Email: <%= email %></h4>
        <h4 style="color:blue">Gender: <%= gender %></h4>
        
    </div>
</body>
</html>