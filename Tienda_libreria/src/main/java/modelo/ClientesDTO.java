package modelo;

public class ClientesDTO {
	
	private double cedula;
	private String email;
	private String nombre;
	private String telefono;
	private String direccion;
	
	public ClientesDTO(double cedula, String email, String nombre, String telefono, String direccion) {
	
		this.cedula = cedula;
		this.email = email;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public double getCedula() {
		return cedula;
	}

	public void setCedula(double cedula) {
		this.cedula = cedula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
 
	
}
