<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Data from model: ${employee.name}</h2>
<h2>Data from model: ${employee.surname}</h2>
<h2>Data from model: ${employee.salary}</h2>
<h2>Data from model: ${employee.department}</h2>
<h2>english: ${employee.eng}</h2>
<h2>Books:
<ul>
<c:forEach var="pbooks" items="${employee.books}">
    <li>${pbooks}</li>
</c:forEach>
</ul>
</h2>

<br>
</body>
</html>