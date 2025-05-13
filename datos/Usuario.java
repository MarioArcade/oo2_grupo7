package datos;

import java.time.LocalDate;

public class Usuario {
	private int idUsuario;
	private String nombre;
	private String apellido;
	private int dni;
	private String email;
	private LocalDate fechaDeAlta;
	private LocalDate fechaDeBaja;
	private boolean estado;
	private Login login;
	
	public Usuario() {
		
	}

	

	public Usuario(String nombre, String apellido, int dni, String email, LocalDate fechaDeAlta, LocalDate fechaDeBaja,
			boolean estado, Login login) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.email = email;
		this.fechaDeAlta = fechaDeAlta;
		this.fechaDeBaja = fechaDeBaja;
		this.estado = estado;
		this.login = login;
	}



	public int getIdUsuario() {
		return idUsuario;
	}

	protected void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFechaDeAlta() {
		return fechaDeAlta;
	}

	public void setFechaDeAlta(LocalDate fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}

	public LocalDate getFechaDeBaja() {
		return fechaDeBaja;
	}

	public void setFechaDeBaja(LocalDate fechaDeBaja) {
		this.fechaDeBaja = fechaDeBaja;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", email=" + email + ", fechaDeAlta=" + fechaDeAlta + ", fechaDeBaja=" + fechaDeBaja + ", estado="
				+ estado + "]";
	}



	public Login getLogin() {
		return login;
	}



	public void setLogin(Login login) {
		this.login = login;
	}
	

}
