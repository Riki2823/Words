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
                        <select name="countries">

                        </select>
                        <label for="newCity">Nombre de tu ciudad</label>
                        <br>
                        <br>
                        <input type="text" name="newCity"></input>
                        <input  type="submit" value="Guardar"></input>
    </form>

<body>
</html>