package dao;
import datos.Login;
public class LoginDao extends Dao<Login>{


	public Login traerPorNombre(String nombreDeUsuario){
		Login objeto = null;
		try {
			iniciaOperacion();
			objeto = (Login) session.createQuery("from Login l where l.nombreDeUsuario =:nombreDeUsuario").setParameter("nombreDeUsuario", nombreDeUsuario).uniqueResult();
		}finally {
			session.close();
		}
		return objeto;
	}

}
