package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controlador.Conexion;

public class ProductosDAO {

	Conexion cnn= new Conexion();
	Connection conec=cnn.Conecta();
	PreparedStatement ps=null;
	ResultSet res=null;
	
public boolean Cargar_Productoscsv(String Ruta) {
		
		boolean resul=false;
		
		try {
		String sql="load data infile '"+Ruta+"' into table productos fields terminated by ',' lines terminated by '\r\n';";
		ps=conec.prepareStatement(sql);
		resul=ps.executeUpdate()>0;
		}catch(SQLException ex) {
			//JOptionPane.showMessageDialog(null,"Error al Cargar libros:   "+ex);
		}
		
		return resul;
	}






public ProductosDTO Buscar_Producto(int codigo_producto) {
	
	ProductosDTO pro=null;
	try {
	String sql="select * from productos where codigo_producto=?";
	ps=conec.prepareStatement(sql);
	ps.setInt(1, codigo_producto);
	res=ps.executeQuery();
	while(res.next()) {
		pro= new ProductosDTO(res.getInt(1),res.getDouble(2),res.getInt(3),res.getString(4), res.getDouble(5), res.getDouble(6));
	}
	}catch(SQLException ex) {
		//JOptionPane.showMessageDialog(null, "Error al Consultar"+ ex);
	}
	return pro;
}


public boolean Actualiza_Productos(ProductosDTO pro) {
	boolean resul=false;
	try {
	String sql="update productos set nombre_producto=?, precio_venta=?  where codigo_producto=?";
	ps = conec.prepareStatement(sql);
	ps.setString(1, pro.getNombre_productos());
	ps.setDouble(2, pro.getPrecio_venta());
	ps.setInt(3, pro.getCodigo_producto());
	resul=ps.executeUpdate()>0;
	}catch(SQLException ex) {
		//JOptionPane.showMessageDialog(null,"Error al Actualizar el producto"+ex);
	}
	return resul;
}
}
