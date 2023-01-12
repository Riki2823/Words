<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Bienvenido a words</title>
</head>
<body>
<h1>Aqui tienes las ciudades de ${country}</h1>
<ul>
        <c:forEach items="${cities}" var="c">
            <p>${c.name}</p>
        </c:forEach>
</ul>
<body>
</html>