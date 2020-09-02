<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL-SQL-1</title>
</head>
<body>
<sql:setDataSource 
var="con"
driver="com.mysql.cj.jdbc.Driver"
url="jdbc:mysql://Localhost:3306/Student"
user="root"
password="12345678"
/>
<%= "connected" %>
</body>
</html>