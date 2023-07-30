<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.example.demo.*" %>
    <%@ page import="java.util.* "%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Student> s=(List<Student>)request.getAttribute("list"); %>
<table border="1">
<tr><th>Sid</th><th>Sname</th><th>Semail</th></tr>
<%for(Student ss:s){ %>

<tr><td><%=ss.getId() %></td><td><%=ss.getName() %></td><td><%=ss.getEmail() %></td></tr>

<%} %>
</table>

</body>
</html>