package logica;

import java.util.ArrayList;

public class Departamento {
	private String nombre;
	private String facultad;
	private String jefeDpto;
	private ArrayList<Asignatura> asignaturas;
	private ArrayList<Profesor> profesores;
	private ArrayList<Planificacion> registroPlanif;
	private ArrayList<TipoEnsenanza> ensenanzas;
	private ArrayList<AsigPorProf> asignaturasPorProfe;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public String getJefeDpto() {
		return jefeDpto;
	}
	public void setJefeDpto(String jefeDpto) {
		this.jefeDpto = jefeDpto;
	}
	
	public Departamento(String nombre, String facultad, String jefeDpto,
			ArrayList<Asignatura> asignaturas, ArrayList<Profesor> profesores,
			ArrayList<Planificacion> registroPlanif,
			ArrayList<TipoEnsenanza> ensenanzas,
			ArrayList<AsigPorProf> asignaturasPorProfe) {
		this.nombre = nombre;
		this.facultad = facultad;
		this.jefeDpto = jefeDpto;
		this.asignaturas = asignaturas;
		this.profesores = profesores;
		this.registroPlanif = registroPlanif;
		this.ensenanzas = ensenanzas;
		this.asignaturasPorProfe = asignaturasPorProfe;
	}

	

}
