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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Detalle_ventasDAO DETADAO = new Detalle_ventasDAO();

		if (request.getParameter("consultar") != null) {

			int codigo_producto = Integer.parseInt(request.getParameter("codigo_producto"));
			ProductosDTO deta = DETADAO.Buscar_Producto(codigo_producto);
			if (deta != null) {
				String nombre_producto;
				double precio_venta;
				codigo_producto = deta.getCodigo_producto();
				nombre_producto = deta.getNombre_productos();
				precio_venta = deta.getPrecio_venta();
				response.sendRedirect("ventas.jsp?codigo_producto=" + codigo_producto + "&&nombre_producto=" + nombre_producto
						+ "&&precio_venta=" + precio_venta);
			} else {

				JOptionPane.showMessageDialog(null, "El producto no Existe");

				response.sendRedirect("ventas.jsp");
			}
		}

		
		if (request.getParameter("consultar1") != null) {

			int codigo_producto1 = Integer.parseInt(request.getParameter("codigo_producto1"));
			ProductosDTO deta = DETADAO.Buscar_Producto(codigo_producto1);
			if (deta != null) {
				String nombre_producto1;
				double precio_venta1;
				codigo_producto1 = deta.getCodigo_producto();
				nombre_producto1 = deta.getNombre_productos();
				precio_venta1 = deta.getPrecio_venta();
				response.sendRedirect("ventas.jsp?codigo_producto1=" + codigo_producto1 + "&&nombre_producto1="
						+ nombre_producto1 + "&&precio_venta1=" + precio_venta1);
			} else {

				JOptionPane.showMessageDialog(null, "El producto no Existe");

				response.sendRedirect("ventas.jsp");
			}
		}
		if (request.getParameter("consultar2") != null) {

			int codigo_producto2 = Integer.parseInt(request.getParameter("codigo_producto2"));
			ProductosDTO deta = DETADAO.Buscar_Producto(codigo_producto2);
			if (deta != null) {
				String nombre_producto2;
				double precio_venta2;
				codigo_producto2 = deta.getCodigo_producto();
				nombre_producto2 = deta.getNombre_productos();
				precio_venta2= deta.getPrecio_venta();
				response.sendRedirect("ventas.jsp?codigo_producto2=" + codigo_producto2 + "&&nombre_producto2=" + nombre_producto2
						+ "&&precio_venta2=" + precio_venta2);
			} else {

				JOptionPane.showMessageDialog(null, "El producto no Existe");

				response.sendRedirect("ventas.jsp");
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
				JOptionPane.showMessageDialog(null, "El Cliente No existe");
				response.sendRedirect("ventas.jsp");
			}

		}
		

		if (request.getParameter("calcular") != null) {
			double cantidad = 0, cantidad1 = 0, cantidad2= 0, 
					precioV = 0 , precioV1 = 0 , precioV2=0,
					ivaProducto = 0,ivaProducto1 = 0,ivaProducto2 = 0,
					totalVenta = 0 , totalVenta1 = 0 , totalVenta2=0,
					valorTotal =0, totalIva= 0, totalConIva = 0;
					
										
			cantidad = Double.parseDouble(request.getParameter("cantidad"));
			cantidad1 = Double.parseDouble(request.getParameter("cantidad1"));
			cantidad2 = Double.parseDouble(request.getParameter("cantidad2"));
			
			precioV= Double.parseDouble(request.getParameter("precioV"));
			precioV1= Double.parseDouble(request.getParameter("precioV1"));
			precioV2= Double.parseDouble(request.getParameter("precioV2"));
			
			totalVenta = cantidad * precioV;
			totalVenta1 = cantidad1 * precioV1;
			totalVenta2 = cantidad2 * precioV2;
			
			ivaProducto = totalVenta / 100 * 19 ;
			ivaProducto1 = totalVenta1 / 100 * 19 ;
			ivaProducto2 = totalVenta2 / 100 * 19 ;
			
			valorTotal = totalVenta+ totalVenta1+totalVenta2;
			totalIva = ivaProducto +ivaProducto1 + ivaProducto2;
			totalConIva = valorTotal + totalIva;
			
			response.sendRedirect("ventas.jsp?cantidad="+cantidad +"&&cantidad1="+cantidad1+"&&cantidad2="+cantidad2+
					"&&totalVenta="+totalVenta+"&&totalVenta1="+totalVenta1+"&&totalVenta2="+totalVenta2+"&&valorTotal="+valorTotal+"&&totalIva="+totalIva+"&&totalConIva="+totalConIva);
					
	}else {
		
		
	}

}
}	
	
