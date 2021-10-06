<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book City - Ventas</title>
<!------------ ESTILOS  ----------------->
<link rel="stylesheet" href="css/usuariosClientes.css">
<link rel="stylesheet" href="css/general.css">
<link rel="stylesheet" href="css/productos.css">



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

        <li class="productos">

            <a href="productos.jsp" class="opcion">
                Productos
            </a>

        </li>

        <li>

            <a href="ventas.jsp" class="opcion">
                Ventas
            </a>

        </li>

        <li>


            <a href="" class="opcion">
                Reporte
            </a>
        
        </li>
            
        </ul>
        
         <h1>Productos</h1>
         
        <div class="archivo"> 
        <h2>Subir Archivo</h2> 


		<form action="Productos" method="post" enctype="multipart/form-data" class="cargarSubir">
			<div><label>Archivo</label><input type="file" value="Examinar" name="archivo">
			
			<input type="submit" value="Cargar Archivo" name="cargar" class="subir">
			</div>
			</form>
			
			
<%!String nombre="", estado="";
int codigo, nit;
double iva, compra, venta;
%>
<%
if(request.getParameter("codigo")!=null){
codigo=Integer.parseInt(request.getParameter("codigo"));
iva = Double.parseDouble(request.getParameter("iva"));
nit = Integer.parseInt(request.getParameter("nit"));
nombre = request.getParameter("nombre");
compra = Double.parseDouble(request.getParameter("compra"));
venta = Double.parseDouble(request.getParameter("venta"));
estado="disabled";
}
%>
			
			<form action="Productos" method="post" class="cons" >
			<div>
				<label>Codigo Producto</label><input type="number" name="codigo" >
				<input type="submit" name="consultar" value="Consultar">
			</div>
			
			
			</form> 
			
			
			<form action="Productos" method="post" class="consultar">
			<div>
				<label>Codigo Producto<label><input type="number" name="codigo" value="<%=codigo%>"<%=estado%>>
				<input type="hidden" name="cod" value="<%=codigo%>">
			</div>
			
			<div>
				<label>Iva Compra<label><input type="number" name="iva" value="<%=iva%>"<%=estado%>>
			</div>
			
			<div>
				<label>Nit Proveedor<label><input type="number" name="nit" value="<%=nit%>"<%=estado%>>
			</div>
			
			<div>
				<label>Nombre Producto<label><input type="text" name="nombre" value="<%=nombre%>">
			</div>
			
			<div>
				<label>Precio Compra<label><input type="number" name="compra" value="<%=compra%>"<%=estado%>>
			</div>
			
			<div>
				<label>Precio Venta<label><input type="number" name="venta" value="<%=venta%>">
			</div>
			
			
			
			
			<input type="submit" name="actualizar" value="Actualizar">
			
			
			</form>
	
			

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