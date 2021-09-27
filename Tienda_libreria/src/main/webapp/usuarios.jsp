<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book City - Usuarios</title>
<!------------ ESTILOS  ----------------->
<link rel="stylesheet" href="css/usuariosClientes.css">
<link rel="stylesheet" href="css/general.css">


<!------------ FUENTES ----------------->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;
0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;
1,700;1,800;1,900&display=swap" rel="stylesheet">

<!------------ FLATICON ----------------->
    <link rel="shortcut icon" href="img/books.png" type="image/x-icon">
 
<!------------ BOOTSTRAP ---------------->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" 
crossorigin="anonymous">

<!------------- FONTAWESOME ------------->
    <script src="https://kit.fontawesome.com/3d8a730b5e.js" crossorigin="anonymous"></script>
</head>
<body>
<nav>
        <a href="principal.jsp">
            <div>
            <img src="img/logo.png" alt="">
            </div>
        </a>

        <a href="index.jsp" class="cerrar">
            <i class="fas fa-sign-out-alt"></i>
            Cerrar Sesión
        </a>
    </nav>
    
    <ul>
        <li class="usuario">
            <a href="usuarios.jsp" class="opcion">
                Usuarios
            </a>
        </li>

        <li>
            <a href="Clientes.jsp" class="opcion">
                Clientes
            </a>
        </li>

        <li>

            <a href="proveedores.jsp" class="opcion">
                Proveedores
            </a>

        </li>

        <li>

            <a href="productos.jsp" class="opcion">
                Productos
            </a>

        </li>

        <li>

            <a href="" class="opcion">
                Ventas
            </a>

        </li>

        <li>


            <a href="" class="opcion">
                Reporte
            </a>
        
        </li>
            
        </ul>
        
        
<%!String nombre="",contraseña="",usuario="",email="", estado="";
int cedula=0;
%>
<%
if(request.getParameter("cedula")!=null){
cedula=Integer.parseInt(request.getParameter("cedula"));
nombre = request.getParameter("nombre");
contraseña = request.getParameter("password");
usuario= request.getParameter("usuario");
email = request.getParameter("email");
estado="disabled";
}



%>
 
        <h1>Usuarios </h1>
        <div class="contenedor">
        <div class="izquierda">
        <h2>Registrar </h2>
        
        <form action="Login" method="post">
           
            <div><label>Cedula: </label><input type="number" name="cedula" value="<%=cedula%>"<%=estado%>></div>
            <input type="hidden" name="ced" value="<%=cedula%>">
            <div><label>Nombre: </label><input type="text" name="nombre" value="<%=nombre%>"></div>
            <div><label>Contraseña: </label><input type="password" name="password" value="<%=contraseña%>"></div>
              <div><label>E-mail </label><input type="email" name="email"  value="<%=email%>"></div>
            <div><label>Usuario</label><input type="text" name="usuario"  value="<%=usuario%>"></div>
          
            <div class="botones">
            <input type="submit" name="insertar" value="Registrar">
                <input type="submit" name="actualizar" value="Actualizar">
                <input type="submit" name="eliminar" value="Eliminar">
            </div>
    
        </form>
        </div>
        <div class="busquedaResultados">
        <div class="busqueda">
            <form action="Login" method="post">
                <fieldset>
                    <h4>Consultar:</h4>
                    <div><label>Cedula: </label><input type="number" name="cedu">
                        <input type="submit" name="consultar" value="Consultar"></div>
                </fieldset>
            </form>

        </div>
        <div class="imagen">
            	<img alt="" src="img/tienda.png">
            </div>
        

        
        </div>

    </div>
<%
if(request.getParameter("men")!=null){
String mensaje=request.getParameter("men");
out.print("<script>alert('"+mensaje+"');</script>");
}
%>

<footer >
    <div>
    © 2021 Copyright
    </div>
    </footer>
    
    
</body>
</html>