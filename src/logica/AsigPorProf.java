package logica;

public class AsigPorProf {
    private int horasClase;
    private String asignatura;
    private String tipoEnsenanza;
    private String nombreProf;
    private int grupo;


    public AsigPorProf(int horasClase, String asignatura, String tipoEnsenanza,
                       String nombreProf, int grupo) {
        setHorasClase(horasClase);
        setAsignatura(asignatura);
        setTipoEnsenanza(tipoEnsenanza);
        setNombreProf(nombreProf);
        setGrupo(grupo);
    }


    public AsigPorProf() {
		// TODO Auto-generated constructor stub
	}


	public void setHorasClase(int horasClase) {
        if (horasClase > 0) {
            this.horasClase = horasClase;
        } else {
            throw new IllegalArgumentException("Las horas de clase deben ser un número positivo");
        }
    }

    public void setAsignatura(String asignatura) {
        if (asignatura != null && !asignatura.trim().isEmpty()) {
            this.asignatura = asignatura;
        } else {
            throw new IllegalArgumentException("La asignatura no puede estar vacía");
        }
    }

    public void setTipoEnsenanza(String tipoEnsenanza) {
        if (tipoEnsenanza != null && !tipoEnsenanza.trim().isEmpty()) {
            this.tipoEnsenanza = tipoEnsenanza;
        } else {
            throw new IllegalArgumentException("El tipo de enseñanza no puede estar vacío");
        }
    }

    public void setNombreProf(String nombreProf) {
        if (nombreProf != null && !nombreProf.trim().isEmpty()) {
            this.nombreProf = nombreProf;
        } else {
            throw new IllegalArgumentException("El nombre del profesor no puede estar vacío");
        }
    }

    public void setGrupo(int grupo) {
        if (grupo > 0) {
            this.grupo = grupo;
        } else {
            throw new IllegalArgumentException("El grupo debe ser un número positivo");
        }
    }


    public int getHorasClase() {
        return horasClase;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getTipoEnsenanza() {
        return tipoEnsenanza;
    }

    public String getNombreProf() {
        return nombreProf;
    }

    public int getGrupo() {
        return grupo;
    }
}
