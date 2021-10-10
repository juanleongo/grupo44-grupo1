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
		<th>CONTRASEÑA</th>
		<th>EMAIL</th>
		<th>USUARIO</th>
		</tr>`
		for(let fila of result){
			tabla.innerHTML+=`<tr>
			<td>${fila.Cedula}</td>
			<td>${fila.Nombre}</td>
			<td>${fila.Contraseña}</td>
			<td>${fila.Email}</td>
			<td>${fila.Usuario}</td>
			</tr>`
		}
	}
	
})
		
	}
	


$('#listaUsuarios').on('click',function(){
	
alert("Entro a boton")	
	listaUsuarios();
})
	
	})

	
	


	
	
	
	
