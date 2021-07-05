<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
</head>
<body>

<form:form method="POST" commandName="user" modelAttribute="user" action="checkUser" class="box login">

    <fieldset class="boxBody">

        <form:label path="name">Name:</form:label>
        <form:input path="name"/>

        <form:label path="password">Password:</form:label>
        <form:password path="password"/>

    </fieldset>

    <footer>
        <form:checkbox path="admin"/>
        <form:label path="admin">Admin</form:label>
        <input type="submit" class="btnLogin" value="Login">
    </footer>
</form:form>
</body>
</html>