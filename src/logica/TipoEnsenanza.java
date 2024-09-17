package logica;

public class TipoEnsenanza {
    private String nombre;
    private int horas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas >= 0) {
            this.horas = horas;
        } else {
            throw new IllegalArgumentException("Las horas deben ser un número positivo.");
        }
    }

    public TipoEnsenanza(String nombre, int horas) {
        setNombre(nombre);
        setHoras(horas);
    }
}
