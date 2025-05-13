package negocio;
import java.time.LocalDate;
import java.util.List;
import dao.UsuarioDao;
import dao.TicketDao;
import datos.Ticket;
import datos.Cliente;
import datos.Departamento;
import datos.Empleado;
public class TicketABM {
	TicketDao dao = new TicketDao();
	UsuarioDao dao2 = new UsuarioDao();
	public Ticket traer(int idTicket){
		return dao.traer(idTicket);
	}
	public List<Ticket> traerPorFecha(LocalDate fecha){
		return dao.traerPorFecha(fecha);
	}
	public List<Ticket> traerPorPrioridad(String prioridad){
		return dao.traerPorPrioridad(prioridad);
	}
	public List<Ticket> traerPorImpacto(String impacto){
		return dao.traerPorImpacto(impacto);
	}
	public List<Ticket> traerPorEstatus(String estatus){
		return dao.traerPorEstatus(estatus);
	}
	public List<Ticket> traer(){
		return dao.traer();
	}
	
	public int agregar(Cliente cliente, String asunto, String descripcion, Departamento departamento, String impacto)throws Exception{	
		
		Ticket objeto = new Ticket(LocalDate.now(),cliente,null,"media" , asunto, descripcion, departamento,impacto, "Activo");
		return dao.agregar(objeto);
	}
	public void actualizar (Ticket t)throws Exception{
		if(traer(t.getIdTicket())==null) {
			throw new Exception("Error el ticket asignado no existe.");
		}
				
		dao.actualizar(t);
	}
	
	public void asignarEmpleado(Ticket t, Empleado e)throws Exception{
		t.setEmpleado(e);
		actualizar(t);
	}
	public void actualizarDepartamento(Ticket t, Departamento departamento)throws Exception{
		t.setDepartamento(departamento);
		actualizar(t);
	}
	public void actualizarImpacto(Ticket t, String impacto)throws Exception{
		t.setImpacto(impacto);
		actualizar(t);
	}
	
	public void actualizarEstado(Ticket t, String estado)throws Exception{
		t.setEstatus(estado);
		actualizar(t);
	}
	
	public void actualizarPrioridad(Ticket t, String prioridad)throws Exception{
		t.setPrioridad(prioridad);
		actualizar(t);
	}
	public List<Ticket> traerPorEmpleado(Empleado e){
		return dao.traerPorEmpleado(e);
	}
	
}
 