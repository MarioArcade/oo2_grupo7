package datos;

import java.time.LocalDate;

public class Ticket {
	private int idTicket;
	private LocalDate fecha;
	private Cliente cliente;
	private Empleado empleado;
	private String prioridad;
	private String asunto;
	private String descripcion;
	private Departamento departamento;
	private String impacto;
	private String estatus;
	
	
	public Ticket() {
		
	}


	public Ticket(LocalDate fecha, Cliente cliente, Empleado empleado, String prioridad, String asunto,	String descripcion, Departamento departamento, String impacto, String estatus) {
		super();
		this.fecha = fecha;
		this.cliente = cliente;
		this.empleado = empleado;
		this.prioridad = prioridad;
		this.asunto = asunto;
		this.descripcion = descripcion;
		this.departamento = departamento;
		this.impacto = impacto;
		this.estatus = estatus;
	}


	public int getIdTicket() {
		return idTicket;
	}


	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Empleado getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}


	public String getPrioridad() {
		return prioridad;
	}


	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}


	public String getAsunto() {
		return asunto;
	}


	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public String getImpacto() {
		return impacto;
	}


	public void setImpacto(String impacto) {
		this.impacto = impacto;
	}


	public String getEstatus() {
		return estatus;
	}


	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}


	@Override
	public String toString() {
		return "Ticket [idTicket=" + idTicket + ", fecha=" + fecha + ", cliente=" + cliente + ", empleado=" + empleado
				+ ", prioridad=" + prioridad + ", asunto=" + asunto + ", descripcion=" + descripcion + ", departamento="
				+ departamento + ", impacto=" + impacto + ", estatus=" + estatus + "]";
	}



}
