package dao;
import datos.Respuesta;

import java.util.List;

import datos.Empleado;
import datos.Ticket;
public class RespuestaDao extends Dao<Respuesta> {
	
	public Respuesta traerPorEmpleado(long idRespuesta){
		Respuesta objeto = null;
		try {
			iniciaOperacion();
			String hql = "from Respuesta r inner join fetch r.empleado e where e.idRespuesta=:idRespuesta";
			objeto = (Respuesta) session.createQuery(hql).setParameter("idRespuesta", idRespuesta).uniqueResult();
		}finally {
			session.close();
		}
		return objeto;
	}
	
	public List<Respuesta> traer(Empleado e) {
		List<Respuesta> lista = null;
		try {
		iniciaOperacion();
		String hql = "from Respuesta r inner join fetch r.empleado e where c.idEmpleado=:idEmpleado";
		lista = session.createQuery(hql, Respuesta.class).setParameter("idEmpleado",e.getIdUsuario()).getResultList();
		} finally {
		session.close();
		}
		return lista;
		}
	public List<Respuesta> traerPorTicket(Ticket t) {
		List<Respuesta> lista = null;
		try {
		iniciaOperacion();
		String hql = "from Respuesta r inner join fetch r.ticket t where t.idTicket=:idTicket";
		lista = session.createQuery(hql, Respuesta.class).setParameter("idTicket",t.getIdTicket()).getResultList();
		} finally {
		session.close();
		}
		return lista;
		}

}
