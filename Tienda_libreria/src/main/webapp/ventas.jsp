<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book City - Ventas</title>
<!------------ ESTILOS  ----------------->
<link rel="stylesheet" href="css/usuariosClientes.css">
<link rel="stylesheet" href="css/general.css">
<link rel="stylesheet" href="css/ventas.css">


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

        <li>

            <a href="productos.jsp" class="opcion">
                Productos
            </a>

        </li>

        <li class="ventas">

            <a href="ventas.jsp" class="opcion">
                Ventas
            </a>

        </li>

        <li>


            <a href="Reportes.jsp" class="opcion">
                Reportes
            </a>
        
        </li>
            
        </ul>

         <h1>VENTAS</h1>

<%!String nombre_cliente="";
String  cedula;
%>         
<% if(request.getParameter("cedula")!=null){
cedula=request.getParameter("cedula");
nombre_cliente= request.getParameter("nombre");

}
%> 
         

<div class="contenedor">
    <form action="Detalle_ventas" method="post">
    
    <div class="cliente">
        <div>
            <label>Cedula:</label>
            <input type="number" name="cedula" value="<%=cedula%>">
        </div>
        
        <div>
            <input type="submit" name="consultar_cli" value="Consultar">
        </div>

        <div>
            <label>Cliente:</label>
            <input type="text" name="nombre_cliente" value="<%=nombre_cliente%>">
        </div>

        <div>
            <label>Consec:</label>  <!-- PENDIENTE SABER DATO -->
            <input type="text" name="" value="">
        </div>
   

</div>

    
    
<%!String nombre_producto="", nombre_producto1="",nombre_producto2="", estado="";
int codigo_producto, codigo_producto1 ,codigo_producto2,
        cantidad  , cantidad1,cantidad2;
double totalventaconiva, totalventaconiva1,totalventaconiva2,
	   ivacompra , ivacompra1 , ivacompra2,
	   precio_venta,precio_venta1,precio_venta2,
       totalventa,totalventa1,totalventa2,
       valorTotal, totalIva ,totalConIva ;

%>

<%
if(request.getParameter("codigo_producto")!=null){
codigo_producto=Integer.parseInt(request.getParameter("codigo_producto"));
nombre_producto= request.getParameter("nombre_producto");
precio_venta= Double.parseDouble(request.getParameter("precio_venta"));
ivacompra = Double.parseDouble(request.getParameter("ivacompra"));
estado="disabled";
}
%>
<% 
if(request.getParameter("codigo_producto1")!=null){
codigo_producto1=Integer.parseInt(request.getParameter("codigo_producto1"));
nombre_producto1= request.getParameter("nombre_producto1");
precio_venta1= Double.parseDouble(request.getParameter("precio_venta1"));
ivacompra1 = Double.parseDouble(request.getParameter("ivacompra1"));

}
%>
<% 
if(request.getParameter("codigo_producto2")!=null){
codigo_producto2=Integer.parseInt(request.getParameter("codigo_producto2"));
nombre_producto2= request.getParameter("nombre_producto2");
precio_venta2= Double.parseDouble(request.getParameter("precio_venta2"));
ivacompra2 = Double.parseDouble(request.getParameter("ivacompra2"));

}

%>   
<%
if(request.getParameter("valorTotal")!=null){
	cantidad = Integer.parseInt(request.getParameter("cantidad"));
	cantidad1 = Integer.parseInt(request.getParameter("cantidad1"));
	cantidad2 = Integer.parseInt(request.getParameter("cantidad2"));
	totalventaconiva = Double.parseDouble(request.getParameter("totalventaconiva"));
	totalventaconiva1 = Double.parseDouble(request.getParameter("totalventaconiva1"));
	totalventaconiva2 = Double.parseDouble(request.getParameter("totalventaconiva2"));
	valorTotal = Double.parseDouble(request.getParameter("valorTotal"));
	totalIva = Double.parseDouble(request.getParameter("totalIva"));
	totalConIva = Double.parseDouble(request.getParameter("totalConIva"));
	totalventa = Double.parseDouble(request.getParameter("totalventa"));
	totalventa1 = Double.parseDouble(request.getParameter("totalventa1"));
	totalventa2 = Double.parseDouble(request.getParameter("totalventa2"));
	
}
%>
    
<div class="productos">

	<div class="productosGrande">
    
    
    <div class="individuales uno">
       
        <div><label>Codigo Producto:</label> <input type="text" name="codigo_producto" value="<%=codigo_producto%>"required> </div>
           
        <div>  <input type="submit" name="consultar" value="Consultar"> </div>
        <div><label>Nombre Producto</label> <input type="text" name="nombre_producto" value="<%=nombre_producto%>" readonly></div>

         <input type="hidden" name="precioV" value="<%=precio_venta%>">
          <input type="hidden" name="ivap" value="<%=ivacompra%>"> 
          <input type="hidden" name="totalventa" value="<%=totalventa%>">                              

        <div><label>Cantidad:</label><input type="text" name="cantidad" value="<%=cantidad%>"> </div>

            
        <div><label>Valor Venta:</label><input type="text" name="valor_venta" value="<%=totalventaconiva%>">
			</div>
            
            
        </div>
   



        <div class="individuales">
        
        <div><label>Codigo Producto:</label> <input type="text" name="codigo_producto1" value="<%=codigo_producto1%>"required> </div>
           
        <div>  <input type="submit" name="consultar1" value="Consultar">  </div>
        <div><label>Nombre Producto</label> <input type="text" name="nombre_producto1" value="<%=nombre_producto1%>"></div>

         <input type="hidden" name="precioV1" value="<%=precio_venta1%>">
         <input type="hidden" name="ivap1" value="<%=ivacompra1%>">
         <input type="hidden" name="totalventa1" value="<%=totalventa1%>">                   

        <div><label>Cantidad:</label><input type="text" name="cantidad1" value="<%=cantidad1%>"> </div>

            
        <div><label>Valor venta:</label><input type="text" name="valor_venta1" value="<%=totalventaconiva1%>"></div>
    

    </div>
    
    
       <div class="individuales">


     
       
        <div><label>Codigo Producto:</label> <input type="text" name="codigo_producto2" value="<%=codigo_producto2%>"required> </div>
           
        <div>  <input type="submit" name="consultar2" value="Consultar">   </div>
        <div><label>Nombre Producto</label> <input type="text" name="nombre_producto2" value="<%=nombre_producto2%>"></div>

         <input type="hidden" name="precioV2" value="<%=precio_venta2%>">
         <input type="hidden" name="ivap2" value="<%=ivacompra2%>">  
         <input type="hidden" name="totalventa2" value="<%=totalventa2%>">                 

        <div><label>Cantidad:</label><input type="text" name="cantidad2" value="<%=cantidad2%>"> </div>

            
        <div><label>Valor venta:</label><input type="text" name="valor_venta2" value="<%=totalventaconiva2%>"></div>
    
    </div>
    

</div>



<div class="precios">
    
        <div>
            <label>Valor Total:</label>
            <input type="text" name="valorTotal" value="<%=valorTotal%>">
        </div>

        <div>
            <label>Total Iva:</label>
            <input type="text" name="totalIva" value="<%=totalIva%>">
        </div>

        <div>
            <label>Total con Iva:</label>
            <input type="text" name="totalConIva" value="<%=totalConIva%>">
        </div>
        
        
        <div>
            
            <input type="submit" name="calcular" value="calcular">
        </div>

        <div>
            <input type="submit" name="confirmar" value="Confirmar">
        </div>
        
        
        
        
        </div>
        
        </div>
        
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
