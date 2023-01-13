<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Insertar Ciudad</title>
</head>
<body>
    <h1>Inserta una nueva ciudad</h1>
    <form action="/insertCity" method="post" id="insertarCiudad">
        <select name="country">
            <c:forEach items="${countries}" var="c">
                <option value="${c.name}">${c.name}</option>
            </c:forEach>
        </select>
        <br>
        <br>
        <label for="newCity">Nombre de tu ciudad</label>
        <br>
        <br>
        <input type="text" name="newCity"></input>
        <input  type="submit" value="Guardar"></input>
    </form>
    <br>
    <br>
    <a href="http://localhost:8080/home">Volver al inicio</a>

<body>
</html>