package dao;

import datos.SubArea;
public class SubAreaDao extends Dao<SubArea> {
	
	public SubArea traerPorArea(String subArea){
		SubArea objeto = new SubArea();
		try {
			iniciaOperacion();
			objeto = (SubArea) session.createQuery("from SubArea a where a.subArea =:subArea").setParameter("subArea",subArea).uniqueResult();
		}finally {
			session.close();
		}
		return objeto;
	}

}
