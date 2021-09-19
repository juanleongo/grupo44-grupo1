<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USUARIOS</title>
</head>
<body>
<%!String nombre="",password="",usuario="",email="", estado="";
int cedula=0;
%>
<%
if(request.getParameter("cedula")!=null){
cedula=Integer.parseInt(request.getParameter("cedula"));
nombre = request.getParameter("nombre");
password = request.getParameter("password");
usuario= request.getParameter("usuario");
email = request.getParameter("email");
estado="disabled";
}

%>

 <div class="container">
        <h1>Usuarios </h1>
        <form action="Login" method="post">
            <h2>Registrar </h2>
            <div><label for="cedula">Cedula: </label><input type="number" name="cedula" value="<%=cedula%>"<%=estado%>></div>
            <input type="hidden" name="ced" value="<%=cedula%>">
            <div><label for="nombre">Nombre: </label><input type="text" name="nombre" value="<%=nombre%>"></div>
            <div><label for="telefono">Contraseña: </label><input type="text" name="password" value="<%=password%>"></div>
              <div><label for="mail" >E-mail: </label><input type="email" name="email"  value="<%=email%>"></div>
            <div><label for="direccion">Usuario: </label><input type="text" name="usuario"  value="<%=usuario%>"></div>
          
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
<%
if(request.getParameter("men")!=null){
String mensaje=request.getParameter("men");
out.print("<script>alert('"+mensaje+"');</script>");
}
%>
</body>
</html>