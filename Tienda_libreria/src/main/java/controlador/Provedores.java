package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.ProvedoresDAO;
import modelo.ProvedoresDTO;

/**
 * Servlet implementation class Provedores
 */
@WebServlet("/Provedores")
public class Provedores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Provedores() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProvedoresDAO proDAO= new ProvedoresDAO();
		if (request.getParameter("insertar")!=null) {
			int nit;
			String ciudad, direccion, nombre, telefono;
			nit = Integer.parseInt(request.getParameter("nit"));
			ciudad = request.getParameter("ciudad");
			direccion = request.getParameter("direccion");
			nombre = request.getParameter("nombre");
			telefono = request.getParameter("telefono");
			ProvedoresDTO pro= new ProvedoresDTO(nit, ciudad, direccion, nombre, telefono);
			if (proDAO.Inserta_Provedor(pro)) {
				JOptionPane.showMessageDialog(null, "Se registro el Proveedor exitosamente");
				response.sendRedirect("proveedores.jsp");
			}else {
				JOptionPane.showMessageDialog(null, "No se registro el Proveedor");
				response.sendRedirect("proveedores.jsp");
			}
		}
	}

}
