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

import modelo.ProductosDTO;
import modelo.ClientesDTO;
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
			//JOptionPane.showMessageDialog(null, "Se Cargo el Archivo Correctamente.");
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
			
			
			if(request.getParameter("consultar")!=null) {

				int codigo=Integer.parseInt(request.getParameter("codigo"));
				ProductosDTO pro=prodao.Buscar_Producto(codigo);
				if(pro!=null) {
				String nombre;
				double iva, compra, venta;
				int nit;
				codigo=pro.getCodigo_producto();
				iva=pro.getIvacompra();
				nit=pro.getNitprovedor();
				nombre = pro.getNombre_productos();
				compra = pro.getPrecio_compra();
				venta = pro.getPrecio_venta();
				response.sendRedirect("productos.jsp?codigo="+codigo+"&&iva="+iva+"&&nit="+nit+"&&nombre="+nombre+
						"&&compra="+compra+"&&venta="+venta);
				}else
				 {
					JOptionPane.showMessageDialog(null, "El Producto no Existe");
					response.sendRedirect("productos.jsp");
				}
			}
			
			if(request.getParameter("actualizar")!=null) {
				String nombre;
				double venta;
				int codigo;
				codigo =Integer.parseInt(request.getParameter("cod"));
				nombre = request.getParameter("nombre");
				venta = Double.parseDouble(request.getParameter("venta"));
				
				ProductosDTO pro= new ProductosDTO(codigo, nombre, venta);
				if(prodao.Actualiza_Productos(pro)) {
					response.sendRedirect("productos.jsp?men=Se Actualizo el Producto exitosamente!!");
				}else {
					response.sendRedirect("productos.jsp?men=No se Actualizo el Producto.....");
				}

			}
	
	}

}
