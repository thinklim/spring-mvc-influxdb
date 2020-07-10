<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=utf-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hello</title>
</head>
<body>
    <h2>안녕하세요.</h2>

    <c:forEach items="${temperatures}" var="temperature">
        <c:out value="${temperature}"/>
    </c:forEach>
</body>
</html>