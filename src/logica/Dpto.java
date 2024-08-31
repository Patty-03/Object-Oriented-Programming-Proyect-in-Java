package logica;

import java.util.ArrayList;

public class Dpto {
	private String nombre;
	private String facultad;
	private String nombreJefeDpto;
	private ArrayList<TipoEnsenanza> ensenanzas;
	private ArrayList<Asignatura> asignaturas;
	private ArrayList<Planificacion> registro;
	private ArrayList<Docente> docentes;
	private ArrayList<AsigPorProf> asignacionesAsignaturas;

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
	public String getNombreJefeDpto() {
		return nombreJefeDpto;
	}
	public void setNombreJefeDpto(String nombreJefeDpto) {
		this.nombreJefeDpto = nombreJefeDpto;
	}
	public ArrayList<TipoEnsenanza> getEnsenanzas() {
		return ensenanzas;
	}
	public void setEnsenanzas(ArrayList<TipoEnsenanza> ensenanzas) {
		this.ensenanzas = ensenanzas;
	}
	public ArrayList<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	public ArrayList<Planificacion> getRegistro() {
		return registro;
	}
	public void setRegistro(ArrayList<Planificacion> registro) {
		this.registro = registro;
	}
	public ArrayList<Docente> getDocentes() {
		return docentes;
	}
	public void setDocentes(ArrayList<Docente> docentes) {
		this.docentes = docentes;
	}
	public ArrayList<AsigPorProf> getAsignacionesAsignaturas() {
		return asignacionesAsignaturas;
	}
	public void setAsignacionesAsignaturas(
			ArrayList<AsigPorProf> asignacionesAsignaturas) {
		this.asignacionesAsignaturas = asignacionesAsignaturas;
	}

	public Dpto(String nombre, String jefeDpto, String facultad) {
		setNombre(nombre);
		setNombreJefeDpto(jefeDpto);
		setFacultad(facultad);
		ensenanzas = new ArrayList<TipoEnsenanza>();
		asignaturas = new ArrayList<Asignatura>();
		registro = new ArrayList<Planificacion>();
		docentes = new ArrayList<Docente>();
		asignacionesAsignaturas = new ArrayList<AsigPorProf>();
	}
	
	public boolean agregarDocente(Docente c){
		boolean agregado = true;
		if(c == null)
			agregado = false;
		else{			
			agregado = docentes.add(c);
		}
		return agregado;
	}
	
	public boolean agregarAsignatura(Asignatura c){
		boolean agregado = true;
		if(c == null)
			agregado = false;
		else{			
			agregado = asignaturas.add(c);
		}
		return agregado;
	}
	
	public boolean agregarPlanif(Planificacion c){
		boolean agregado = true;
		if(c == null)
			agregado = false;
		else{			
			agregado = registro.add(c);
		}
		return agregado;
	}
	
	public boolean agregarEnsenanza(TipoEnsenanza c){
		boolean agregado = true;
		if(c == null)
			agregado = false;
		else{			
			agregado = ensenanzas.add(c);
		}
		return agregado;
	}
	
	public boolean agregarAsignacion(AsigPorProf c){
		boolean agregado = true;
		if(c == null)
			agregado = false;
		else{			
			agregado = asignacionesAsignaturas.add(c);
		}
		return agregado;
	}
	
	@SuppressWarnings("unused")
	private int buscarProf(String iD){
		int pos = -1;
		int i = 0;
		boolean found = false;
		while (i < docentes.size() && !found){
			if (docentes.get(i).getiD().equalsIgnoreCase(iD)) {
				pos = i;
				found = true;
			} else
				i++;
		}
		return pos;		
	}
	
	public int buscarAsign(String nombre){
		int pos = -1;
		int i = 0;
		boolean found = false;
		while (i < asignaturas.size() && !found){
			if (asignaturas.get(i).getNombre().equalsIgnoreCase(nombre)) {
				pos = i;
				found = true;
			} else
				i++;
		}
		return pos;		
	}
	
	public ArrayList<Asignatura> buscarAsigPorDisc(String disc){
		
		ArrayList<Asignatura> valores = new ArrayList<Asignatura>();
		for(Asignatura a: asignaturas){
			if(a.getDisciplina().equalsIgnoreCase(disc)){
				valores.add(a);
			}
		}
		
		return valores;
	}
	
	public ArrayList<Docente> buscarProfPorDisp(String disp){
		ArrayList<Docente> valores = new ArrayList<Docente>();
		
		for(Docente d: docentes){
			if(d.getDisponibilidad().equals(disp)){
				valores.add(d);
			}
		}
		
		return valores;
	}
	
	public ArrayList<Docente> buscarProfPorCatDoc(String disp){
		ArrayList<Docente> valores = new ArrayList<Docente>();
		
		for(Docente d: docentes){
			if(d.getCatDoc().equals(disp)){
				valores.add(d);
			}
		}
		
		return valores;
	}
	
	public ArrayList<Docente> buscarProfPorCatCientif(String disp){
		ArrayList<Docente> valores = new ArrayList<Docente>();
		
		for(Docente d: docentes){
			if(d.getCatCientif().equals(disp)){
				valores.add(d);
			}
		}
		
		return valores;
	}
}

