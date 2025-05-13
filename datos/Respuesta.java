package datos;

import java.time.LocalDate;

public class Respuesta {
	private int idRespuesta;
	private String respuesta;
	private LocalDate fechaRespuesta;
	private Empleado empleado;
	private Ticket ticket;
	
	
	public Respuesta() {
		super();
	}


	public Respuesta(String respuesta, LocalDate fechaRespuesta, Empleado empleado, Ticket ticket) {
		super();
		this.respuesta = respuesta;
		this.fechaRespuesta = fechaRespuesta;
		this.empleado = empleado;
		this.ticket = ticket;
	}


	public int getIdRespuesta() {
		return idRespuesta;
	}


	public void setIdRespuesta(int idRespuesta) {
		this.idRespuesta = idRespuesta;
	}


	public String getRespuesta() {
		return respuesta;
	}


	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}


	public LocalDate getFechaRespuesta() {
		return fechaRespuesta;
	}


	public void setFechaRespuesta(LocalDate fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
	}


	public Empleado getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}


	public Ticket getTicket() {
		return ticket;
	}


	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}


	@Override
	public String toString() {
		return "Respuesta [idRespuesta=" + idRespuesta + ", respuesta=" + respuesta + ", fechaRespuesta="
				+ fechaRespuesta + ", empleado=" + empleado + ", ticket=" + ticket + "]";
	}
	
}
