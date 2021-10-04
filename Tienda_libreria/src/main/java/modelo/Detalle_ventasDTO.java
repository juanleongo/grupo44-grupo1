package modelo;

public class Detalle_ventasDTO {
	
	private int codigo_detalle_venta;
	private int cantidad_producto;
	private int codigo_producto;
	private int codigo_venta;
	private double valor_total;
	private double valor_venta;
	private double valoriva;
	private String nombre_producto;
	
	


	public Detalle_ventasDTO(int codigo_producto, double valor_venta, String nombre_producto) {
		
		this.codigo_producto = codigo_producto;
		this.valor_venta = valor_venta;
		this.nombre_producto = nombre_producto;
	}



	public int getCodigo_detalle_venta() {
		return codigo_detalle_venta;
	}


	public void setCodigo_detalle_venta(int codigo_detalle_venta) {
		this.codigo_detalle_venta = codigo_detalle_venta;
	}


	public int getCantidad_producto() {
		return cantidad_producto;
	}


	public void setCantidad_producto(int cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}


	public int getCodigo_producto() {
		return codigo_producto;
	}


	public void setCodigo_producto(int codigo_producto) {
		this.codigo_producto = codigo_producto;
	}


	public int getCodigo_venta() {
		return codigo_venta;
	}


	public void setCodigo_venta(int codigo_venta) {
		this.codigo_venta = codigo_venta;
	}


	public double getValor_total() {
		return valor_total;
	}


	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}


	public double getValor_venta() {
		return valor_venta;
	}


	public void setValor_venta(double valor_venta) {
		this.valor_venta = valor_venta;
	}


	public double getValoriva() {
		return valoriva;
	}


	public void setValoriva(double valoriva) {
		this.valoriva = valoriva;
	}


	public String getNombre_producto() {
		return nombre_producto;
	}


	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	
	
	
	
	
	

}
