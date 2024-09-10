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
            throw new IllegalArgumentException("El nombre del jefe de departamento no puede estar vacíos.");
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


    public boolean agregarDocente(Docente c) {
        if (c != null) {
            return docentes.add(c);
        }
        return false;
    }

    public boolean agregarAsignatura(Asignatura c) {
        if (c != null) {
            return asignaturas.add(c);
        }
        return false;
    }

    public boolean agregarPlanif(Planificacion c) {
        if (c != null) {
            return registro.add(c);
        }
        return false;
    }

    public boolean agregarEnsenanza(TipoEnsenanza c) {
        if (c != null) {
            return ensenanzas.add(c);
        }
        return false;
    }

    public boolean agregarAsignacion(AsigPorProf c) {
        if (c != null) {
            return asignacionesAsignaturas.add(c);
        }
        return false;
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
        ArrayList<Docente> valores = new ArrayList<>();
        for (Docente d : docentes) {
            if (d.getDisponibilidad().equals(disp)) {
                valores.add(d);
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
}
