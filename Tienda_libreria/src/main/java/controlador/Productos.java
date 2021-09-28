package controlador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import javax.swing.JOptionPane;

import modelo.ProductosDAO;

/**
 * Servlet implementation class Productos
 */
@WebServlet("/Productos")
@MultipartConfig
public class Productos extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Productos() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductosDAO prodao = new ProductosDAO();
		
			if(request.getParameter("cargar")!=null) {
			
			Part archivo= request.getPart("archivo");
			//String Url="C:\\Users\\vivis\\eclipse-workspace\\Prestamos_44\\src\\main\\webapp\\Documentos\\";
			String Url="C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/";
			
			try {
			InputStream file= archivo.getInputStream();
			File copia = new File(Url+"productos.csv");
			FileOutputStream escribir= new FileOutputStream(copia);
			int num= file.read();
			while(num != -1) {
			 escribir.write(num);
			 num=file.read();
	      	}
			escribir.close();
			file.close();
			JOptionPane.showMessageDialog(null, "Se Cargo el Archivo Correctamente.");
			if(prodao.Cargar_Productoscsv(Url+"productos.csv")) {
				response.sendRedirect("productos.jsp?men=Se Inserto Los Libros Correctamente");
			}else
			{
				response.sendRedirect("productos.jsp?men=No se Insertgo los Libros");
			}
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Error de Archivo....."+e);
			}
			
			
		}
	
	}

}
