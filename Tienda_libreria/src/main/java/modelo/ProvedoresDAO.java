package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controlador.Conexion;
public class ProvedoresDAO {

	Conexion cnn= new Conexion();
	Connection conec=cnn.Conecta();
	PreparedStatement ps=null;
	ResultSet res=null;
	
	public boolean Inserta_Provedor(ProvedoresDTO pro) {
		boolean resul=false;
		try {
		String sql="insert into provedores values(?,?,?,?,?)";
		ps = conec.prepareStatement(sql);
		ps.setInt(1, pro.getNit_provedores());
		ps.setString(2, pro.getCiudad_provedor());
		ps.setString(3, pro.getDireccion_provedor());
		ps.setString(4, pro.getNombre_provedor());
		ps.setString(5, pro.getTelefono_provedor());
		resul=ps.executeUpdate()>0;
	 
		
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error al Insertar Provedor"+ex);
		}
		return resul;
	}
	
	
	public ProvedoresDTO Buscar_Provedores(int nit_provedores) {
		
		ProvedoresDTO pro=null;
		try {
		String sql="select * from provedores where nitprovedores=?";
		ps=conec.prepareStatement(sql);
		
		ps.setInt(1,nit_provedores);
		res=ps.executeQuery();
		while(res.next()) {
			pro= new ProvedoresDTO(res.getInt(1),res.getString(2),res.getString(3),res.getString(4), res.getString(5));
		}
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"Error al Consultar el provedor"+ ex);
		}
		return pro;
	}
	
	public boolean Actualiza_Provedores(ProvedoresDTO Prov) {
		boolean resul=false;
		try {
		String sql="update provedores set ciudad_provedor=?, direccion_provedor=?, nombre_provedor=?, telefono_provedor=? where nit_provedores=?";
		ps = conec.prepareStatement(sql);
		ps.setInt(1, Prov.getNit_provedores());
		ps.setString(2, Prov.getCiudad_provedor());
		ps.setString(3, Prov.getDireccion_provedor());
		ps.setString(4, Prov.getNombre_provedor());
		ps.setString(5, Prov.getTelefono_provedor());
		resul=ps.executeUpdate()>0;
		
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"Error al Actualizar el Provedores"+ex);
		}
		return resul;
	}
	
	public boolean Eliminar_Provedores(int nit_provedores) {
		boolean resul = false;
		try {
			String sql ="delete from provedores where nit_provedores=?";
			ps=conec.prepareStatement(sql);
			ps.setInt(1, nit_provedores);
			resul=ps.executeUpdate()>0;
			
		}catch(SQLException Q1) {
			JOptionPane.showMessageDialog(null, "Error de eliminacio"+Q1);
		}
		return resul;
	}	
	
}
