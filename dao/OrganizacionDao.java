package dao;

import datos.Organizacion;
public class OrganizacionDao extends Dao<Organizacion>{
	
public Organizacion traerPorNombre(String nombre){ 
	Organizacion objeto = new Organizacion();
	try {
		iniciaOperacion();
		objeto = (Organizacion) session.createQuery("from Organizacion o where o.nombre =:nombre").setParameter("nombre", nombre).uniqueResult();
	}finally {
		session.close();
	}
	return objeto;

}
public Organizacion traerPorRazon(String razonSocial){
	Organizacion objeto = new Organizacion();
	try {
		iniciaOperacion();
		objeto = (Organizacion) session.createQuery("from Organizacion o where o.razonSocial =:razonSocial").setParameter("razonSocial", razonSocial).uniqueResult();
	}finally {
		session.close();
	}
	return objeto;
}
public Organizacion traerPorCuit(String cuit){
	Organizacion objeto = new Organizacion();
	try {
		iniciaOperacion();
		objeto = (Organizacion) session.createQuery("from Organizacion o where o.cuit =:cuit").setParameter("cuit", cuit).uniqueResult();
	}finally {
		session.close();
	}
	return objeto;
}
public Organizacion traerPorDireccion(String direccion){
	Organizacion objeto = new Organizacion();
	try {
		iniciaOperacion();
		objeto = (Organizacion) session.createQuery("from Organizacion o where o.direccion =:direccion").setParameter("direccion", direccion).uniqueResult();
	}finally {
		session.close();
	}
	return objeto;
}

}
