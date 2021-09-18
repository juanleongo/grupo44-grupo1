<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>usuarios</title>
</head>
<body>
 <div class="container">
        <h1>Usuarios </h1>
        <form action="" method="post">
            <h2>Registrar </h2>
            <div><label for="cedula">Cedula: </label><input type="text" name="cedula" value=""></div>
            <input type="hidden" name="cedu" value="">
            <div><label for="nombre">Nombre: </label><input type="text" name="nombre" value=""></div>
            <div><label for="telefono">Telefono: </label><input type="number" name="tel" value=""></div>
            <div><label for="direccion">Direccion: </label><input type="text" name="direccion" value=" "></div>
            <div><label for="mail" >E-mail: </label><input type="email" name="email" value=""></div>
            <div><input type="submit" name="insertar" value="Registrar">
                <input type="submit" name="actualizar" value="Actualizar">
                <input type="submit" name="eliminar" value="Eliminar">
            </div>

        </form>
        <div class="busqueda">
            <form action="" method="post">
                <fieldset>
                    <h4>Consultar:</h4>
                    <div><label>cedula: </label><input type="text" name="cedula">
                        <input type="submit" name="consultar" value="Consultar"></div>
                </fieldset>
            </form>

        </div>

        <div>
            <textarea name="formulario" rows="10" cols="40">Escribe aquí tus comentarios</textarea>
        </div>

    </div>

</body>
</html>