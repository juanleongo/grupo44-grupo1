package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;



/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		if(request.getParameter("iniciar")!=null)	{
			String usuarios,claves;
			usuarios=request.getParameter("usuario");
			claves=request.getParameter("clave");
			if(usuarios.equals("admininicial") && claves.equals("admin123456")) {
				JOptionPane.showMessageDialog(null,"BIENVENIDO A LA LIBRERIA BOOK CITY");
				response.sendRedirect("principal.jsp");
			}else {
				JOptionPane.showMessageDialog(null,"DATOS ERRONEOS");
				response.sendRedirect("index.jsp");
			}
		}
	}

}
