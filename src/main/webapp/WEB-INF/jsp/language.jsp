<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Idiomas hablados en ${country}</title>
</head>
<body>
<h1>Aqui tienes los idiomas hablados en ${country}</h1>
    <table>
        <tr>
            <th>Nombre</th>
            <th>Paises en los que se habla este idioma</th>
        </tr>
        <c:forEach items="${languages}" var="l">
            <tr>
                <td><c:out value="${l.lName}"/></td>
                <td><a href="http://localhost:8080/language/${l.lName}">Paises donde se habla <c:out value="${l.lName}"/></a></td>
            </tr>
        </c:forEach>
    </table>

    <br>
    <br>
    <a href="http://localhost:8080/home">Volver al inicio</a>
<body>
</html>