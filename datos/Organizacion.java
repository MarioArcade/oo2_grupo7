package datos;



public class Organizacion {
	private int idOrganizacion;
	private String nombre;
	private String razonSocial;
	private String cuit;
	private String Direccion;
	private String ubicacion;
		
	public Organizacion() {
	}

	public Organizacion(String nombre, String razonSocial, String cuit, String direccion, String ubicacion) {
		super();
		this.nombre = nombre;
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		Direccion = direccion;
		this.ubicacion = ubicacion;
		
	}

	public int getIdOrganizacion() {
		return idOrganizacion;
	}

	protected void setIdOrganizacion(int idOrganizacion) {
		this.idOrganizacion = idOrganizacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	
	@Override
	public String toString() {
		return "Organizacion [idOrganizacion=" + idOrganizacion + ", nombre=" + nombre + ", razonSocial=" + razonSocial	+ ", cuit=" + cuit + ", Direccion=" + Direccion + ", ubicacion=" + ubicacion + "]";
	}
	
}
