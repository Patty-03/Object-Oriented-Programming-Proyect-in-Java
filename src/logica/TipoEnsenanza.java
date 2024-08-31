package logica;

public class TipoEnsenanza {
	private String nombre;
	private int horas;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public TipoEnsenanza(String nombre, int horas) {
		super();
		this.nombre = nombre;
		this.horas = horas;
	}
}
