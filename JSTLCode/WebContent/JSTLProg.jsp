<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL-1</title>
</head>
<h1>Program 1: To handel Exception in JSTL</h1>
<body>
<% 
int num1=10;
int num2 =0;
int res;
%>
<c:catch var="handle">
<%
res=num1/num2;
out.println(res);
%>
</c:catch>
<c:if test="${handle!=null}">
<p>Arithmetic Exception .Divide by Zero not Possible</p>
</c:if>
</body>
</html>