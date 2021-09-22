<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book City</title>

<!------------ ESTILOS  ----------------->
<link rel="stylesheet" href="css/principal.css">
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
        <a href="index.jsp">
            <div>
            <img src="img/logo.png" alt="">
            </div>
        </a>

        <a href="index.jsp" class="cerrar">
            <i class="fas fa-sign-out-alt"></i>
            Cerrar Sesión
        </a>
    </nav>
    <div class="grande">
        <div class="menu">
            <a href="usuarios.jsp" class="opcion">
                <div>
                    <img src="img/usuarios.png" alt="">
                </div>
                Usuarios
            </a>
            <a href="Clientes.jsp" class="opcion">
                <div>
                    <img src="img/clientes.png" alt="">
                </div>
                Clientes
            </a>

            <a href="" class="opcion">
                <div>
                    <img src="img/proveedor.png" alt="">
                </div>
                Proveedores
            </a>

            <a href="" class="opcion">
                <div>
                    <img src="img/productos.png" alt="">
                </div>
                Productos
            </a>

            <a href="" class="opcion">
                <div>
                    <img src="img/ventas.png" alt="">
                </div>
                Ventas
            </a>

            <a href="" class="opcion">
                <div>
                    <img src="img/reporte.png" alt="">
                </div>
                Reporte
            </a>
            
        </div>
        
    </div>
    

    <footer >
        <div>
        © 2021 Copyright
        </div>
        </footer>
      
</body>
</html>