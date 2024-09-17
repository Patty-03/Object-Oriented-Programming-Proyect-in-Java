package logica;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Dpto {
	private String nombre;
	private String facultad;
	private String nombreJefeDpto;
	private ArrayList<TipoEnsenanza> ensenanzas;
	private ArrayList<Asignatura> asignaturas;
	private ArrayList<Planificacion> registro;
	private ArrayList<Docente> docentes;
	private ArrayList<AsigPorProf> asignacionesAsignaturas;


	public Dpto(String nombre, String jefeDpto, String facultad) {
		setNombre(nombre);
		setNombreJefeDpto(jefeDpto);
		setFacultad(facultad);
		ensenanzas = new ArrayList<>();
		asignaturas = new ArrayList<>();
		registro = new ArrayList<>();
		docentes = new ArrayList<>();
		asignacionesAsignaturas = new ArrayList<>();
	}


	public void setNombre(String nombre) {
		if (nombre != null && !nombre.trim().isEmpty()) {
			this.nombre = nombre;
		} else {
			throw new IllegalArgumentException("El nombre del departamento no puede estar vacío.");
		}
	}

	public void setFacultad(String facultad) {
		if (facultad != null && !facultad.trim().isEmpty()) {
			this.facultad = facultad;
		} else {
			throw new IllegalArgumentException("El nombre de la facultad no puede estar vacío.");
		}
	}

	public void setNombreJefeDpto(String nombreJefeDpto) {
		if (nombreJefeDpto != null && !nombreJefeDpto.trim().isEmpty()) {
			this.nombreJefeDpto = nombreJefeDpto;
		} else {
			throw new IllegalArgumentException("El nombre del jefe de departamento no puede estar vacío.");
		}
	}


	public String getNombre() {
		return nombre;
	}

	public String getFacultad() {
		return facultad;
	}

	public String getNombreJefeDpto() {
		return nombreJefeDpto;
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

	public void setAsignacionesAsignaturas(ArrayList<AsigPorProf> asignacionesAsignaturas) {
		this.asignacionesAsignaturas = asignacionesAsignaturas;
	}


	public void agregarDocente(String iD, String nombre, String disponibilidad,
			float salarioBase, int antiguedad, String catDoc, String catCientif) {
		Docente d = new Docente(iD, nombre, disponibilidad, salarioBase, antiguedad, catDoc, catCientif);
		docentes.add(d);
	}

	public void agregarAdiestrado(String iD, String nombre, String disponibilidad,
			float salarioBase, int antiguedad, String catDoc, String catCientif, boolean autorizacion){
		Adiestrado a = new Adiestrado(iD, nombre, disponibilidad, salarioBase, antiguedad, catDoc, catCientif, autorizacion);
		docentes.add(a);
	}

	public void agregarAsignatura(String nombre, String disciplina, char planEstudio,
			int semestre, String carrera, int anio, String evaluacionFinal,
			ArrayList<TipoEnsenanza> ensenanzas) {
		Asignatura a = new Asignatura(nombre, disciplina, planEstudio, semestre, carrera, anio, evaluacionFinal, ensenanzas);
		asignaturas.add(a);
	}

	public void agregarPlanif(String fecha, int curso, int semestre, AsigPorProf asignacion) {
		Planificacion p = new Planificacion(fecha, curso, semestre, asignacion);
		registro.add(p);
	}

	public boolean agregarEnsenanza(TipoEnsenanza c) {
		if (c != null) {
			return ensenanzas.add(c);
		}
		return false;
	}

	public void agregarAsignacion(int horasClase, String asignatura, String tipoEnsenanza,
			String nombreProf, int grupo) {
		AsigPorProf a = new AsigPorProf(horasClase, asignatura, tipoEnsenanza, nombreProf, grupo);
		asignacionesAsignaturas.add(a);
	}


	@SuppressWarnings("unused")
	private int buscarProf(String iD) {
		int pos = -1;
		for (int i = 0; i < docentes.size(); i++) {
			if (docentes.get(i).getiD().equalsIgnoreCase(iD)) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	public int buscarAsign(String nombre) {
		int pos = -1;
		for (int i = 0; i < asignaturas.size(); i++) {
			if (asignaturas.get(i).getNombre().equalsIgnoreCase(nombre)) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	public ArrayList<Asignatura> buscarAsigPorDisc(String disc) {
		ArrayList<Asignatura> valores = new ArrayList<>();
		for (Asignatura a : asignaturas) {
			if (a.getDisciplina().equalsIgnoreCase(disc)) {
				valores.add(a);
			}
		}
		return valores;
	}

	public ArrayList<Docente> buscarProfPorDisp(String disp) {
		ArrayList<Docente> valores = new ArrayList<Docente>();
		System.out.println("Filtrando profes... " + docentes.size() + "<- Tamanio");


		for (int i = 0; i < docentes.size(); i++) {
			if(docentes.get(i).getDisponibilidad().equalsIgnoreCase(disp)){
				valores.add(docentes.get(i));
				System.out.println("(BuscarProfPorDisp)Nombre del docente actualizado: " + docentes.get(i).getNombre());
			}

		}
		return valores;
	}

	public ArrayList<Docente> buscarProfPorCatDoc(String catDoc) {
		ArrayList<Docente> valores = new ArrayList<>();
		for (Docente d : docentes) {
			if (d.getCatDoc().equals(catDoc)) {
				valores.add(d);
			}
		}
		return valores;
	}

	public ArrayList<Docente> buscarProfPorCatCientif(String catCientif) {
		ArrayList<Docente> valores = new ArrayList<>();
		for (Docente d : docentes) {
			if (d.getCatCientif().equals(catCientif)) {
				valores.add(d);
			}
		}
		return valores;
	}

	public ArrayList<Docente> buscarProfPorAsig(String asig) {
		ArrayList<Docente> valores = new ArrayList<>();
		int b;

		for (AsigPorProf d : asignacionesAsignaturas) {
			if (d.getAsignatura().equals(asig)) {
				b = buscarProfesor(d.getNombreProf());
				valores.add(docentes.get(b));
			}
		}
		return valores;
	}

	public ArrayList<Asignatura> buscarAsigPorProf(String prof) {
		System.out.println(prof);
		ArrayList<Asignatura> valores = new ArrayList<Asignatura>();
		ArrayList<String> asignaciones = new ArrayList<String>();

		for(AsigPorProf as1:asignacionesAsignaturas){
			System.out.println("Entro en el for");
					if(as1.getNombreProf().equalsIgnoreCase(prof)){
						asignaciones.add(as1.getAsignatura());
						System.out.println("se agrego " + as1.getAsignatura());
					}
		}
		for(int i = 0; i < asignaciones.size(); i++){
			for(int j = 0; j < asignaturas.size(); j++){
				if(asignaciones.get(i).equals(asignaturas.get(j).getNombre())){
					System.out.println("Agrego una asignatura :)");
					valores.add(asignaturas.get(j));        			
				}
			}
		}

		return valores;
	}

	public int buscarProfesor(String nombre){
		int pos = 0;

		for(int i = 0; i < docentes.size(); i++){
			if(docentes.get(i).getNombre().equals(nombre)){
				pos = i;
			}
		}

		return pos;
	}

	public int devolverHorasPorProf(String asig, String prof){
		int horas = 0;

		for(AsigPorProf a1: asignacionesAsignaturas){
			if(a1.getAsignatura().equals(asig) && a1.getNombreProf().equals(prof)){
				horas += a1.getHorasClase();
			}
		}

		return horas;
	}

	public ArrayList<String> filtrarEnsenanzasPorAsig(String asig){
		ArrayList<String> valores = new ArrayList<String>();
		int a = buscarAsign(asig);

		for(TipoEnsenanza t: getAsignaturas().get(a).getEnsenanzas()){
			valores.add(t.getNombre());
		}

		return valores;
	}

	public boolean existeProfesorConCI(String ci) {
		for (Docente docente : this.getDocentes()) {
			if (docente.getiD().equals(ci)) {
				return true;
			}
		}
		return false;
	}

	public boolean existePlanificacion(String profesor, String asignatura, String tipoEnsenanza, int grupo, int curso, int semestre) {
		for (Planificacion plan : this.getRegistro()) {
			AsigPorProf asignacion = plan.getAsignacion();
			if (asignacion.getNombreProf().equalsIgnoreCase(profesor) &&
					asignacion.getAsignatura().equalsIgnoreCase(asignatura) &&
					asignacion.getTipoEnsenanza().equalsIgnoreCase(tipoEnsenanza) &&
					asignacion.getGrupo() == grupo &&
					plan.getCurso() == curso &&
					plan.getSemestre() == semestre) {
				return true;
			}
		}
		return false;
	}

	public void eliminarDocente(String iD){
		System.out.println(iD);
		for(int i = 0; i < docentes.size(); i++){

			if(docentes.get(i).getiD().equals(iD)){
				System.out.println(i);
				System.out.println("Encontre y voy a eliminar a: " + docentes.get(i).getNombre());
				docentes.remove(i);
			}
		}
	}

	public void eliminarAsignatura(String nombre){
		for(int i = 0; i < asignaturas.size(); i++){

			if(asignaturas.get(i).getNombre().equals(nombre)){
				System.out.println(i);
				System.out.println("Encontre y voy a eliminar a: " + asignaturas.get(i).getNombre());
				asignaturas.remove(i);
			}
		}
	}
	
	public void eliminarPlanificacion(String asig, String tipoE){
		for(int i = 0; i < registro.size(); i++){

			if(registro.get(i).getAsignacion().getAsignatura().equals(asig) &&
					registro.get(i).getAsignacion().getTipoEnsenanza().equals(tipoE)){
				System.out.println(i);
				System.out.println("Encontre y voy a eliminar a: " + registro.get(i).getFecha());
				registro.remove(i);
			}
		}
	}
	
	public void eliminarAsignacion(String asig, String tipoE){
		for(int i = 0; i < asignacionesAsignaturas.size(); i++){

			if(asignacionesAsignaturas.get(i).getAsignatura().equals(asig) &&
					asignacionesAsignaturas.get(i).getTipoEnsenanza().equals(asig)){
				System.out.println(i);
				System.out.println("Encontre y voy a eliminar a: " + asignacionesAsignaturas.get(i).getAsignatura());
				asignacionesAsignaturas.remove(i);
			}
		}
	}
	
	public void actualizarProfConIndice(int pos, Docente d){
		docentes.remove(pos);
		docentes.add(pos, d);
	}
	
	public void actualizarAsigConIndice(int pos, Asignatura d){
		asignaturas.remove(pos);
		asignaturas.add(pos, d);
	}
	
	public void actualizarAsignacionConIndice(int pos, AsigPorProf d){
		asignacionesAsignaturas.remove(pos);
		asignacionesAsignaturas.add(pos, d);
	}
	
	public void actualizarPlanifConIndice(int pos, Planificacion d){
		registro.remove(pos);
		registro.add(pos, d);
	}
}
