package negocio;
import dao.OrganizacionDao;
import datos.Organizacion;
public class OrganizacionABM {
	
	OrganizacionDao dao = new OrganizacionDao();
	
	public Organizacion traerPorNombre(String nombre){
		return dao.traerPorNombre(nombre);
	}
	
	public Organizacion traerPorRazon(String razonSocial){
		return dao.traerPorRazon(razonSocial);
	}
	
	public Organizacion traerPorDireccion(String direccion) {
		return dao.traerPorDireccion(direccion);
	}
	
	public int agregar(String nombre, String razonSocial, String cuit, String direccion, String ubicacion)throws Exception{
		if(traerPorNombre(nombre)!=null){
			throw new Exception("Nombre ya registrado");
		}
		if(traerPorRazon(cuit)!=null){
			throw new Exception("Cuit ya registrado");
		}
		if(traerPorDireccion(direccion)!=null){
			throw new Exception("Direccion ya registrada");
		}
		Organizacion o = new Organizacion(nombre, razonSocial, cuit, direccion, ubicacion);
		return dao.agregar(o);
	}
}
