<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

 <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>   

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--  <%
 String name =request.getAttribute("label").toString();
 out.println(name);
 %> --%>
 

 <%-- ${label} <br> <!-- this is expression language -->
 <c:out value="Hello World"></c:out> --%>
 
<%--  ${s.name} --%>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/learning" user="root" password="vipul"/>
<sql:query var="rs" dataSource="${db}">select * from customer</sql:query>
<c:forEach items="${rs.rows}" var="customer">
<br><c:out value="${customer.id}"></c:out></c:forEach>
 

</body>
</html>