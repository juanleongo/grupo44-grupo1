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

<div class="contenedor">
    <form action="" method="post">
        <div>
            <label>Cedula:</label>
            <input type="number" name="" value="">
        </div>
        
        <div>
            <input type="submit" name="" value="Consultar">
        </div>

        <div>
            <label>Cliente:</label>
            <input type="text" name="" value="">
        </div>

        <div>
            <label>Consec:</label>  <!-- PENDIENTE SABER DATO -->
            <input type="text" name="" value="">
        </div>
    </form>



    <hr>
    
 <%!String nombre="", estado="";
int cod=0;
double valor=00;
%>
<%
if(request.getParameter("cod")!=null){
cod=Integer.parseInt(request.getParameter("codigo_producto"));
nombre= request.getParameter("nombre_producto");
valor=Double.parseDouble("valor_venta");
estado="disabled";
}
%>   
    

    <form action="Detalle_ventas" method="post">
       
        <div><label>Codigo Producto:</label> <input type="number" name="cod" value="<%=cod%>"required> </div>
           
        <div>  <input type="submit" name="consultar" value="Consultar">   </div>
        <div><label>Nombre Producto</label> <input type="text" name="nombre" value="<%=nombre%>" readonly></div>

         <input type="hidden" name="valor" value="<%=valor%>">               

        <div><label>Cantidad:</label><input type="number" name="" value=""> </div>

            
        <div><label>Valor Total:</label><input type="number" name="" value=""></div>
            
            
        
    </form>

    <hr>


      <form action="Detalle_ventas" method="post">
        
        <div><label>Codigo Producto:</label> <input type="number" name="cod" value="<%=cod%>"required> </div>
           
        <div>  <input type="submit" name="consultar1" value="Consultar">   </div>
        <div><label>Nombre Producto</label> <input type="text" name="nombre" value="<%=nombre%>"></div>

         <input type="hidden" name="valor" value="<%=valor%>">               

        <div><label>Cantidad:</label><input type="number" name="" value=""> </div>

            
        <div><label>Valor Total:</label><input type="number" name="" value=""></div>
    </form>

    <hr>


     <form action="Detalle_ventas" method="post">
       
        <div><label>Codigo Producto:</label> <input type="number" name="cod" value="<%=cod%>"required> </div>
           
        <div>  <input type="submit" name="consultar2" value="Consultar">   </div>
        <div><label>Nombre Producto</label> <input type="text" name="nombre" value="<%=nombre%>"></div>

         <input type="hidden" name="valor" value="<%=valor%>">               

        <div><label>Cantidad:</label><input type="number" name="" value=""> </div>

            
        <div><label>Valor Total:</label><input type="number" name="" value=""></div>
    </form>

</div>

<hr>

<div class="totales">
    <form action="" class="final">
        <div>
            <label>Valor Total:</label>
            <input type="number" name="" value="">
        </div>

        <div>
            <label>Total Iva:</label>
            <input type="number" name="" value="">
        </div>

        <div>
            <label>Total con Iva:</label>
            <input type="number" name="" value="">
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