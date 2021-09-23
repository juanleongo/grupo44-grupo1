package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controlador.Conexion;


public class UsuariosDAO {
	
		Conexion cnn= new Conexion();
		Connection conec=cnn.Conecta();
		PreparedStatement ps=null;
		ResultSet res=null;
		
		public boolean Inserta_Usuario(UsuariosDTO usu) {
			boolean resul=false;
			try {
			String sql="insert into usuarios values(?,?,?,?,?)";
			ps = conec.prepareStatement(sql);
			ps.setInt(1, usu.getCedula());
			ps.setString(4, usu.getEmail());
			ps.setString(2, usu.getNombre());
			ps.setString(3, usu.getContraseña());
			ps.setString(5, usu.getUsuario());
			resul=ps.executeUpdate()>0;	
			}catch(SQLException ex) {
				JOptionPane.showMessageDialog(null,"Error al Insertar el usuario"+ex);
			}
			return resul;
		}
		
		
		public UsuariosDTO Buscar_Usuario(int cedula) {
			
			UsuariosDTO usu=null;
			try {
			String sql="select * from usuarios where cedula_ussario=?";
			ps=conec.prepareStatement(sql);
			
			ps.setInt(1,cedula);
			res=ps.executeQuery();
			while(res.next()) {
				usu= new UsuariosDTO(res.getInt(1),res.getString(2),res.getString(3),res.getString(4), res.getString(5));
			}
			}catch(SQLException ex) {
				JOptionPane.showMessageDialog(null,"Error al Consultar el usuario"+ ex);
			}
			return usu;
		}
			
		
		public boolean Actualiza_Usuario(UsuariosDTO usu) {
			boolean resul=false;
			try {
			String sql="update usuarios set email_usuario=?, nombre_usuario=?, password=?, usuario=? where cedula_ussario=?";
			ps = conec.prepareStatement(sql);
			
			ps.setString(1, usu.getEmail());
			ps.setString(2, usu.getNombre());
			ps.setString(3, usu.getContraseña());
			ps.setString(4, usu.getUsuario());
			ps.setInt(5, usu.getCedula());
			resul=ps.executeUpdate()>0;	
			}catch(SQLException ex) {
				JOptionPane.showMessageDialog(null,"Error al Actualizar el usuario"+ex);
			}
			return resul;
		}
		public boolean Eliminar_Usuario(int cedula) {
			boolean resul = false;
			try {
				String sql ="delete from usuarios where cedula_ussario=?";
				ps=conec.prepareStatement(sql);
				ps.setInt(1, cedula);
				resul=ps.executeUpdate()>0;
				
			}catch(SQLException Q) {
				JOptionPane.showMessageDialog(null, "Error de eliminacion "+Q);
			}
			return resul;
				
			}
}

