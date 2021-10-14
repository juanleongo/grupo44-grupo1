$(document).ready(function(){


	
	console.log("Hola Muchachos grupo 44");


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
	
	


$('.listaUsuarios').on('click', function(){
	

	listaUsuarios();
})


$('.listaClientes').on('click',function(){
	
    listaClientes();


	
	})


	})


	
	
	
	
