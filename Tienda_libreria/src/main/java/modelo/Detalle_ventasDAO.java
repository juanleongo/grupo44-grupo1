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
	
	public ClientesDTO Buscar_Cliente (int cedula) {
		

    	ClientesDTO cli=null;
    	try {
    	String sql="SELECT cedula_cliente,nombre_cliente FROM clientes where cedula_cliente=?";
    	ps=conec.prepareStatement(sql);
    	ps.setInt(1, cedula);
    	res=ps.executeQuery();
    	while(res.next()) {
    		cli= new ClientesDTO(res.getInt(1),res.getString(2));
    	}
    	}catch(SQLException ex) {
    		JOptionPane.showMessageDialog(null, "Error al Consultar"+ ex);
    	}
    	return cli;
    }
    
// }
	
	
	
	public double valor_venta (double valor,double valor1, double valor2) {
		
		double valor_venta = valor + valor1 + valor2;
		return valor_venta;
		
	}
}
	


	
	
