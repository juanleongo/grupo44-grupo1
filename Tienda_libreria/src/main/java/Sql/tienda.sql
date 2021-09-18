use tienda;

create table clientes(
cedula_cliente bigint(20) primary key not null,
direccion_ciente varchar(255) not null,
email_cliente varchar (255),
nombre_cliente varchar(255) not null,
telefono_cliente varchar (255) 
);

create table usuarios(
cedula_ussario bigint(20) primary key not null,
email_usuario varchar(255),
nombre_usuario varchar(255)not null,
password varchar(255)not null,
usuario varchar(255)not null
);

create table ventas(
codigo_venta bigint(20) primary key not null,
ivaventa double,
total_venta double,
valor_venta double,
cedula_clientes bigint(20) not null,
cedula_usuarios bigint(20) not null
);

create table provedores(
nitprovedores bigint(20) primary key,
ciudad_provedor varchar(255),
direccion_provedor varchar(255) not null,
nombre_provedor varchar(255) not null,
telefono_provedor varchar (255)
);

create table productos(
codigo_producto bigint(20) primary key,
ivacompra double,
nitprovedor bigint(20), 
nombre_producto varchar(255) not null,
precio_compra double,
precio_venta double
);

create table detalle_ventas (
codigo_detalle_venta bigint(20) primary key,
cantidad_producto int(11),
codigo_producto bigint(20),
codigo_venta bigint(20),
valor_total double,
valor_venta double,
valoriva double
);


alter table detalle_ventas add foreign key(codigo_venta) references ventas(codigo_venta);