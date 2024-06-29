package logica;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Planificacion {
	private GregorianCalendar fecha;
	private int curso;
	private int semestre;
	private ArrayList<AsigPorProf> asignaturasPorProfe; 
	
	public GregorianCalendar getFecha() {
		return fecha;
	}
	
	public void setFecha(GregorianCalendar fecha) {
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

	public ArrayList<AsigPorProf> getAsignaturasPorProfe() {
		return asignaturasPorProfe;
	}

	public void setAsignaturasPorProfe(ArrayList<AsigPorProf> asignaturasPorProfe) {
		this.asignaturasPorProfe = asignaturasPorProfe;
	}

	public Planificacion(GregorianCalendar fecha, int curso, int semestre,
			ArrayList<AsigPorProf> asignaturasPorProfe) {
		this.fecha = fecha;
		this.curso = curso;
		this.semestre = semestre;
		this.asignaturasPorProfe = asignaturasPorProfe;
	}	
}
