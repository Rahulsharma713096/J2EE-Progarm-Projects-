<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL-SQL-2</title>
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
<sql:query dataSource="${con}" var="res">
select * from info;
</sql:query>

 
<table border="2" width="100%">
<tr>
<th>USN</th>
<th>Name</th>
<th>M1</th>
<th>Phys</th>
<th>Chem</th>
<th>Avg</th>
</tr>
<c:forEach var="i" items="${res.rows}">
<tr>
<td align="center"><c:out value="${i.usn}"></c:out></td>
<td align="center"><c:out value="${i.name}"></c:out></td>
<td align="center"><c:out value="${i.m1}"></c:out></td>
<td align="center"><c:out value="${i.phsy}"></c:out></td>
<td align="center"><c:out value="${i.chem}"></c:out></td>
<td align="center"><c:out value="${i.avg}"></c:out></td>
</tr>
</c:forEach>

</table>
</body>
</html>