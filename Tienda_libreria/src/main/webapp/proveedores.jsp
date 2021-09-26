<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book City - Proveedores</title>



</head>


<body>


<%!String ciudad="",direccion="",nombre="",telefono="", estado="";
int nit=0;
%>
<%
if(request.getParameter("nit")!=null){
nit=Integer.parseInt(request.getParameter("nit"));
ciudad = request.getParameter("ciudad");
direccion = request.getParameter("direccion");
nombre= request.getParameter("nombre");
telefono = request.getParameter("telefono");
estado="disabled";
}



%>


 <div class="contenedor">
        <h1> Proveedores</h1>
        <form action="Provedores" method="post">
            <h2>Registrar </h2>
            <div><label>NIT: </label><input type="number" name="nit" value="<%=nit%>"<%=estado%> required ></div>
            <input type="hidden" name="nitt" value="<%=nit%>">
           <div><label>Ciudad</label><input type="text" name="ciudad" value="<%=ciudad%>"></div>
            <div><label>Dirección: </label><input type="text" name="direccion" value="<%=direccion%>"></div>
             <div><label>Nombre Proveedor: </label><input type="text" name="nombre" value="<%=nombre%>"></div>
              <div><label>Teléfono</label><input type="text" name="telefono" value="<%=telefono%>"></div>
            <div><input type="submit" name="insertar" value="Registrar">
                <input type="submit" name="actualizar" value="Actualizar">
                <input type="submit" name="eliminar" value="Eliminar">
            </div>

        </form>
        <div class="busqueda">
            <form action="Provedores" method="post">
                <fieldset>
                    <h4>Consultar:</h4>
                    <div><label>NIT: </label><input type="number" name="nit">
                        <input type="submit" name="consultar" value="Consultar"></div>
                </fieldset>
            </form>

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