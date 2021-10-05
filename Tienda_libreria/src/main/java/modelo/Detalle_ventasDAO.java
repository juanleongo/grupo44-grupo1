package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controlador.Conexion;

public class Detalle_ventasDAO {
	

	Conexion cnn= new Conexion();
	Connection conec=cnn.Conecta();
	PreparedStatement ps=null;
	ResultSet res=null;

	
	
	public ProductosDTO Buscar_Producto(int codigo_producto) {
		
		ProductosDTO deta=null;
		try {
		String sql="SELECT codigo_producto, nombre_producto, precio_venta FROM productos where codigo_producto=?";
		ps=conec.prepareStatement(sql);		
		ps.setInt(1,codigo_producto);
		res=ps.executeQuery();
		while(res.next()) {
			deta = new ProductosDTO(res.getInt(1),res.getString(2),res.getDouble(3));
		}
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"Error al Consultar el productos"+ ex);
		}
		return deta;
		
		
	}
	
	/*
	
	public Detalle_ventasDTO valores(double valor) {
		Detalle_ventasDTO deta=null;
		Detalle_ventasDTO ventas = new Detalle_ventasDTO(0, valor, null);
	 //Consultar precio del libro que se presto
	 String sql="select precio_prestamo from libro where isbn=?";	
	 ps=conec.prepareStatement(sql);
	 ps.setDouble(1, ventas.getValor_venta() );
	 res=ps.executeQuery();
	 int precio=0;
	 while(res.next()) {
	  precio=res.getInt(1); 
	 }
	*/
	
	

	

}
	
	
