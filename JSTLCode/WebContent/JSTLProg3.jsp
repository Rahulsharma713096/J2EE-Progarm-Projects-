<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL-3</title>
</head>
<body>
<c:set var="Kat" value="2000" />
<h3>The Value before is:</h3>
<h2>
<c:out value="${Kat}"></c:out>
</h2>
<c:remove var="Kat"/>
<h3> The value After is:</h3>
<h2>
<c:out value="${Kat}"></c:out>
</h2>
</body>
</html>