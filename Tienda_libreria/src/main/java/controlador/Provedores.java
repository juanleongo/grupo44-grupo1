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
import modelo.UsuariosDTO;

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
				response.sendRedirect("provedores.jsp?men=Se Registro el provedor Exitosamente!!");
			//	JOptionPane.showMessageDialog(null, "Se registro el Proveedor exitosamente");
				response.sendRedirect("proveedores.jsp");
			}else {
				JOptionPane.showMessageDialog(null, "No se registro el Proveedor");
				response.sendRedirect("proveedores.jsp");
			}
		}
		
            if(request.getParameter("consultar")!=null) {
			
            int nit_provedores=Integer.parseInt(request.getParameter("nit"));
            ProvedoresDTO pro=proDAO.Buscar_Provedores(nit_provedores);
			if(pro!=null) {
			String ciudad, direccion, nombre, telefono;
			nit_provedores=pro.getNit_provedores();
			ciudad=pro.getCiudad_provedor();
			direccion=pro.getDireccion_provedor();
			nombre=pro.getNombre_provedor();
			telefono=pro.getTelefono_provedor();
			response.sendRedirect("proveedores.jsp?nit="+nit_provedores+"&&ciudad="+ciudad+"&&direccion="+direccion+"&&nombre="
					+nombre+"&&telefono="+telefono);
			}else
			{
				
				JOptionPane.showMessageDialog(null, "El provedor no Existe");
				response.sendRedirect("proveedores.jsp");
			}
		}
            
            if(request.getParameter("actualizar")!=null) {
            	String ciudad,direccion,nombre,telefono;
            	int nit;
            	nit =Integer.parseInt(request.getParameter("nit"));
            	ciudad = request.getParameter("ciudad");
            	direccion = request.getParameter("direccion");
            	nombre = request.getParameter("nombre");
            	telefono= request.getParameter("telefono");
            	
            	ProvedoresDTO Prov= new ProvedoresDTO(nit,ciudad,direccion,nombre,telefono);
            	if(proDAO.Actualiza_Provedores(Prov)) {
            		//JOptionPane.showMessageDialog(null, "Se Actualizo exitosamente");
            		response.sendRedirect("usuarios.jsp?men=Provedor Actualizado");
            	}else {
            		//JOptionPane.showMessageDialog(null, "No se Actualizo.");
            		response.sendRedirect("usuarios.jsp?men=Error al Actualizar Provedor");
            	}
            	
            }
            if(request.getParameter("eliminar")!=null){
            	int nit;
            	nit=Integer.parseInt(request.getParameter("nitt")); // Hidden name= nitt
            	int opc=JOptionPane.showConfirmDialog(null,"Desea Eliminar Provedor nit: "+nit);
            	if(opc==0) { // si la opcion es si, marca 0 elimina
            		if (proDAO.Eliminar_Provedores(nit)) { 	
            		response.sendRedirect("proveedores.jsp?men=Provedor Eliminado");
            		}else {
            		response.sendRedirect("proveedores.jsp?men=Error al EliminarProvedor");
            	}
            	}else {
            		response.sendRedirect("proveedores.jsp");  // si es no o cancelar asigana valor 1 o 2 y redirecciona al formulario de nuevo
            	}    
		
		
		
	}

}
}	
