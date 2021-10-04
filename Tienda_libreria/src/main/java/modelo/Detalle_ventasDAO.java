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

	
	
	public Detalle_ventasDTO Buscar_Producto(int codigo_producto) {
		
		Detalle_ventasDTO deta=null;
		try {
		String sql="select * from productos where codigo_producto=?";
		ps=conec.prepareStatement(sql);
		
		ps.setInt(1,codigo_producto);
		res=ps.executeQuery();
		while(res.next()) {
			deta= new Detalle_ventasDTO(res.getInt(1),res.getDouble(2),res.getString(3));
		}
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"Error al Consultar el provedor"+ ex);
		}
		return deta;
	}
	
	
	

	

}
