package modelo;

public class UsuariosDTO {
 
	private double cedula;
	private String email;
	private String nombre;
	private String contraseña;
	private String usuario;
	
	public UsuariosDTO(double cedula, String email, String nombre, String contraseña, String usuario) {
	
		this.cedula = cedula;
		this.email = email;
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.usuario = usuario;
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

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	
	
	
}
