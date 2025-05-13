package datos;

import java.time.LocalDate;

public class Empleado extends Usuario{
	private boolean superUsuario;
	private Departamento departamento;
	public Empleado() {
	
	}



	public Empleado(String nombre, String apellido, int dni, String email, LocalDate fechaDeAlta, LocalDate fechaDeBaja,
			boolean estado, Login login, boolean superUsuario, Departamento departamento) {
		super(nombre, apellido, dni, email, fechaDeAlta, fechaDeBaja, estado, login);
		this.superUsuario = superUsuario;
		this.departamento = departamento;
	}


	public boolean isSuperUsuario() {
		return superUsuario;
	}



	public void setSuperUsuario(boolean superUsuario) {
		this.superUsuario = superUsuario;
	}



	public Departamento getDepartamento() {
		return departamento;
	}



	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}



	@Override
	public String toString() {
		return "Empleado ["+super.toString()+ ", superUsuario=" + superUsuario + ", departamento="+ departamento + "]";
	}
	
	

}
