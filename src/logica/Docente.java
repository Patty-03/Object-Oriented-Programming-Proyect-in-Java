package logica;

public class Docente {
	protected String iD;
	protected String nombre;
	protected String disponibilidad;
	protected float salarioBase;
	protected int antiguedad;
	private String catDoc;
	private String catCientif;
	
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public Docente(String iD, String nombre, String disponibilidad,
			float salarioBase, int antiguedad, String catDoc, String catCientif) {
		super();
		this.iD = iD;
		this.nombre = nombre;
		this.disponibilidad = disponibilidad;
		this.salarioBase = salarioBase;
		this.antiguedad = antiguedad;
		this.catDoc = catDoc;
		this.catCientif = catCientif;
	}
	
	public String getCatDoc() {
		return catDoc;
	}
	public void setCatDoc(String catDoc) {
		this.catDoc = catDoc;
	}
	public String getCatCientif() {
		return catCientif;
	}
	public void setCatCientif(String catCientif) {
		this.catCientif = catCientif;
	}
}
