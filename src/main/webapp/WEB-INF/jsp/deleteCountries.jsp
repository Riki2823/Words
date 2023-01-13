<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Eliminar paises segun su idioma</title>
</head>
<body>
<h1>Eliminar paises segun su idioma</h1>
<form action="/deleteCountysByLanguage" method="post" id="eliminarPaises">
    <select name="language">
        <c:forEach items="${lanugages}" var="l">
            <option value="${l.lName}">${l.lName}</option>
        </c:forEach>
    </select>
    <br>
    <br>
    <input  type="submit" value="Eliminar"></input>
</form>
<br>
<br>
<a href="http://localhost:8080/home">Volver al inicio</a>
<body>
</html>