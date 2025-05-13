package negocio;
import dao.DepartamentoDao;
import dao.SubAreaDao;
import datos.Departamento;
import datos.SubArea;
public class DepartamentoABM {
	DepartamentoDao dao = new DepartamentoDao();
	SubAreaDao daoS = new SubAreaDao();
	
	public Departamento traerPorArea(String area) {
		return dao.traerPorArea(area);
	}
	public SubArea traerPorSubArea(String area) {
		return daoS.traerPorArea(area);
	} 
	public int agregarDepartamento(String area)throws Exception {
		if( traerPorArea(area)!=null) {
			throw new Exception("El area ya esta cargada");
		}
		Departamento objeto = new Departamento(area);
		return dao.agregar(objeto);
	}
	
	public int agregarSubArea( String subArea, Departamento departamento)throws Exception{
		
		if(traerPorSubArea(subArea)!=null) {
			throw new Exception("La SubArea ya esta cargada");
		}
		SubArea objeto = new SubArea(subArea, departamento);
		return daoS.agregar(objeto);
	}

}
