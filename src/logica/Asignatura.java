package logica;

import java.util.ArrayList;

public class Asignatura {
	private String nombre;
	private String disciplina;
	private char planEstudio;
	private int semestre;
	private String carrera;
	private int anio;
	private String evaluacionFinal;
	private ArrayList<TipoEnsenanza> ensenanzas;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public char getPlanEstudio() {
		return planEstudio;
	}
	
	public void setPlanEstudio(char planEstudio) {
		this.planEstudio = planEstudio;
	}
	
	public int getSemestre() {
		return semestre;
	}
	
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public String getCarrera() {
		return carrera;
	}
	
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public String getEvaluacionFinal() {
		return evaluacionFinal;
	}
	
	public void setEvaluacionFinal(String evaluacionFinal) {
		this.evaluacionFinal = evaluacionFinal;
	}
	
	public ArrayList<TipoEnsenanza> getEnsenanzas() {
		return ensenanzas;
	}
	
	public void setEnsenanzas(ArrayList<TipoEnsenanza> ensenanzas) {
		this.ensenanzas = ensenanzas;
	}

	public Asignatura(String nombre, String disciplina, char planEstudio,
			int semestre, String carrera, int anio, String evaluacionFinal,
			ArrayList<TipoEnsenanza> ensenanzas) {
		this.nombre = nombre;
		this.disciplina = disciplina;
		this.planEstudio = planEstudio;
		this.semestre = semestre;
		this.carrera = carrera;
		this.anio = anio;
		this.evaluacionFinal = evaluacionFinal;
		this.ensenanzas = ensenanzas;
	}
	
	
	
}
