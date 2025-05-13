package datos;

import java.time.LocalDate;

public class Cliente extends Usuario{
	private Organizacion organizacion;
	public Cliente() {
		super();
	}
	
	public Cliente(String nombre, String apellido, int dni, String email, LocalDate fechaDeAlta, LocalDate fechaDeBaja,	boolean estado, Login login, Organizacion organizacion) {
		super(nombre, apellido, dni, email, fechaDeAlta, fechaDeBaja, estado, login);
		this.organizacion = organizacion;
	}

	
	public Organizacion getOrganizacion() {
		return organizacion;
	}
	public void setOrganizacion(Organizacion organizacion) {
		this.organizacion = organizacion;
	}
	@Override
	public String toString() {
		return "Cliente ["+ super.toString() + ", organizacion=" + organizacion + "]";
	}

}	
