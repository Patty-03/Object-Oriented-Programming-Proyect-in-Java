package logica;

public class Docente {
    protected String iD;
    protected String nombre;
    protected String disponibilidad;
    protected float salarioBase;
    protected int antiguedad;
    private String catDoc;
    private String catCientif;


    public Docente(String iD, String nombre, String disponibilidad,
                   float salarioBase, int antiguedad, String catDoc, String catCientif) {
        setiD(iD);
        setNombre(nombre);
        setDisponibilidad(disponibilidad);
        setSalarioBase(salarioBase);
        setAntiguedad(antiguedad);
        setCatDoc(catDoc);
        setCatCientif(catCientif);
    }


    public void setiD(String iD) {
        if (iD != null && !iD.trim().isEmpty() && iD.matches("^[a-zA-Z0-9]+$")) {
            this.iD = iD;
        } else {
            throw new IllegalArgumentException("El ID no puede estar vacío y debe contener solo letras y números");
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
    }

    public void setDisponibilidad(String disponibilidad) {
        if (disponibilidad != null && !disponibilidad.trim().isEmpty()) {
            this.disponibilidad = disponibilidad;
        } else {
            throw new IllegalArgumentException("La disponibilidad no puede estar vacía");
        }
    }

    public void setSalarioBase(float salarioBase) {
        if (salarioBase > 0) {
            this.salarioBase = salarioBase;
        } else {
            throw new IllegalArgumentException("El salario base debe ser un número positivo");
        }
    }

    public void setAntiguedad(int antiguedad) {
        if (antiguedad >= 0) {
            this.antiguedad = antiguedad;
        } else {
            throw new IllegalArgumentException("La antigüedad no puede ser negativa");
        }
    }

    public void setCatDoc(String catDoc) {
        if (catDoc != null && !catDoc.trim().isEmpty()) {
            this.catDoc = catDoc;
        } else {
            throw new IllegalArgumentException("La categoría docente no puede estar vacía");
        }
    }

    public void setCatCientif(String catCientif) {
        if (catCientif != null && !catCientif.trim().isEmpty()) {
            this.catCientif = catCientif;
        } else {
            throw new IllegalArgumentException("La categoría científica no puede estar vacía");
        }
    }


    public String getiD() {
        return iD;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public String getCatDoc() {
        return catDoc;
    }

    public String getCatCientif() {
        return catCientif;
    }
}
