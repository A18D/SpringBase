<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: BURUKHINAP
  Date: 01.04.2021
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All employees</title>
</head>
<body>
<h3>Information for all employees</h3><br>
<security:authorize access="hasRole('HR')">
<input type="button" value="Salary"
    onclick="window.location.href='hr_info'">
Only for HR staff
</security:authorize>
<security:authorize access="hasRole('MANAGER')">
<br>
<input type="button" value="Performance"
       onclick="window.location.href='manager_info'">
Only for managers
</security:authorize>

</body>
</html>
