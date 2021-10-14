<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="js/Reportes.js"></script>

<!------------ ESTILOS  ----------------->
<link rel="stylesheet" href="css/usuariosClientes.css">
<link rel="stylesheet" href="css/general.css">
<link rel="stylesheet" href="css/reportes.css">



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

<title>Book City - Reportes</title>
<style type="text/css">
	ul .reportes{
	background-color: #f5af0b70;
    border-bottom-right-radius: 10px;
    border-bottom-left-radius: 10px;	
	}
</style>
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
        <li>
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

            <a href="ventas.jsp" class="opcion">
                Ventas
            </a>

        </li>

        <li class="reportes">


            <a href="Reportes.jsp" class="opcion">
                Reportes
            </a>
        
        </li>
            
        </ul>
    <div class="contenedor">
	<div class="listas">

		<div><button class="listaUsuarios">Lista usuarios</button></div>
		
		<div><button class="listaClientes">Listado Clientes</button></div>
	<div><button class="ventasClientes">Ventas Clientes</button></div>
	

		
	</div>
	<div class="tablaLista">
<table id="tabla">	
</table>
</div>

</div>

<footer >
    <div>
    © 2021 Copyright
    </div>
    </footer>
</body>
</html>