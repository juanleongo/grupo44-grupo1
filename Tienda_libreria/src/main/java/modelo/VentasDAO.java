package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controlador.Conexion;

public class VentasDAO {
	
	Conexion cnn= new Conexion();
	Connection conec=cnn.Conecta();
	PreparedStatement ps=null;
	ResultSet res=null;

	
	public boolean crearDetalleventas(Detalle_ventasDTO detaDTO,int codigo_venta) {
		boolean ven=false;
		try {
			
	 String insertar="INSERT INTO detalle_ventas(cantidad_producto, codigo_producto,codigo_venta,valor_total, valor_venta,valoriva)VALUES(?,?,?,?,?,?)";	
	  ps=conec.prepareStatement(insertar);	
	 ps.setInt(1,detaDTO.getCantidad_producto());
	 ps.setInt(2,detaDTO.getCodigo_producto());
	 ps.setInt(3,detaDTO.getCodigo_venta());
	 ps.setDouble(4,detaDTO.getValor_total());
	 ps.setDouble(5,detaDTO.getValor_venta());
	 ps.setDouble(6,detaDTO.getValoriva());
		
			
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"Error al insertar el detalle de ventas"+ ex);
		}
		return ven;
	}
	
	public int consultarCodigoventa(Detalle_ventasDTO detaDTO,int codigo_venta) {
		int cod=0;
		
		try {
			
			String ordenar="SELECT codigo_venta FROM ventas ORDEN BY codigo_venta DESC LIMIT 1;";
			 ps=conec.prepareStatement(ordenar);
			 res=ps.executeQuery();
			 while(res.next()) {
				 cod=res.getInt(1);
			 }
		
		
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"Error al Consultar el codigo en la base de datos"+ ex);
		}
		return cod;
	}
	
	public boolean crearVenta(ventasDTO venta) {
		boolean ven=false;

		try {


		String insertar="INSERT INTO ventas(ivaventa,total_venta,valor_venta,cedula_clientes,cedula_usuarios)VALUES(?,?,?,?,?)";
		ps=conec.prepareStatement(insertar);	
		ps.setDouble(1,venta.getIvaventa());
		ps.setDouble(2,venta.getTotal_venta());
		ps.setDouble(3,venta.getValor_venta());
		ps.setInt(4,venta.getCedula_clientes());
		ps.setInt(5,venta.getCedula_usuarios());

		ven=ps.executeUpdate()>0;

		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"Error al insertar la venta "+ ex);
		}
		return ven;


	} 

}
