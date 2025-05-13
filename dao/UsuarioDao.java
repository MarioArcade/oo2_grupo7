package dao;

import datos.Usuario;
import datos.Empleado;
import datos.Cliente;
import datos.Organizacion;
import datos.Departamento;

import java.util.List;

import org.hibernate.HibernateException;
public class UsuarioDao extends Dao<Usuario>{
	
	
	public Usuario traerPorDni(int dni) {
		Usuario objeto = null;
		try {
			iniciaOperacion();
			objeto = (Usuario) session.createQuery("from Usuario u where u.dni=:dni").setParameter("dni", dni).uniqueResult();
		}finally {
			session.close();
		}
		return objeto;
	}
	public Usuario traerUsuarioYLogin(int idUsuario) throws HibernateException {
		Usuario objeto = null;
		try {
			iniciaOperacion();
			String hql = "from Usuario u inner join fetch u.login where u.idUsuario =:idUsuario";
			objeto = (Usuario) session.createQuery(hql).setParameter("idUsuario", idUsuario).uniqueResult();
		}finally {
			session.close();
		}
		return objeto;
	}
	
	public List<Empleado> traerPorDepartamento(Departamento d) {
		List<Empleado> lista = null;
		try {
		iniciaOperacion();
		String hQL = "from Empleado e inner join fetch e.departamento d where d.idDepartamento=:idDepartamento";
		lista = session.createQuery(hQL, Empleado.class).setParameter("idDepartamento",d.getIdDepartamento()).getResultList();
		} finally {
		session.close();
		}
		return lista;
		}
	
	public List<Cliente> traerPorOrganizacion(Organizacion o) {
		List<Cliente> lista = null;
		try {
		iniciaOperacion();
		String hQL = "from Cliente c inner join fetch c.organizacion o where o.idOrganizacion=:idOrganizacion";
		lista = session.createQuery(hQL, Cliente.class).setParameter("idOrganizacion",o.getIdOrganizacion()).getResultList();
		} finally {
		session.close();
		}
		return lista;
		}
}