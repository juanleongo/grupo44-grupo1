package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.ClientesDTO;
import modelo.Detalle_ventasDAO;
import modelo.Detalle_ventasDTO;
import modelo.ProductosDTO;
import modelo.VentasDAO;
import modelo.ventasDTO;

/**
 * Servlet implementation class Detalle_ventas
 */
@WebServlet("/Detalle_ventas")
public class Detalle_ventas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Detalle_ventas() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Detalle_ventasDAO DETADAO = new Detalle_ventasDAO();
		VentasDAO ventadao = new VentasDAO();
		
		
		if (request.getParameter("consultar") != null) {

			int codigo_producto = Integer.parseInt(request.getParameter("codigo_producto"));
			ProductosDTO deta = DETADAO.Buscar_Producto(codigo_producto);
			if (deta != null) {
				String nombre_producto;
				double precio_venta, ivacompra;
				codigo_producto = deta.getCodigo_producto();
				nombre_producto = deta.getNombre_productos();
				precio_venta = deta.getPrecio_venta();
				ivacompra = deta.getIvacompra();
				
				response.sendRedirect("ventas.jsp?codigo_producto=" + codigo_producto + "&&nombre_producto=" + nombre_producto
						+ "&&precio_venta=" + precio_venta+ "&&ivacompra="+ ivacompra);
			} else {

				response.sendRedirect("ventas.jsp?men=El Producto no Existe");

			}
		}

		
		if (request.getParameter("consultar1") != null) {

			int codigo_producto1 = Integer.parseInt(request.getParameter("codigo_producto1"));
			ProductosDTO deta = DETADAO.Buscar_Producto(codigo_producto1);
			if (deta != null) {
				String nombre_producto1;
				double precio_venta1,ivacompra1;
				 codigo_producto1 = deta.getCodigo_producto();
				nombre_producto1 = deta.getNombre_productos();
				precio_venta1 = deta.getPrecio_venta();
				ivacompra1 = deta.getIvacompra();
				
				response.sendRedirect("ventas.jsp?codigo_producto1=" + codigo_producto1 + "&&nombre_producto1="
						+ nombre_producto1 + "&&precio_venta1=" + precio_venta1
						+ "&&ivacompra1="+ ivacompra1);
			} else {
				response.sendRedirect("ventas.jsp?men=El Producto no Existe");

			}
		}
		if (request.getParameter("consultar2") != null) {

			 int codigo_producto2 = Integer.parseInt(request.getParameter("codigo_producto2"));
			ProductosDTO deta = DETADAO.Buscar_Producto(codigo_producto2);
			if (deta != null) {
				String nombre_producto2;
				double precio_venta2, ivacompra2;
				codigo_producto2 = deta.getCodigo_producto();
				nombre_producto2 = deta.getNombre_productos();
				precio_venta2= deta.getPrecio_venta();
				ivacompra2 = deta.getIvacompra();
				response.sendRedirect("ventas.jsp?codigo_producto2="+codigo_producto2+"&&nombre_producto2=" + nombre_producto2
					+"&&precio_venta2="+precio_venta2 +"&&ivacompra2="+ ivacompra2);
			} else {

				response.sendRedirect("ventas.jsp?men=El Producto no Existe");

			}
		}

		if (request.getParameter("consultar_cli") != null) {
			int cedula = Integer.parseInt(request.getParameter("cedula"));
			ClientesDTO cli = DETADAO.Buscar_Cliente(cedula);
			if (cli != null) {
				String nombre;
				cedula = cli.getCedula();
				nombre = cli.getNombre();
				response.sendRedirect("ventas.jsp?cedula=" + cedula + "&&nombre=" + nombre);
			} else {
				response.sendRedirect("ventass.jsp?men=El cliente no existe");
			}

		}
		

		if (request.getParameter("calcular") != null) {
			int cantidad = 0, cantidad1 = 0, cantidad2= 0,
					codigo_producto = 0, codigo_producto1= 0, codigo_producto2=0;
			double  
					precioV = 0 , precioV1 = 0 , precioV2=0,
					ivaProducto = 0,ivaProducto1 = 0,ivaProducto2 = 0,
					totalventaconiva = 0,totalventaconiva1 = 0,totalventaconiva2 = 0,
					totalVenta = 0 , totalVenta1 = 0 , totalVenta2=0,
					valorTotal =0, totalIva= 0, totalConIva = 0;

			
					
					
									
			cantidad = Integer.parseInt(request.getParameter("cantidad"));
			cantidad1 = Integer.parseInt(request.getParameter("cantidad1"));
			cantidad2 = Integer.parseInt(request.getParameter("cantidad2"));
			
			
			precioV= Double.parseDouble(request.getParameter("precioV"));
			precioV1= Double.parseDouble(request.getParameter("precioV1"));
			precioV2= Double.parseDouble(request.getParameter("precioV2"));
			
			codigo_producto = Integer.parseInt(request.getParameter("codigo_producto"));
			codigo_producto1 = Integer.parseInt(request.getParameter("codigo_producto1"));
			codigo_producto2 = Integer.parseInt(request.getParameter("codigo_producto2"));
			
			
			totalVenta = cantidad * precioV;
			totalVenta1 = cantidad1 * precioV1;
			totalVenta2 = cantidad2 * precioV2;
			
			ivaProducto = totalVenta / 100 * Double.parseDouble(request.getParameter("ivap")); 
			ivaProducto1 = totalVenta1 / 100 * Double.parseDouble(request.getParameter("ivap1")) ;
			ivaProducto2 = totalVenta2 / 100 * Double.parseDouble(request.getParameter("ivap2"));
			
			totalventaconiva = totalVenta + ivaProducto ;
			totalventaconiva1 = totalVenta1 + ivaProducto1 ;
			totalventaconiva2 = totalVenta2 + ivaProducto2;
			
			int codigoventa = ventadao.consultarCodigoventa();
			
			valorTotal = totalVenta+ totalVenta1+totalVenta2;
			totalIva = ivaProducto +ivaProducto1 + ivaProducto2;
			totalConIva = valorTotal + totalIva;
			
			response.sendRedirect("ventas.jsp?cantidad="+cantidad +"&&cantidad1="+cantidad1+"&&cantidad2="+cantidad2+"&&totalventa="+totalVenta+"&&totalventa1="+totalVenta1+"&&totalventa2="+totalVenta2+
					"&&totalventaconiva="+totalventaconiva+"&&totalventaconiva1="+totalventaconiva1+"&&totalventaconiva2="+totalventaconiva2+"&&valorTotal="+valorTotal+"&&totalIva="+totalIva+"&&totalConIva="+totalConIva+"&&codigoventa="+codigoventa);
					
	}else {
		
		
	}
		
	if (request.getParameter("confirmar") != null)	{
		
		try {
			int  cedulaUsuario = 12345;
			int  cedulaCliente0 = Integer.parseInt(request.getParameter("cedula"));
			int codigo_producto , codigo_producto1, codigo_producto2,
			cantidad, cantidad1,cantidad2,codigoventa=0;
			double  
			
			totalventaconiva = 0,totalventaconiva1 = 0,totalventaconiva2 = 0,
			totalVenta = 0 , totalVenta1 = 0 , totalVenta2=0,
			ivaProducto = 0,ivaProducto1 = 0,ivaProducto2 = 0,
			valorTotal =0, totalIva= 0, totalConIva = 0;
			
			
			
			totalIva = Double.parseDouble(request.getParameter("totalIva"));
			valorTotal = Double.parseDouble(request.getParameter("valorTotal"));
			totalConIva = Double.parseDouble(request.getParameter("totalConIva"));
			
			cantidad = Integer.parseInt(request.getParameter("cantidad"));
			cantidad1 = Integer.parseInt(request.getParameter("cantidad1"));
			cantidad2 = Integer.parseInt(request.getParameter("cantidad2"));
			
			ivaProducto =  Double.parseDouble(request.getParameter("ivap")); 
			ivaProducto1 = Double.parseDouble(request.getParameter("ivap1")) ;
			ivaProducto2 =  Double.parseDouble(request.getParameter("ivap2"));
			
			codigo_producto = Integer.parseInt(request.getParameter("codigo_producto"));
			codigo_producto1 = Integer.parseInt(request.getParameter("codigo_producto1"));
			codigo_producto2 = Integer.parseInt(request.getParameter("codigo_producto2"));
			
			totalventaconiva = Double.parseDouble(request.getParameter("valor_venta")); 
			
			totalventaconiva1 =Double.parseDouble(request.getParameter("valor_venta1"));
			totalventaconiva2 = Double.parseDouble(request.getParameter("valor_venta2"));
			
			totalVenta = Double.parseDouble(request.getParameter("totalventa"));
			totalVenta1 = Double.parseDouble(request.getParameter("totalventa1"));
			totalVenta2 = Double.parseDouble(request.getParameter("totalventa2"));
			
			
			ventasDTO venta = new ventasDTO( totalIva, valorTotal, totalConIva, cedulaCliente0, cedulaUsuario );
								
			Detalle_ventasDTO pruductoDTO1 = new Detalle_ventasDTO(cantidad , codigo_producto,codigoventa, totalventaconiva, totalVenta, ivaProducto);
			Detalle_ventasDTO pruductoDTO2 = new Detalle_ventasDTO(cantidad1 , codigo_producto1,codigoventa, totalventaconiva1, totalVenta1, ivaProducto1);
			Detalle_ventasDTO pruductoDTO3 = new Detalle_ventasDTO(cantidad2 , codigo_producto2,codigoventa, totalventaconiva2, totalVenta2, ivaProducto2);
			ventadao.crearVenta(venta, pruductoDTO1, pruductoDTO2, pruductoDTO3);
			response.sendRedirect("ventas.jsp?men=Venta creada con exito");
			
		}catch (Exception ex) {
			response.sendRedirect("ventas.jsp?men=El error en la operacion"+ ex);
		}
			
		
		
	}

}
}	
	
