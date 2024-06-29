package logica;

/*Hace falta hacer:
 * Metodo para calcular el salario segun antiguedad y categorias(preguntar a alguien el rango que tiene cada categoria)
 * */

public class Profesor {
	private String iD;
	private String nombre;
	private String catDoc;
	private String catCientif;
	private String disponibilidad;
	private float salarioBase;
	private int antiguedad;
	
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

	public Profesor(String iD, String nombre, String catDoc, String catCientif,
			String disponibilidad, float salarioBase, int antiguedad) {
		this.iD = iD;
		this.nombre = nombre;
		this.catDoc = catDoc;
		this.catCientif = catCientif;
		this.disponibilidad = disponibilidad;
		this.salarioBase = salarioBase;
		this.antiguedad = antiguedad;
	}
	
	
}
