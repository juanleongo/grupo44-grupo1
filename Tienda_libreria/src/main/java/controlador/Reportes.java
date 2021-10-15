package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.google.gson.Gson;


import modelo.ClienteDAO;
import modelo.ClientesDTO;
import modelo.Detalle_ventasDAO;
import modelo.UsuariosDAO;
import modelo.UsuariosDTO;
import modelo.ventasDTO;

/**
 * Servlet implementation class Reportes
 */
@WebServlet("/Reportes")
public class Reportes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reportes() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String op=request.getParameter("opcion");
	//	JOptionPane.showMessageDialog(null, op);
		PrintWriter salida= response.getWriter();
			Gson datos= new Gson();
			
			if(op.equals("USUARIOS")) {
			UsuariosDAO USUDao= new UsuariosDAO();
				ArrayList<UsuariosDTO> lista= new ArrayList<>();
				lista=USUDao.cargarLibros();
				salida.println(datos.toJson(lista));


		}
		
			if(op.equals("CLIENTES")) {
				ClienteDAO pre= new ClienteDAO();
				ArrayList<ClientesDTO> lista= new ArrayList<>();
				lista=pre.cargarLibros();
				salida.println(datos.toJson(lista));
			}


			if(op.equals("VENTAS")) {
				Detalle_ventasDAO pre= new Detalle_ventasDAO();
				ArrayList<ventasDTO> lista= new ArrayList<>();
				lista=pre.cargarLibros();
				salida.println(datos.toJson(lista));
			}
			
			
			
}
}

