package dao;
import java.time.LocalDate;
import java.util.List;
import datos.Empleado;
import datos.Ticket;
public class TicketDao extends Dao<Ticket>{
	
	public List<Ticket> traerPorFecha(LocalDate fecha) {
		List<Ticket> lista = null;
		try {
		iniciaOperacion();
		String hql = "from Ticket t where t.fecha=:fecha";
		lista = session.createQuery(hql, Ticket.class).setParameter("fecha",fecha).getResultList();
		} finally {
		session.close();
		}
		return lista;
	}
	
	public List<Ticket> traerPorPrioridad(String prioridad){
		List<Ticket> lista = null;
		try {
		iniciaOperacion();
		String hql = "from Ticket t where t.prioridad=:prioridad";
		lista = session.createQuery(hql, Ticket.class).setParameter("prioridad",prioridad).getResultList();
		} finally {
		session.close();
		}
		return lista;
	}
	public List<Ticket>  traerPorImpacto(String impacto){
		List<Ticket> lista = null;
		try {
		iniciaOperacion();
		String hql = "from Ticket t where t.impacto=:impacto";
		lista = session.createQuery(hql, Ticket.class).setParameter("impacto",impacto).getResultList();
		} finally {
		session.close();
		}
		return lista;
	}
	public List<Ticket> traerPorEstatus(String estatus){
		List<Ticket> lista = null;
		try {
		iniciaOperacion();
		String hql = "from Ticket t where t.estatus=:estatus";
		lista = session.createQuery(hql, Ticket.class).setParameter("estatus",estatus).getResultList();
		} finally {
		session.close();
		}
		return lista;
		
	}
	public List<Ticket> traerPorEmpleado(Empleado e){
		List<Ticket> lista = null;
		try {
		iniciaOperacion();
		String hql = "from Ticket t inner join fetch t.empleado e where e.idUsuario=:idUsuario";
		lista = session.createQuery(hql, Ticket.class).setParameter("idUsuario",e.getIdUsuario()).getResultList();
		} finally {
		session.close();
		}
		return lista;
		
	}
	
	

}
