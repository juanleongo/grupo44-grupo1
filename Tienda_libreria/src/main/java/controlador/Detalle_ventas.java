package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

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

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 Detalle_ventasDAO DETADAO=new Detalle_ventasDAO();
		 
		  if(request.getParameter("consultar")!=null) {
				
			   int codigo_producto=Integer.parseInt(request.getParameter("cod"));
			   ProductosDTO deta = DETADAO.Buscar_Producto(codigo_producto);
				if(deta!=null) {
				String nombre;
				double valor;
				codigo_producto=deta.getCodigo_producto();
				nombre=deta.getNombre_productos();
				valor=deta.getPrecio_venta();
				response.sendRedirect("ventas.jsp?codigo_producto="+codigo_producto+"&&nombre_producto="+nombre+"&&valor_venta="+valor);
				}else
				{
					
					JOptionPane.showMessageDialog(null, "El producto no Existe");
					
					response.sendRedirect("ventas.jsp");
				}
			}
			
		
	
		  if(request.getParameter("consultar1")!=null) {
				
			   int codigo_producto=Integer.parseInt(request.getParameter("cod"));
			   ProductosDTO deta = DETADAO.Buscar_Producto(codigo_producto);
				if(deta!=null) {
				String nombre;
				double valor;
				codigo_producto=deta.getCodigo_producto();
				nombre=deta.getNombre_productos();
				valor=deta.getPrecio_venta();
				response.sendRedirect("ventas.jsp?codigo_producto="+codigo_producto+"&&nombre_producto="+nombre+"&&valor_venta="+valor);
				}else
				{
					
					JOptionPane.showMessageDialog(null, "El producto no Existe");
					
					response.sendRedirect("ventas.jsp");
				}
			}
		  if(request.getParameter("consultar2")!=null) {
				
			   int codigo_producto=Integer.parseInt(request.getParameter("cod"));
			   ProductosDTO deta = DETADAO.Buscar_Producto(codigo_producto);
				if(deta!=null) {
				String nombre;
				double valor;
				codigo_producto=deta.getCodigo_producto();
				nombre=deta.getNombre_productos();
				valor=deta.getPrecio_venta();
				response.sendRedirect("ventas.jsp?codigo_producto="+codigo_producto+"&&nombre_producto="+nombre+"&&valor_venta="+valor);
				}else
				{
					
					JOptionPane.showMessageDialog(null, "El producto no Existe");
					
					response.sendRedirect("ventas.jsp");
				}
			}
		
					
				
			
				

}
	}

