package negocio;
import java.time.LocalDate;
import java.util.List;
import dao.RespuestaDao;
import dao.UsuarioDao;
import datos.Respuesta;
import datos.Ticket;
import datos.Empleado;
public class RespuestaABM {
	
	RespuestaDao dao = new RespuestaDao();
	UsuarioDao dao2 = new UsuarioDao();
	
	public Respuesta traerRespuesta(long idRespuesta){
		return dao.traerPorEmpleado(idRespuesta);
	}
	public List<Respuesta>traerRespuestaEmpleado(Empleado e){
		return dao.traer(e);
	}
	public int agregar(String respuesta, Empleado empleado,Ticket ticket) throws Exception {
		if(dao2.traerPorDni(empleado.getDni())== null){
			throw new Exception("Error: El usuario no existe.");
		}
		Respuesta r = new Respuesta(respuesta,LocalDate.now(),empleado, ticket);
		return dao.agregar(r);
	}
	public void modificar(Respuesta e) throws Exception {
		dao.actualizar(e);
	}
	public Respuesta traer(int idRespuesta) {
		return dao.traer(idRespuesta);
	}
	public List<Respuesta> traerPorTicket(Ticket t){
		return dao.traerPorTicket(t);
	}
	
}
