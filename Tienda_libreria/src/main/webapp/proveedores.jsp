<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div class="contenedor">
        <h1> Proveedores</h1>
        <form action="" method="post">
            <h2>Registrar </h2>
            <div><label>NIT: </label><input type="number" name="nit" value=""></div>
            <div><label>Nombre Proveedor: </label><input type="text" name="nombre" value=""></div>
            <div><label>Direcci�n: </label><input type="text" name="direccion" value=""></div>
            <div><label>Direccion: </label><input type="text" name="direccion" value=" "></div>
            <div><label>Tel�fono</label><input type="text" name="telefono" value=""></div>
            <div><label>Ciudad</label><input type="text" name="ciudad" value=""></div>
            <div><input type="submit" name="insertar" value="Registrar">
                <input type="submit" name="actualizar" value="Actualizar">
                <input type="submit" name="eliminar" value="Eliminar">
            </div>

        </form>
        <div class="busqueda">
            <form action="" method="post">
                <fieldset>
                    <h4>Consultar:</h4>
                    <div><label>NIT: </label><input type="number" name="nit">
                        <input type="submit" name="consultar" value="Consultar"></div>
                </fieldset>
            </form>

        </div>

    </div>

</body>
</html>