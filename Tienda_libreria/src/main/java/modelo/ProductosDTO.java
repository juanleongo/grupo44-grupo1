package modelo;

public class ProductosDTO {
	
	private int codigo_producto;
	private double ivacompra;
	private int nitprovedor;
	private String nombre_productos;
	private double precio_compra;
	private double precio_venta;
	

	public ProductosDTO(int codigo_producto, double ivacompra, int nitprovedor, String nombre_productos,
			double precio_compra, double precio_venta) {
		
		this.codigo_producto = codigo_producto;
		this.ivacompra = ivacompra;
		this.nitprovedor = nitprovedor;
		this.nombre_productos = nombre_productos;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
	}
	
	


	public ProductosDTO(int codigo_producto, String nombre_productos, double precio_venta) {
		
		this.codigo_producto = codigo_producto;
		this.nombre_productos = nombre_productos;
		this.precio_venta = precio_venta;
	}




	public int getCodigo_producto() {
		return codigo_producto;
	}


	public void setCodigo_producto(int codigo_producto) {
		this.codigo_producto = codigo_producto;
	}


	public double getIvacompra() {
		return ivacompra;
	}


	public void setIvacompra(double ivacompra) {
		this.ivacompra = ivacompra;
	}


	public int getNitprovedor() {
		return nitprovedor;
	}


	public void setNitprovedor(int nitprovedor) {
		this.nitprovedor = nitprovedor;
	}


	public String getNombre_productos() {
		return nombre_productos;
	}


	public void setNombre_productos(String nombre_productos) {
		this.nombre_productos = nombre_productos;
	}


	public double getPrecio_compra() {
		return precio_compra;
	}


	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}


	public double getPrecio_venta() {
		return precio_venta;
	}


	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	
	
	
	
	
	

}
