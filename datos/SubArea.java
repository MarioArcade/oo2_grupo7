package datos;

public class SubArea {
	private int idSubArea;
	private String subArea;
	private Departamento departamento;
		
	public SubArea() {

	}

	public SubArea(String subArea, Departamento departamento) {
		super();
		this.subArea = subArea;
		this.departamento = departamento;
	}

	public int getIdSubArea() {
		return idSubArea;
	}

	public void setIdSubArea(int idSubArea) {
		this.idSubArea = idSubArea;
	}

	public String getSubArea() {
		return subArea;
	}

	public void setSubArea(String subArea) {
		this.subArea = subArea;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "SubArea [idSubArea=" + idSubArea + ", subArea=" + subArea + ", departamento=" + departamento + "]";
	}

}
