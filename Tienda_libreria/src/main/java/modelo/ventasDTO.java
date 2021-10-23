package modelo;

public class ventasDTO {
	private int codigo_venta;	
	private double ivaventa;
	private double total_venta;
	private double valor_venta;
	private int cedula_clientes;
	private int cedula_usuarios;
	private String nombre_cliente;
	
	
	
	public ventasDTO(int cedula_clientes, String nombre_cliente ,double total_venta) {
		
		this.total_venta = total_venta;
		this.cedula_clientes = cedula_clientes;
		this.nombre_cliente= nombre_cliente;
	}


	public ventasDTO(int codigo_venta, double ivaventa, double total_venta, double valor_venta, int cedula_clientes,
			int cedula_usuarios) {
	
		this.codigo_venta = codigo_venta;
		this.ivaventa = ivaventa;
		this.total_venta = total_venta;
		this.valor_venta = valor_venta;
		this.cedula_clientes = cedula_clientes;
		this.cedula_usuarios = cedula_usuarios;
	}


	public ventasDTO(int codigo_venta) {
	
		this.codigo_venta = codigo_venta;
	}


	public ventasDTO( double ivaventa, double total_venta, double valor_venta, int cedula_clientes,
			int cedula_usuarios) {
		
	
		this.ivaventa = ivaventa;
		this.total_venta = total_venta;
		this.valor_venta = valor_venta;
		this.cedula_clientes = cedula_clientes;
		this.cedula_usuarios = cedula_usuarios;
	}


	public int getCodigo_venta() {
		return codigo_venta;
	}


	public void setCodigo_venta(int codigo_venta) {
		this.codigo_venta = codigo_venta;
	}


	public double getIvaventa() {
		return ivaventa;
	}


	public void setIvaventa(double ivaventa) {
		this.ivaventa = ivaventa;
	}


	public double getTotal_venta() {
		return total_venta;
	}


	public void setTotal_venta(double total_venta) {
		this.total_venta = total_venta;
	}


	public double getValor_venta() {
		return valor_venta;
	}


	public void setValor_venta(double valor_venta) {
		this.valor_venta = valor_venta;
	}


	public int getCedula_clientes() {
		return cedula_clientes;
	}


	public void setCedula_clientes(int cedula_clientes) {
		this.cedula_clientes = cedula_clientes;
	}


	public int getCedula_usuarios() {
		return cedula_usuarios;
	}


	public void setCedula_usuarios(int cedula_usuarios) {
		this.cedula_usuarios = cedula_usuarios;
	}


	public String getNombre_cliente() {
		return nombre_cliente;
	}


	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	
	
}
