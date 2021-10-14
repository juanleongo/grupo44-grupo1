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
		<th>CODIGO DE VENTA </th>
		<th>IVA DE VENTA </th>
		<th>TOTAL DE VENTA </th>
		<th>VALOR DE VENTA </th>
		<th>CEDULA DE CLIENTES </th>
		<th>CEDULA DE USUARIOS</th>
		</tr>`
		for(let fila of result){
			tabla.innerHTML+=`<tr>
			<td>${fila.codigo_venta}</td>
			<td>${fila.ivaventa}</td>
			<td>${fila.total_venta}</td>
			<td>${fila.valor_venta}</td>
			<td>${fila.cedula_clientes}</td>
			<td>${fila.cedula_usuarios}</td>
			
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
$('. ventasClientess').on('click',function(){
     ventasClientes();


	
	})

	})


	
	
	
	
