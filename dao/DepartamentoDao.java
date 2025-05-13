package dao;
import datos.Departamento;
public class DepartamentoDao extends Dao<Departamento> {
	
	
	
	
	public Departamento traerPorArea(String area){
		Departamento objeto = new Departamento();
		try {
			iniciaOperacion();
			objeto = (Departamento) session.createQuery("from Departamento d where d.area =:area").setParameter("area", area).uniqueResult();
		}finally {
			session.close();
		}
		return objeto;
	}

}
