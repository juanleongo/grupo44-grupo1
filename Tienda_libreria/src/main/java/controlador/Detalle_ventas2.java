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

/**
 * Servlet implementation class Detalle_ventas2
 */
@WebServlet("/Detalle_ventas2")
public class Detalle_ventas2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Detalle_ventas2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 Detalle_ventasDAO DETADAO=new Detalle_ventasDAO();
		  if(request.getParameter("consultar2")!=null) {
				
			   int codigo_producto=Integer.parseInt(request.getParameter("cod2"));
			   Detalle_ventasDTO deta=DETADAO.Buscar_Producto(codigo_producto);
				if(deta!=null) {
				String nombre;
				double valor;
				codigo_producto=deta.getCodigo_producto();
				nombre=deta.getNombre_producto();
				valor=deta.getValor_venta();
				response.sendRedirect("ventas.jsp?codigo_producto="+codigo_producto+"&&nombre_producto="+nombre+"&&valor_venta="+valor);
				}else
				{
					
					JOptionPane.showMessageDialog(null, "El producto no Existe");
					response.sendRedirect("ventas.jsp");
				}
			}
		
		
		
		
		
		
		
		
	}

}
