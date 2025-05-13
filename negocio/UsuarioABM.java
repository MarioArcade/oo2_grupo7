package negocio;
import java.time.LocalDate;
import java.util.List;
import dao.UsuarioDao;
import datos.Empleado;
import datos.Departamento;
import datos.Cliente;
import datos.Usuario;
import datos.Login;
import datos.Organizacion;
import dao.LoginDao;
public class UsuarioABM {
	UsuarioDao dao = new UsuarioDao();
	LoginDao daoL = new LoginDao();
	
	public Usuario traer(int idUsuario) {
		return dao.traer(idUsuario);
	}
	public Empleado traerE(int idUsuario) {
		return (Empleado) dao.traer(idUsuario);
	}
	public Cliente traerC(int idUsuario) {
		return (Cliente) dao.traer(idUsuario);
	}
	public Usuario traerPorDni(int dni) {
		return dao.traerPorDni(dni);
	}
	
	//Valida el nombre . No puede empezar con un guion bajo, un numero o tener menos de 3 caracteres.
		public static void validarNombreUsuario(String nombre) throws Exception {
		    if (nombre == null || !nombre.matches("^[a-zA-Z][a-zA-Z0-9_]{3,}$")) {
		        throw new Exception("Nombre de usuario inválido.");
		    }
		}
		
		public static void validarEmail(String email) throws Exception {
		    if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
		        throw new Exception("Email inválido.");
		    }
		}
		
		public void modificar(Usuario c) throws Exception {
			dao.actualizar(c);
		}
		public List<Usuario> traerUsuarios() {
			return dao.traer();
		}
		public Usuario traerUsuarioYLogin(int idUsuario){
			return dao.traerUsuarioYLogin(idUsuario);
		}
		
		public int agregarEmpleado(Empleado empleado,String nombreDeUsuario, String clave,String nombre, String apellido, int dni, String email,boolean superUsuario,Departamento departamento)throws Exception{
			if(empleado.isSuperUsuario()!=true){
				throw new Exception("No pose permisos de administrador");
			}
			if(traerPorDni(dni)!=null) {
				throw new Exception("Error: Un usuario con este DNI ya existe.");
			}
			validarNombreUsuario(nombre);
			validarEmail(email);
			Login login = new Login(nombreDeUsuario,clave,null);
			Usuario e = new Empleado(nombre, apellido, dni,  email, LocalDate.now(), null,true, login,superUsuario, departamento);
			login.setUsuario(e);
			return  daoL.agregar(login);
		}
		
		public int agregarCliente(Empleado empleado,String nombreDeUsuario, String clave,String nombre, String apellido, int dni, String email, Organizacion organizacion)throws Exception{
			if(empleado.isSuperUsuario()!=true){
				throw new Exception("No pose permisos de administrador");
			}
			if(traerPorDni(dni)!=null) {
				throw new Exception("Error: Un usuario con este DNI ya existe.");
			}
			validarNombreUsuario(nombre);
			validarEmail(email);
			Login login = new Login(nombreDeUsuario,clave,null);
			Usuario c = new Cliente(nombre, apellido, dni, email, LocalDate.now(), null, true, login, organizacion);
			login.setUsuario(c);
			return daoL.agregar(login);
		}
		
		public List<Empleado> traerPorDepartamento(Departamento d) {
			return dao.traerPorDepartamento(d);
		}
		
		public List<Cliente> traerPorOrganizacion(Organizacion o){
			return dao.traerPorOrganizacion(o);
		}
}
