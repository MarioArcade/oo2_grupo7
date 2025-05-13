package datos;

public class Login {
	private int idLogin;
	private String nombreDeUsuario;
	private String clave;
	private Usuario usuario;
	
	public Login() {
	}

	public Login(String nombreDeUsuario, String clave, Usuario usuario) {
		super();
		this.nombreDeUsuario = nombreDeUsuario;
		this.clave = clave;
		this.usuario = usuario;
	}
	
	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}

	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}
	
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Login [nombreDeUsuario=" + nombreDeUsuario + ", clave=" + clave + ", usuario=" + usuario + "]";
	}

	public int getIdLogin() {
		return idLogin;
	}

	public void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
	}

}
