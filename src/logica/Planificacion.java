package logica;

import java.util.Date;

public class Planificacion {
    private Date fecha;
    private int curso;
    private int semestre;
    private AsigPorProf asignacion;

    public String getFecha() {
        if (fecha == null) {
            fecha = new Date();
        }
        @SuppressWarnings("deprecation")
        String date = fecha.getDay() + "/" + (fecha.getMonth() + 1) + "/" + (fecha.getYear() + 1900);
        return date;
    }

    public void setFecha(Date fecha) {
        if (fecha != null) {
            this.fecha = fecha;
        } else {
            throw new IllegalArgumentException("La fecha no puede estar vac�a.");
        }
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        if (curso > 0) {
            this.curso = curso;
        } else {
            throw new IllegalArgumentException("El curso debe ser un n�mero positivo.");
        }
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        if (semestre > 0 && semestre <= 2) {
            this.semestre = semestre;
        } else {
            throw new IllegalArgumentException("El semestre debe ser 1 o 2.");
        }
    }

    public AsigPorProf getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(AsigPorProf asignacion) {
        if (asignacion != null) {
            this.asignacion = asignacion;
        } else {
            throw new IllegalArgumentException("La asignaci�n no puede estar vac�a.");
        }
    }

    public Planificacion(Date fecha, int curso, int semestre, AsigPorProf asignacion) {
        setFecha(fecha);
        setCurso(curso);
        setSemestre(semestre);
        setAsignacion(asignacion);
    }
}
