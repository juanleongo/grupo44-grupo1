package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.ClienteDAO;
import modelo.ClientesDTO;

/**
 * Servlet implementation class Clientes
 */
@WebServlet("/Clientes")
public class Clientes extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Clientes() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ClienteDAO cliente = new ClienteDAO();

		if(request.getParameter("insertar")!=null) {
			String direccion,email,nombre,telefono;
			Double cedula;
			cedula =Double.parseDouble(request.getParameter("cedula"));
			nombre = request.getParameter("nombre");
			direccion = request.getParameter("direccion");
			telefono= request.getParameter("telefono");
			email = request.getParameter("email");
			ClientesDTO clienteDTO= new ClientesDTO(cedula,nombre,direccion,telefono,email);
			if(cliente.Inserta_Clientes(clienteDTO)) {
				//JOptionPane.showMessageDialog(null, "Se Registro el cliente Exitosamente!!");
				response.sendRedirect("Clientes.jsp?men=Se Registro el Cliente Exitosamente!!");
			}else {
				//JOptionPane.showMessageDialog(null, "No se Registro el Usuario.....");
				response.sendRedirect("Clientes.jsp?men=No se Registro el  Cliente.....");
			}

		} 
		
		if(request.getParameter("consultar")!=null) {

			Double cedula=Double.parseDouble(request.getParameter("cedu"));
			ClientesDTO cli=cliente.Buscar_Cliente(cedula);
			if(cli!=null) {
			String nombre,direccion,telefono,email;
			cedula=cli.getCedula();
			nombre=cli.getNombre();
			direccion=cli.getDireccion();
			telefono=cli.getTelefono();
			email=cli.getEmail();
			response.sendRedirect("Clientes.jsp? formulario="+cedula+"&&formulario="+nombre+"&&formulario="
					+direccion+"&&formulario="+telefono+"&&formulario="+email);
			}else
			 {
				JOptionPane.showMessageDialog(null, "El Cliente no Existe");
				response.sendRedirect("Clientes.jsp");
			}
		}
		if(request.getParameter("actualizar")!=null) {
			String nombre,direccion,telefono,email;
			Double cedula;
			cedula =Double.parseDouble(request.getParameter("ced"));
			nombre = request.getParameter("nombre");
			direccion = request.getParameter("direccion");
			telefono= request.getParameter("telefono");
			email = request.getParameter("email");
			ClientesDTO cli= new ClientesDTO(cedula,nombre,direccion,telefono,email);
			if(cliente.Actualiza_Clientes(cli)) {
				//JOptionPane.showMessageDialog(null, "Se Actualizo el cliente exitosamente!!!");
				response.sendRedirect("Clientes.jsp?men=Se Actualizo el Cliente exitosamente!!");
			}else {
				//JOptionPane.showMessageDialog(null, "No se Actualizo el cliente.....");
				response.sendRedirect("Clientes.jsp?men=No se Actualizo el Cliente.....");
			}

		}
		if(request.getParameter("eliminar")!=null){
			double cedula;
			cedula=request.getParameter("cedu"); /* Hidden name= cedu*/
			int op=JOptionPane.showConfirmDialog(null,"Desea Eliminar Clinte cedu: "+cedula);
			if(op==0) { /* si la opcion es si, marca 0 elimina*/
				if (cliente.Eliminar_Cliente(cedula)) {
				response.sendRedirect("Clientes.jsp?men=Cliente Eliminado");
				}else {
				response.sendRedirect("Clientes.jsp?men=Cliente No Eliminado");
			}
			}else {
				response.sendRedirect("Clientes.jsp");  /* si es no o cancelar asigana valor 1 o 2 y redirecciona al formulario de nuevo*/
			}
			}

	}	

		
	}

			
