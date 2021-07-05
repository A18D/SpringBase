<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee info</title>
</head>
<body>
<h2>Employee info</h2>
<br>
<form:form action="saveEmployee" modelAttribute="employee" method="post">
    <form:hidden path="id"/>
    Name <form:input path="name"/>
    <br>
    Surname <form:input path="surname"/>
    <br>
    Department <form:input path="department"/>
    <br>
    Salary <form:input path="salary"/>
    <br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
