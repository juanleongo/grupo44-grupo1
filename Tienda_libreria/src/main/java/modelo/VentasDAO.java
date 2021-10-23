package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	 ps.setInt(3,codigo_venta);
	 ps.setDouble(4,detaDTO.getValor_total());
	 ps.setDouble(5,detaDTO.getValor_venta());
	 ps.setDouble(6,detaDTO.getValoriva());
	 ven = ps.executeUpdate()>0;	
			
		}catch(SQLException ex) {
			//JOptionPane.showMessageDialog(null,"Error al insertar el detalle de ventas"+ ex);
		}
		return ven;
	}
	
	public int consultarCodigoventa() {
		int cod=0;
		
		try {
			
			String ordenar="SELECT codigo_venta FROM ventas ORDER BY codigo_venta DESC LIMIT  1";
			 ps=conec.prepareStatement(ordenar);
			 res=ps.executeQuery();
			 while(res.next()) {
				 cod=res.getInt(1);
			 }
		
		
		}catch(SQLException ex) {
			//JOptionPane.showMessageDialog(null,"Error al Consultar el codigo en la base de datos"+ ex);
		}
		return cod;
	}
	
	
	public boolean crearVenta(ventasDTO venta, Detalle_ventasDTO dvDTO1,Detalle_ventasDTO dvDTO2,Detalle_ventasDTO dvDTO3) {
		boolean bool = false;
		try {
			String insertar = "INSERT INTO ventas(ivaventa,total_venta,valor_venta,cedula_clientes,cedula_usuarios)VALUES(?,?,?,?,?)";
			ps=conec.prepareStatement(insertar);	
			ps.setDouble(1,venta.getIvaventa());
			ps.setDouble(2,venta.getTotal_venta());
			ps.setDouble(3,venta.getValor_venta());
			ps.setInt(4,venta.getCedula_clientes());
			ps.setInt(5,venta.getCedula_usuarios());
			bool = ps.executeUpdate()>0;
			if(bool) {
				
				int codigo = consultarCodigoventa();
				crearDetalleventas(dvDTO1, codigo);
				crearDetalleventas(dvDTO2, codigo);
				crearDetalleventas(dvDTO3, codigo);
			}
		} catch (SQLException sqle) {
			//JOptionPane.showMessageDialog(null, "Error al insertar la venta en dao. "+sqle);
		}
		return bool;
	}
	
public ArrayList<ventasDTO> cargar(){
		
		ventasDTO lib=null;
		ArrayList<ventasDTO> lista= new ArrayList<>();
		try {
		String sql=" select cedula_clientes, nombre_cliente, sum(total_venta) FROM clientes  INNER JOIN ventas ON cedula_cliente= cedula_clientes GROUP BY cedula_clientes;";	
		ps=conec.prepareStatement(sql);
		res=ps.executeQuery();
		while(res.next()) {
			//lib = new ventasDTO(res.getInt(1),res.getDouble(2), res.getDouble(3),res.getDouble(4) ,res.getInt(5),res.getInt(6));
			lib= new ventasDTO(res.getInt(1),res.getString(2),res.getDouble(3));
			lista.add(lib);
		}
		}catch(SQLException ex) {
			//JOptionPane.showMessageDialog(null,"Error al consultar la tabla de ventas" +ex);
		}
		 return lista;
	}  
	
	public String totalVentas() {
		String totalV = null;
		String consulta = "SELECT SUM(total_venta) FROM ventas;";
		try {
			ps = conec.prepareStatement(consulta);
			res = ps.executeQuery();
			while(res.next()) {
				totalV = res.getString(1);
			}
		} catch (SQLException sqle) {
		}
		return totalV;
	}

}
