package datos;




public class Departamento {
	private int idDepartamento;
	private String area;
		
	public Departamento() {
		super();
	}

	public Departamento(String area) {
		super();
		this.area = area;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	protected void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Departamento [idDepartamento=" + idDepartamento + ", area=" + area + "]";
	}

}
