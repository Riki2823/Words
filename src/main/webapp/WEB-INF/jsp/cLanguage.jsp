<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Paises donde se habla ${language}</title>
</head>
<body>
<h1>Aqui tienes los paises donde se habla ${language}</h1>
<ul>
        <c:forEach items="${countries}" var="c">
            <p>${c.name}</p>
        </c:forEach>
</ul>
<body>
</html>