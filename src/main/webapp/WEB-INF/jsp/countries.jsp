<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Paises</title>
<style>

    table {
        border-collapse: collapse;
        margin: 5%;
    }

    td, th {
        border: 5px solid black;
        text-align: left;
        padding: 8px;
        text-align: center;

    }
</style>
</head>
<body>
<h1>Lista de paises</h1>
    <table>
        <tr>
            <th>Pais</th>
            <th>Codigo</th>
            <th>Enlace a las ciudades</th>
            <th>Enlace a los idiomas</th>
        </tr>
        <c:forEach items="${countries}" var="c">
            <tr>
                <td><c:out value="${c.name}"/></td>
                <td><c:out value="${c.code}"/></td>
                <td><a href="http://localhost:8080/cities/${c.code}">Ciudades de <c:out value="${c.name}"/></a></td>
                <td><a href="http://localhost:8080/languages/${c.code}">Lenguajes de <c:out value="${c.name}"/></a></td>
            </tr>
        </c:forEach>
    </table>
<body>
</html>