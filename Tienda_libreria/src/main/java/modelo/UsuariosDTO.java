package modelo;

public class UsuariosDTO {
 
	private double cedula;
	private String email;
	private String nombre;
	private String contrase�a;
	private String usuario;
	
	public UsuariosDTO(double cedula, String email, String nombre, String contrase�a, String usuario) {
	
		this.cedula = cedula;
		this.email = email;
		this.nombre = nombre;
		this.contrase�a = contrase�a;
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	
	
	
}
