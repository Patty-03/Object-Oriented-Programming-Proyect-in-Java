package logica;

public class Adiestrado extends Docente {
    private boolean autorizacion;

    public Adiestrado(String iD, String nombre, String disponibilidad,
            float salarioBase, int antiguedad, String catDoc, String catCientif, boolean autorizacion) {
        super(iD, nombre, disponibilidad, salarioBase, antiguedad, catDoc, catCientif);
        setNombre(nombre);
        setDisponibilidad(disponibilidad);
        setSalarioBase(salarioBase);
        setAntiguedad(antiguedad);
        setCatDoc(catDoc);
        setCatCientif(catCientif);
        setAutorizacion(autorizacion);
    }

    public boolean isAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(boolean autorizacion) {
        this.autorizacion = autorizacion;
    }

    @Override
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            super.setNombre(nombre);
        } else {
            throw new IllegalArgumentException("El nombre debe contener solo letras y espacios, y no puede estar vac�o");
        }
    }

    @Override
    public void setDisponibilidad(String disponibilidad) {
        if (disponibilidad != null && !disponibilidad.trim().isEmpty()) {
            super.setDisponibilidad(disponibilidad);
        } else {
            throw new IllegalArgumentException("La disponibilidad no puede estar vac�o");
        }
    }

    @Override
    public void setSalarioBase(float salarioBase) {
        if (salarioBase > 0) {
            super.setSalarioBase(salarioBase);
        } else {
            throw new IllegalArgumentException("El salario base debe ser un n�mero positivo");
        }
    }

    @Override
    public void setAntiguedad(int antiguedad) {
        if (antiguedad >= 0) {
            super.setAntiguedad(antiguedad);
        } else {
            throw new IllegalArgumentException("La antiguedad no puede ser negativa");
        }
    }

    @Override
    public void setCatDoc(String catDoc) {
        if (catDoc != null && !catDoc.trim().isEmpty()) {
            super.setCatDoc(catDoc);
        } else {
            throw new IllegalArgumentException("La categor�a docente no puede estar vac�a");
        }
    }

    @Override
    public void setCatCientif(String catCientif) {
        if (catCientif != null && !catCientif.trim().isEmpty()) {
            super.setCatCientif(catCientif);
        } else {
            throw new IllegalArgumentException("La categor�a cient�fica no puede estar vac�a");
        }
    }
}