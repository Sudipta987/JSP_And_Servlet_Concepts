<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
			<!-- JSP welcome page(Welcome.jsp): -->
<body>		
		<%
		String name=(String) (request.getAttribute("name_key"));
		%>
		<h2 style='color:purple'>Welcome , <%=name %></h2>
</body>
</html>