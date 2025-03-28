<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Profile page (JSP) -->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name=(String) (request.getAttribute("name_key"));
%>
	<h3>Welcome:<%=name %></h3>
</body>
</html>