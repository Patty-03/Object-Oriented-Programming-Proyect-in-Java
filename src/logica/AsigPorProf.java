package logica;

public class AsigPorProf {
	private int horasClase;
	private String asignatura;
	private String tipoEnsenanza;
	private String nombreProf;
	private int grupo;
	
	public int getHorasClase() {
		return horasClase;
	}
	public void setHorasClase(int horasClase) {
		this.horasClase = horasClase;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public String getTipoEnsenanza() {
		return tipoEnsenanza;
	}
	public void setTipoEnsenanza(String tipoEnsenanza) {
		this.tipoEnsenanza = tipoEnsenanza;
	}
	public String getNombreProf() {
		return nombreProf;
	}
	public void setNombreProf(String nombreProf) {
		this.nombreProf = nombreProf;
	}
	public int getGrupo() {
		return grupo;
	}
	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}
	
	public AsigPorProf(int horasClase, String asignatura, String tipoEnsenanza,
			String nombreProf, int grupo) {
		super();
		this.horasClase = horasClase;
		this.asignatura = asignatura;
		this.tipoEnsenanza = tipoEnsenanza;
		this.nombreProf = nombreProf;
		this.grupo = grupo;
	}
	
	
}
