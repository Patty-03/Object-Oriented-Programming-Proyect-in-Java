package logica;

import java.util.Date;

public class Planificacion {
	private Date fecha;
	private int curso;
	private int semestre;
	private AsigPorProf asignacion;
	
	public String getFecha() {
		fecha = new Date();
		@SuppressWarnings("deprecation")
		String date = fecha.getDay() + "/" + fecha.getMonth() + "/" + fecha.getYear();
		return date;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public AsigPorProf getAsignacion() {
		return asignacion;
	}
	public void setAsignacion(AsigPorProf asignacion) {
		this.asignacion = asignacion;
	}
	
	public Planificacion(Date fecha, int curso, int semestre,
			AsigPorProf asignacion) {
		super();
		this.fecha = fecha;
		this.curso = curso;
		this.semestre = semestre;
		this.asignacion = asignacion;
	}
	
	
}
