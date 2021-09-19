<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CLIENTES</title>
</head> 
<body>
<div class="container">
        <h1>CLIENTES </h1>
        <form action="Login" method="post">
            <h2>Registrar </h2>
            <div><label for="cedula">Cedula </label><input type="number" name="cedula" value=""></div>
            <input type="hidden" name="ced" value="">
            <div><label for="nombre">Nombre: </label><input type="text" name="nombre" value=""></div>
            <div><label for="telefono">Direccion: </label><input type="text" name="password" value=""></div>
              <div><label for="mail" >E-mail: </label><input type="email" name="email"  value=""></div>
            <div><label for="direccion">Telefono:</label><input type="text" name="usuario"  value=">"></div>
          
            <div><input type="submit" name="insertar" value="Registrar">
                <input type="submit" name="actualizar" value="Actualizar">
                <input type="submit" name="eliminar" value="Eliminar">
            </div>

        </form>
        <div class="busqueda">
            <form action="Login" method="post">
                <fieldset>
                    <h4>Consultar:</h4>
                    <div><label>Cedula: </label><input type="number" name="cedu">
                        <input type="submit" name="consultar" value="Consultar"></div>
                </fieldset>
            </form>

        </div>

        <div>
            <textarea name="formulario" rows="10" cols="40">Escribe aquí .</textarea>
        </div>

    </div>
</body>
</html>