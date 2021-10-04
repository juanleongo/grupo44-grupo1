<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="css/ventas.css">
</head>
<body>



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
            <label>Pendiente:</label>  <!-- PENDIENTE SABER DATO -->
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
cod=Integer.parseInt(request.getParameter("cod"));
nombre= request.getParameter("nombre");
valor=Double.parseDouble("valor");
estado="disabled";
}
%>   
    

    <form action="Detalle_ventas" method="post">
       
        <div><label>Codigo Producto:</label> <input type="number" name="cod" value="<%=cod%>"required> </div>
           
        <div>  <input type="submit" name="consultar" value="consultar">   </div>
        <div><label>Nombre Producto</label> <input type="text" name="nombre" value="<%=nombre%>"></div>

         <input type="hidden" name="valor" value="<%=valor%>">               

        <div><label>Cantidad:</label><input type="number" name="" value=""> </div>

            
        <div><label>Valor Total:</label><input type="number" name="" value=""></div>
            
            
        
    </form>

    <hr>


      <form action="Detalle_ventas" method="post">
        
        <div><label>Codigo Producto:</label> <input type="number" name="cod1" value="<%=cod%>"required> </div>
           
        <div>  <input type="submit" name="consultar1" value="consultar">   </div>
        <div><label>Nombre Producto</label> <input type="text" name="nombre" value="<%=nombre%>"></div>

         <input type="hidden" name="valor1" value="<%=valor%>">               

        <div><label>Cantidad:</label><input type="number" name="" value=""> </div>

            
        <div><label>Valor Total:</label><input type="number" name="" value=""></div>
    </form>

    <hr>


     <form action="Detalle_ventas2" method="post">
       
        <div><label>Codigo Producto:</label> <input type="number" name="cod2" value="<%=cod%>"required> </div>
           
        <div>  <input type="submit" name="consultar2" value="consultar">   </div>
        <div><label>Nombre Producto</label> <input type="text" name="nombre" value="<%=nombre%>"></div>

         <input type="hidden" name="valor2" value="<%=valor%>">               

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
</body>
</html>