package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import controlador.Conexion;

public class Detalle_ventasDAO {
	

	Conexion cnn= new Conexion();
	Connection conec=cnn.Conecta();
	PreparedStatement ps=null;
	ResultSet res=null;

	
	
	public boolean crearVenta(ventas venta) {
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
	
	
	public ArrayList<ventas> cargarLibros(){
		
		ventas lib=null;
		ArrayList<ventas> lista= new ArrayList<>();
		try {
		String sql="select * from ventas";	
		ps=conec.prepareStatement(sql);
		res=ps.executeQuery();
		while(res.next()) {
			lib= new ventas(res.getInt(1),res.getDouble(2),res.getDouble(3),res.getDouble(4),res.getInt(1),res.getInt(1));
			lista.add(lib);
		}
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"Error al consultar la tabla de ventas" +ex);
		}
		 return lista;
	}  
	
	
	
}
	


	
	
