<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book City - Clientes</title>
<!------------ ESTILOS  ----------------->

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
     <style>
    
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

ul{
    background-color: var(--cream-brulee);
    display: flex;
    justify-content: space-around;
    height: 50px;
}

ul li{
    list-style: none;
    display: flex;
    align-items: center;
    padding: 20px;
    transition:0.4s;
    border-bottom-right-radius: 10px;
    border-bottom-left-radius: 10px;
}

ul li:hover{
	background-color:#F7C449;
	
}

ul li a{
    font-family: 'Montserrat', sans-serif;
    text-decoration: none;
    color: black;
    font-weight: 500;
    font-size: 1.2em;
}

ul li a:hover{
	color:black;
}

ul .usuario, ul .clientes, ul .proveedores, ul .productos{
    background-color: #f5af0b70;
    border-bottom-right-radius: 10px;
    border-bottom-left-radius: 10px;
}


h1{
    text-align: center;
    padding: 10px;
    font-family: 'Montserrat' , sans-serif;
    font-weight: bolder;
    text-transform: uppercase;
    font-size: 3.5em;
    color: var(--dark-ebony);
}


.contenedor{
    display: flex;
    justify-content:space-around ;
    margin: 20px;
}

.izquierda{
    width: 35%;
    height: 750px;
    margin: 30px 50px;
    background-color: #ffea9eda;
    border-radius: 20px;
}

.izquierda h2{
    text-align: center;
    font-family: 'Montserrat' , sans-serif;
    padding: 20px;
    width:100%;
    font-size: 2.3em;

}

.izquierda form{
    display: flex;
    flex-wrap: wrap;
    padding: 20px;
    justify-content: center;

}


.izquierda form div{

    margin: 8px  20px;
    font-size: 1.2em;
    width:100%;
    font-family: 'Montserrat' , sans-serif;
}

.izquierda form div input[type=text], 
.izquierda form div input[type=email],
.izquierda form div input[type=password],
.izquierda form div input[type=number]{
  width: 100%;
  padding: 10px 20px;
  margin: 5px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;

}


.izquierda form .botones{
    display: flex;
}

.izquierda form .botones input[type=submit]{
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


.izquierda form .botones input[type=submit]:hover{
    background-color: #a57a14;
}


.busquedaResultados{
    width:55%;
    height: 700px;
    margin: 30px;
    display:flex;
    flex-wrap:wrap;
    justify-content: center;
}

.busquedaResultados h4{
    text-align: center;
    font-family: 'Montserrat' , sans-serif;
    padding: 20px;
    font-size: 2.3em;
}


.busquedaResultados .busqueda form{
    display: flex;
    flex-wrap: wrap;
    padding: 20px;
    justify-content: center;



}


.busquedaResultados .busqueda form div{

        margin: 8px  20px;
        font-size: 1.3em;
        font-family: 'Montserrat' , sans-serif;
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
}
.busquedaResultados .busqueda form div input[type=number]{
  width: 100%;
  padding: 10px 20px;
  margin: 5px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;

}


.busquedaResultados form input[type=submit]{
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


.busquedaResultados form input[type=submit]:hover{
    background-color: #a57a14;
}

.busquedaResultados textarea{

    width: 100%;
    height: 300px;
    font-size: 1.2em;
    padding: 20px;
    border: none;
    margin-top: 30px;
    background-color: #f3c86221;


    resize: none;
    transition: 0.4s;
}


.busquedaResultados .imagen{
	display:flex;
	justify-content: center;
	width:70%; 
	height: 70%;
}

.busquedaResultados .imagen img{
	object-fit:cover;
	width:100%;
	height:100%;
	margin-left:200px;
}


footer div{
    width: 100%;
    height: 50px;
    background-color: rgba(0, 0, 0, 0.2);
    text-align: center;
    padding: 10px;
    font-size: 1.2em;
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

        <li class="clientes">
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

        <li>


            <a href="Reportes.jsp" class="opcion">
                Reportes
            </a>
        
        </li>
            
        </ul>
<%!String nombre="",direccion="",telefono="",email="", estado="";
int cedula=0;
%>
<%
if(request.getParameter("cedula")!=null){
cedula=Integer.parseInt(request.getParameter("cedula"));
nombre = request.getParameter("nombre");
direccion = request.getParameter("direccion");
telefono= request.getParameter("tel");
email = request.getParameter("email");
estado="disabled";
}
%>

<%
if(request.getParameter("men")!=null){
String mensaje=request.getParameter("men");
out.print("<script>alert('"+mensaje+"');</script>");
cedula=0;
nombre="";
direccion="";
telefono="";
email="";
}
%>
<h1>Clientes </h1>
<div class="contenedor">
        <div class="izquierda">
        <h2>Registrar </h2>
        <form action="Clientes" method="post">
            
            <div><label>Cedula: </label><input type="number" name="cedula" value="<%=cedula%>"<%=estado%>></div>
            <input type="hidden" name="ced" value="<%=cedula%>">
            <div><label>Direccion: </label><input type="text" name="direccion" value="<%=direccion%>"></div>
            <div><label>E-mail: </label><input type="email" name="email" value="<%=email%>"></div>
            <div><label>Nombre: </label><input type="text" name="nombre" value="<%=nombre%>"></div>
            <div><label>Telefono: </label><input type="text" name="tel" value="<%=telefono%>"></div>
            
            
           
            
             <div class="botones">
             <input type="submit" name="insertar" value="Registrar">
                <input type="submit" name="actualizar" value="Actualizar">
                <input type="submit" name="eliminar" value="Eliminar">
            </div>
            
             </form>
             </div>
            <div class="busquedaResultados">
        <div class="busqueda">
            
            <form action="Clientes" method="post">
                <fieldset>
                    <h4>Consultar:</h4>
                    
                    <div><label>Cedula: </label><input type="number" name="cedu">
                        <input type="submit" name="consultar" value="Consultar"></div>
                </fieldset>
            </form>
            
             
            <div class="imagen">
            	<img alt="" src="img/libros.png">
            </div>
            
             
            </div>

        
        </div>

    </div>


<footer >
    <div>
    © 2021 Copyright
    </div>
    </footer>
</body>
</html>