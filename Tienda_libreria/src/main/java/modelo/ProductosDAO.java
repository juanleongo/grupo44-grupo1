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
			JOptionPane.showMessageDialog(null,"Error al Cargar libros:   "+ex);
		}
		
		return resul;
	}
}
