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
<style type="text/css"> /*ESTILO DE VENTAS*/
	:root{
    --cream-brulee: #ffea9e;
    --buttercup: #f5b00b;
    --dark-ebony: #3d1f04;
}

*{
    padding: 0;
    margin: 0;
    box-sizing: 0;
}

ul .ventas{
    background-color: #f5af0b70;
    border-bottom-right-radius: 10px;
    border-bottom-left-radius: 10px;
}

.contenedor{
    display: flex;
    flex-wrap: wrap;


}

form{
    width: 100%;
    background-color: #fff5d3;
    display: flex;
    padding: 20px;
    margin: 10px;
    justify-content: space-around;
    align-items: center;
}

form div{
    display: flex;
    align-items: center;
    font-size: 1.1em;
    flex-wrap: wrap;
    font-family: 'Montserrat' , sans-serif
}

form input[type="text"], form input[type="number"]{
    width: 90%;
    padding: 10px 20px;
    margin: 5px;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
}



form input[type="submit"]{
    background-color:var(--buttercup);
    color: black;
    padding: 10px 20px;
    margin: 0 10px;
    border: none;
    border-radius: 10px;
    font-weight: bolder;
    transition: 0.4s;
    text-decoration: none;
}

.totales{
    display: flex;
    justify-content: end;
}


.final{
    width: 80%;

   
    
}
</style>



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


            <a href="" class="opcion">
                Reporte
            </a>
        
        </li>
            
        </ul>

         <h1>VENTAS</h1>

<%!String nombre_cliente="";
int cedula=0;
%>         
<% if(request.getParameter("cedula")!=null){
cedula=Integer.parseInt(request.getParameter("cedula"));
nombre_cliente= request.getParameter("nombre");

}
%> 
         

<div class="contenedor">
    <form action="Detalle_ventas" method="post">
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
    </form>



    <hr>
    
<%!String nombre_producto="", nombre_producto1="",nombre_producto2="", estado="";
int codigo_producto, codigo_producto1 ,codigo_producto2;
double valor_venta, valor_venta1, valor_venta2,
	   precio_venta,precio_venta1,precio_venta2,
       cantidad, cantidad1,cantidad2,
       valorTotal, totalIva ,totalConIva ;

%>

<%
if(request.getParameter("codigo_producto")!=null){
codigo_producto=Integer.parseInt(request.getParameter("codigo_producto"));
nombre_producto= request.getParameter("nombre_producto");
precio_venta= Double.parseDouble(request.getParameter("precio_venta"));
estado="disabled";
}
%>
<% 
if(request.getParameter("codigo_producto1")!=null){
codigo_producto1=Integer.parseInt(request.getParameter("codigo_producto1"));
nombre_producto1= request.getParameter("nombre_producto1");
precio_venta1= Double.parseDouble(request.getParameter("precio_venta1"));

}
%>
<% 
if(request.getParameter("codigo_producto2")!=null){
codigo_producto2=Integer.parseInt(request.getParameter("codigo_producto2"));
nombre_producto2= request.getParameter("nombre_producto2");
precio_venta2= Double.parseDouble(request.getParameter("precio_venta2"));

}

%>   
<%
if(request.getParameter("valorTotal")!=null){
	cantidad = Double.parseDouble(request.getParameter("cantidad"));
	cantidad1 = Double.parseDouble(request.getParameter("cantidad1"));
	cantidad2 = Double.parseDouble(request.getParameter("cantidad2"));
	valor_venta = Double.parseDouble(request.getParameter("valor_venta"));
	valor_venta1 = Double.parseDouble(request.getParameter("valor_venta1"));
	valor_venta2 = Double.parseDouble(request.getParameter("valor_venta2"));
	valorTotal = Double.parseDouble(request.getParameter("valorTotal"));
	totalIva = Double.parseDouble(request.getParameter("totalIva"));
	totalConIva = Double.parseDouble(request.getParameter("totalConIva"));
}
%>
    

    <form action="Detalle_ventas" method="post">
       
        <div><label>Codigo Producto:</label> <input type="text" name="codigo_producto" value="<%=codigo_producto%>"required> </div>
           
        <div>  <input type="submit" name="consultar" value="Consultar"> </div>
        <div><label>Nombre Producto</label> <input type="text" name="nombre_producto" value="<%=nombre_producto%>" readonly></div>

         <input type="hidden" name="precioV" value="<%=precio_venta%>">               

        <div><label>Cantidad:</label><input type="text" name="cantidad" value="<%=cantidad%>"> </div>

            
        <div><label>Valor Venta:</label><input type="text" name="valor_venta" value="<%=valor_venta%>">
			</div>
            
            
        
    </form>

    <hr>


      <form action="Detalle_ventas" method="post">
        
        <div><label>Codigo Producto:</label> <input type="text" name="codigo_producto1" value="<%=codigo_producto1%>"required> </div>
           
        <div>  <input type="submit" name="consultar1" value="Consultar">  </div>
        <div><label>Nombre Producto</label> <input type="text" name="nombre_producto1" value="<%=nombre_producto1%>"></div>

         <input type="hidden" name="precioV1" value="<%=precio_venta1%>">               

        <div><label>Cantidad:</label><input type="text" name="cantidad1" value="<%=cantidad1%>"> </div>

            
        <div><label>Valor venta:</label><input type="text" name="valor_venta1" value="<%=valor_venta1%>"></div>
    </form>

    <hr>


     <form action="Detalle_ventas" method="post">
       
        <div><label>Codigo Producto:</label> <input type="text" name="codigo_producto2" value="<%=codigo_producto2%>"required> </div>
           
        <div>  <input type="submit" name="consultar2" value="Consultar">   </div>
        <div><label>Nombre Producto</label> <input type="text" name="nombre_producto2" value="<%=nombre_producto2%>"></div>

         <input type="hidden" name="precioV2" value="<%=precio_venta2%>">               

        <div><label>Cantidad:</label><input type="text" name="cantidad2" value="<%=cantidad2%>"> </div>

            
        <div><label>Valor venta:</label><input type="text" name="valor_venta2" value="<%=valor_venta2%>"></div>
    </form>

</div>

<hr>

<div class="totales">
    <form action="Detalle_ventas"  method="post" class="final">
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
            <input type="submit" name="" value="Confirmar">
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