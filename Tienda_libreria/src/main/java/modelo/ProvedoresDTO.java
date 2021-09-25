package modelo;

public class ProvedoresDTO {

	private int nit_provedores;
	private String ciudad_provedor;
	private String direccion_provedor;
	private String nombre_provedor;
	private String telefono_provedor;
	public ProvedoresDTO(int nit_provedores, String ciudad_provedor, String direccion_provedor, String nombre_provedor,
			String telefono_provedor) {
	
		this.nit_provedores = nit_provedores;
		this.ciudad_provedor = ciudad_provedor;
		this.direccion_provedor = direccion_provedor;
		this.nombre_provedor = nombre_provedor;
		this.telefono_provedor = telefono_provedor;
	}
	public int getNit_provedores() {
		return nit_provedores;
	}
	public void setNit_provedores(int nit_provedores) {
		this.nit_provedores = nit_provedores;
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
