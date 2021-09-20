package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;


import modelo.UsuariosDAO;
import modelo.UsuariosDTO;



@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
      
    }

	
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
		
		UsuariosDAO usuDAO = new UsuariosDAO();
		
		if(request.getParameter("insertar")!=null) {
			String nombre,password,usuario,email;
			Double cedula;
			cedula =Double.parseDouble(request.getParameter("cedula"));
			nombre = request.getParameter("nombre");
			password = request.getParameter("password");
			usuario= request.getParameter("usuario");
			email = request.getParameter("email");
			UsuariosDTO usu= new UsuariosDTO(cedula,nombre,password,usuario,email);
			if(usuDAO.Inserta_Usuario(usu)) {
				//JOptionPane.showMessageDialog(null, "Se Registro el Usuario Exitosamente!!");
				response.sendRedirect("usuarios.jsp?men=Se Registro el Usuario Exitosamente!!");
			}else {
				//JOptionPane.showMessageDialog(null, "No se Registro el Usuario.....");
				response.sendRedirect("usuarios.jsp?men=No se Registro el  Usuario.....");
			}
			
		}
		
		if(request.getParameter("consultar")!=null) {
			
			Double cedula=Double.parseDouble(request.getParameter("cedu"));
			UsuariosDTO usu=usuDAO.Buscar_Usuario(cedula);
			if(usu!=null) {
			String nombre,password,usuario,email;
			cedula=usu.getCedula();
			nombre=usu.getNombre();
			password=usu.getPassword();
			usuario=usu.getUsuario();
			email=usu.getEmail();
			response.sendRedirect("usuarios.jsp? formulario="+cedula+"&&formulario="+nombre+"&&formulario="
					+password+"&&formulario="+usuario+"&&formulario="+email);
			}else
			{
				JOptionPane.showMessageDialog(null, "El Usuario no Existe");
				response.sendRedirect("usuarios.jsp");
			}
		}
		
		if(request.getParameter("actualizar")!=null) {
			String nombre,password,usuario,email;
			Double cedula;
			cedula =Double.parseDouble(request.getParameter("ced"));
			nombre = request.getParameter("nombre");
			password = request.getParameter("password");
			usuario= request.getParameter("usuario");
			email = request.getParameter("email");
			UsuariosDTO usu= new UsuariosDTO(cedula,nombre,password,usuario,email);
			if(usuDAO.Actualiza_Usuario(usu)) {
				//JOptionPane.showMessageDialog(null, "Se Actualizo el Usuario exitosamente!!!");
				response.sendRedirect("usuarios.jsp?men=Se Actualizo el Usuario exitosamente!!");
			}else {
				//JOptionPane.showMessageDialog(null, "No se Actualizo el Usuario.....");
				response.sendRedirect("usuarios.jsp?men=No se Actualizo el Usuario.....");
			}
			
		}
		if(request.getParameter("eliminar")!=null){
			double cedula;
			cedula=request.getParameter("ced"); // Hidden name= ced
			int op=JOptionPane.showConfirmDialog(null,"Desea Eliminar Usuario ced: "+cedula);
			if(op==0) { // si la opcion es si, marca 0 elimina
				if (usuDAO.Eliminar_Usuario(cedula)) { 	
				response.sendRedirect("usuarios.jsp?men=Usuario Eliminado");
				}else {
				response.sendRedirect("usuarios.jsp?men=Usuario No Eliminado");
			}
			}else {
				response.sendRedirect("usuarios.jsp");  // si es no o cancelar asigana valor 1 o 2 y redirecciona al formulario de nuevo
			}
			}
	}
		
		
		
	}



