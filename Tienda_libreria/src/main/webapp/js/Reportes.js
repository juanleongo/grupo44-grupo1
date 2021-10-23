$(document).ready(function(){


function listaUsuarios(){
	
$.ajax({
	type:"post",
	url:"Reportes",
	dataType:"json",
	data:{opcion:"USUARIOS"},
	success: function(result){
		console.log(result)
		var tabla=document.getElementById("tabla")
		tabla.innerHTML=''
		tabla.innerHTML+=`<tr class="cssss">
		<th>CEDULA</th>
		<th>NOMBRE</th>
		<th>CONTRASENA</th>
		<th>EMAIL</th>
		<th>USUARIO</th>
		</tr>`
		for(let fila of result){
			tabla.innerHTML+=`<tr>
			
			<td>${fila.cedula}</td>
			<td>${fila.nombre}</td>
			<td>${fila.contrasena}</td>
			<td>${fila.email}</td>
			<td>${fila.usuario}</td>
			</tr>`
		}
	}
	
})
		
	}
	
function listaClientes(){
	
$.ajax({
	type:"post",
	url:"Reportes",
	dataType:"json",
	data:{opcion:"CLIENTES"},
	success: function(result){
		console.log(result) //Imprime Json
		var tabla=document.getElementById("tabla")
		tabla.innerHTML=''
		tabla.innerHTML+=`<tr class="cssss">
		<th>CEDULA</th>
		<th>DIRECCION</th>
		<th>EMAIL</th>
		<th>NOMBRE</th>
		<th>TELEFONO</th>
		</tr>`
		for(let fila of result){
			tabla.innerHTML+=`<tr>
			<td>${fila.cedula}</td>
			<td>${fila.direccion}</td>
			<td>${fila.email}</td>
			<td>${fila.nombre}</td>
			<td>${fila.telefono}</td>
			</tr>`
		}
	}
	
})

}	
	
	
	
function ventasClientes(){
	
$.ajax({
	type:"post",
	url:"Reportes",
	dataType:"json",
	data:{opcion:"VENTAS"},
	success: function(result){
		console.log(result) //Imprime Json
		var tabla=document.getElementById("tabla")
		tabla.innerHTML=''
		tabla.innerHTML+=`<tr class="cssss">
		<th> CEDULA</th>
		<th> NOMBRE </th>
		<th>  TOTAL DE VENTAS POR CLIENTE </th>
		</tr>`
		for(let fila of result){
			tabla.innerHTML+=`<tr>
			<td>${fila.cedula_clientes}</td>
			<td>${fila.nombre_cliente}</td>
			<td>${fila.total_venta}</td>
			
			</tr>`
		}
	}
	
})

}		
	
function verTotalVentas(){
		document.getElementById('total').style.display = "block"
	}

$('.listaUsuarios').on('click', function(){

	listaUsuarios();
})


$('.listaClientes').on('click',function(){

    listaClientes();


	
	})
$('.ventasClientes').on('click',function(){
     ventasClientes();
	verTotalVentas();

	
	})

	})

