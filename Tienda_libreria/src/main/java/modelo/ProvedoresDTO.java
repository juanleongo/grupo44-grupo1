package modelo;

public class ProvedoresDTO {
	
	private int nitprovedor;
	private String ciudad_provedor;
	private String direccion_provedor;
	private String nombre_provedor;
	private String telefono_provedor;
	public ProvedoresDTO(int nitprovedor, String ciudad_provedor, String direccion_provedor, String nombre_provedor,
			String telefono_provedor) {
	
		this.nitprovedor = nitprovedor;
		this.ciudad_provedor = ciudad_provedor;
		this.direccion_provedor = direccion_provedor;
		this.nombre_provedor = nombre_provedor;
		this.telefono_provedor = telefono_provedor;
	}
	public int getNitprovedor() {
		return nitprovedor;
	}
	public void setNitprovedor(int nitprovedor) {
		this.nitprovedor = nitprovedor;
	}
	public String getCiudad_provedor() {
		return ciudad_provedor;
	}
	public void setCiudad_provedor(String ciudad_provedor) {
		this.ciudad_provedor = ciudad_provedor;
	}
	public String getDireccion_provedor() {
		return direccion_provedor;
	}
	public void setDireccion_provedor(String direccion_provedor) {
		this.direccion_provedor = direccion_provedor;
	}
	public String getNombre_provedor() {
		return nombre_provedor;
	}
	public void setNombre_provedor(String nombre_provedor) {
		this.nombre_provedor = nombre_provedor;
	}
	public String getTelefono_provedor() {
		return telefono_provedor;
	}
	public void setTelefono_provedor(String telefono_provedor) {
		this.telefono_provedor = telefono_provedor;
	}
	
	

}
