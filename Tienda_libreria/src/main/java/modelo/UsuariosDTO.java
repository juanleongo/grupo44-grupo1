package modelo;

public class UsuariosDTO {
 
	private int cedula;
	private String nombre;
	private String contrasena;
	private String email;
	private String usuario;
	


	public UsuariosDTO(int cedula, String nombre, String contrasena, String email, String usuario) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.email = email;
		this.usuario = usuario;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
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

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	
	
	
}
