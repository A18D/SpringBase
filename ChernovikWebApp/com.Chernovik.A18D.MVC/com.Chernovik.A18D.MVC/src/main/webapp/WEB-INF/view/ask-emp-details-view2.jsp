<!DOCTYPE HTML>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h2>Dear employee, please enter your details</h2>
<br>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
   <!-- <form:option value="RUB" label = "rubl"/>
    <form:option value="USA" label = "dollar"/>
    <form:option value="JPY" label = "iena"/>--!>
    </form:select>
    <br><br>
    Are you know english?
    <form:radiobuttons path="eng" items="${employee.lang}"/>
    <!--Yes <form:radiobutton path="eng" value = "Yes"/>
    No <form:radiobutton path="eng" value = "No"/>--!>
    <br><br>
    Books
        <!--Pushkin <form:checkbox path="books" value="AS_Pushkin"/>
        Goncharov <form:checkbox path="books" value="I_Goncharov"/>
        Mitchell <form:checkbox path="books" value="M_Mitchell"/>
        Sabbatini <form:checkbox path="books" value="R_Sabbatini"/>--!>
    <form:checkboxes path="books" items="${employee.booksMap}"/>
    <br><br>
   <input type="submit" value="OK">
</form:form>
</body>
</html>