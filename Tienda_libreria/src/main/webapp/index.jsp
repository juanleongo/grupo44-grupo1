<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book City</title>

<!------------ ESTILOS  ----------------->
<link rel="stylesheet" href="css/index.css"> 


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

</head>
<body>
<form action = "Login" method ="post">
	<nav>
	 <a href="index.jsp">
            <div>
            <img src="img/logo.png" alt="">
            </div>
        </a>
    </nav>
    
    <section>
            <img src="img/fondo.jpg" alt="">

            <div class="izquierda">
                <h1>¡Bienvenido!</h1>
                <p>Una tienda especializada en la venta de libros de todo género, encontraras desde libros infantiles hasta los clásicos más conocidos.
                <p> Entra a nuestro sitio web y pide tus libros favoritos para que lleguen a la puerta de tu casa. 
                </p>
                <p class="ordena">Ordena Ya!!!</p> 

                <div class="imagen">
                    <img src="img/grafico.svg" alt="">
                
                </div>
            </div>

            <div class="derecha">
                <h2>Bienvenido</h2>
            <h3>Iniciar  sesión</h3>
            
           
            <div class="m-3">
              <label for="floatingInput">Usuario</label><input type="text"name ="usuario"class="form-control espacio" id="floatingInput" required>
              
               
            </div>
            <div class="m-3">
              <label for="floatingPassword">Contraseña</label>
                <input type="password"name="clave"class="form-control espacio" id="floatingPassword"required>
               
            </div>
            <div class="botones">
            <input type="submit"name="iniciar"  value="Iniciar Sesión">
            <input type="button" name="cancelar"value="Cancelar">
                
            </div>

       
        </div>
    </section>
    
     <footer >
            <div>
           © 2021 Copyright
            </div>
            </footer>
            
    </form>


</body>
</html>