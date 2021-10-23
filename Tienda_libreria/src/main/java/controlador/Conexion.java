package controlador;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;


public class Conexion {
	private String bd="Grupo44_Equipo_1";
	private String url="jdbc:mariadb://prestamosvf.czo3ixoe3xoe.us-east-1.rds.amazonaws.com/"+bd;
	private String user="admin";
	private String pass="Ciclo3_admi123";
	Connection conec=null;
	
	public Connection Conecta() {
		
		try {
		Class.forName("org.mariadb.jdbc.Driver");	
		conec = DriverManager.getConnection(url,user,pass);
		//JOptionPane.showMessageDialog(null, "Conexion Ok.....");
		}catch(Exception e) {
			//JOptionPane.showMessageDialog(null, "Error en Conexion....."+e);
		}
		
		return conec;
	}

}
