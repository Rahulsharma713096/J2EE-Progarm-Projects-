<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert-JSTL-Data</title>
</head><h1>Data Insertion Page</h1>
<body>
<sql:setDataSource 
var="con"
driver="com.mysql.cj.jdbc.Driver"
url="jdbc:mysql://Localhost:3306/Student"
user="root"
password="12345678"
/>
<%= "connected" %>
<sql:update dataSource="${con}" var="res">
insert into info values(?,?,?,?,?,?);
<sql:param value="${param.usn}"/>
<sql:param value="${param.name}"/>
<sql:param value="${param.m1}"/>
<sql:param value="${param.phsy}"/>
<sql:param value="${param.chem}"/>
<sql:param value="${param.avg}"/>
</sql:update>
<%="Data ADDED" %>
<form action="GetData.jsp">
<label>Proeced To see Data</label>
<input type="submit" value="Procede">
</form>
</body>
</html>