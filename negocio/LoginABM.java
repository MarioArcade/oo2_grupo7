package negocio;


import datos.Usuario;
import dao.LoginDao;
import datos.Login;

public class LoginABM {
	LoginDao dao = new LoginDao();
	
	public Login traer(int idLogin){
		return dao.traer(idLogin);
	}
	
	public Login traerPorNombre(String nombreDeUsuario){
		return dao.traerPorNombre(nombreDeUsuario);
	}
	
	public int agregar(String nombreDeUsuario, String clave,Usuario usuario) throws Exception {
		if(traerPorNombre(nombreDeUsuario)!= null) {
			throw new Exception("Error: Ese nombre ya esta en uso.");
		}
		Login l = new Login(nombreDeUsuario, clave, usuario);
		return dao.agregar(l);
	}
	
	public void modificar(Login l)throws Exception {
		if(traerPorNombre(l.getNombreDeUsuario())!= null) {
			throw new Exception("Error: Ese nombre ya esta en uso.");
		}
		dao.actualizar(l);
	}
	//Valida un nombre de usuario. No puede empezar con un guion bajo, un numero o tener menos de 3 caracteres.
		public static void validarNombreUsuario(String nombreUsuario) throws Exception {
		    if (nombreUsuario == null || !nombreUsuario.matches("^[a-zA-Z][a-zA-Z0-9_]{3,}$")) {
		        throw new Exception("Nombre de usuario inválido.");
		    }
		}
}
