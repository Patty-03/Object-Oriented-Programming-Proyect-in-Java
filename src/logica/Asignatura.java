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

    public Asignatura(String nombre, String disciplina, char planEstudio,
                      int semestre, String carrera, int anio, String evaluacionFinal,
                      ArrayList<TipoEnsenanza> ensenanzas) {
        setNombre(nombre);
        setDisciplina(disciplina);
        setPlanEstudio(planEstudio);
        setSemestre(semestre);
        setCarrera(carrera);
        setAnio(anio);
        setEvaluacionFinal(evaluacionFinal);
        setEnsenanzas(ensenanzas);
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre de la asignatura no puede estar vacío");
        }
    }

    public void setDisciplina(String disciplina) {
        if (disciplina != null && !disciplina.trim().isEmpty()) {
            this.disciplina = disciplina;
        } else {
            throw new IllegalArgumentException("La disciplina no puede estar vacía");
        }
    }

    public void setPlanEstudio(char planEstudio) {
        if (Character.isLetter(planEstudio)) {
            this.planEstudio = planEstudio;
        } else {
            throw new IllegalArgumentException("El plan de estudio debe ser una letra mayúscula");
        }
    }

    public void setSemestre(int semestre) {
        if (semestre > 0) {
            this.semestre = semestre;
        } else {
            throw new IllegalArgumentException("El semestre debe ser un número positivo");
        }
    }

    public void setCarrera(String carrera) {
        if (carrera != null && !carrera.trim().isEmpty()) {
            this.carrera = carrera;
        } else {
            throw new IllegalArgumentException("La carrera no puede estar vacía");
        }
    }

    public void setAnio(int anio) {
        if (anio > 0) {
            this.anio = anio;
        } else {
            throw new IllegalArgumentException("El año debe ser un número positivo");
        }
    }

    public void setEvaluacionFinal(String evaluacionFinal) {
        if (evaluacionFinal != null && !evaluacionFinal.trim().isEmpty()) {
            this.evaluacionFinal = evaluacionFinal;
        } else {
            throw new IllegalArgumentException("La evaluación final no puede estar vacía");
        }
    }

    public void setEnsenanzas(ArrayList<TipoEnsenanza> ensenanzas) {
        if (ensenanzas != null && !ensenanzas.isEmpty()) {
            this.ensenanzas = ensenanzas;
        } else {
            throw new IllegalArgumentException("Debe haber al menos un tipo de enseñanza");
        }
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public char getPlanEstudio() {
        return planEstudio;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getAnio() {
        return anio;
    }

    public String getEvaluacionFinal() {
        return evaluacionFinal;
    }

    public ArrayList<TipoEnsenanza> getEnsenanzas() {
        return ensenanzas;
    }
    
    public int getHoras(String tE){
    	int h = 0;
    	
    	for(TipoEnsenanza e: ensenanzas){
    		if(e.getNombre().equals(tE)){
    			h = e.getHoras();
    		}
    	}
    	return h;
    }
}
