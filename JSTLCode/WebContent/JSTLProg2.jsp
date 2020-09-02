<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL-2</title>
</head>
<h2>Program 2:Looping in JSTL code.</h2>
<body>
<c:forEach var="i" begin="1" end="5">
Good Morning !! Hello Rahul --<c:out value="${i}"></c:out>
<br>
</c:forEach>
</body>
</html>