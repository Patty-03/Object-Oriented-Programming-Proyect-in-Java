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
            throw new IllegalArgumentException("El ID no puede estar vac�o y debe contener solo letras y n�meros");
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vac�o");
        }
    }

    public void setDisponibilidad(String disponibilidad) {
        if (disponibilidad != null && !disponibilidad.trim().isEmpty()) {
            this.disponibilidad = disponibilidad;
        } else {
            throw new IllegalArgumentException("La disponibilidad no puede estar vac�a");
        }
    }

    public void setSalarioBase(float salarioBase) {
        if (salarioBase > 0) {
            this.salarioBase = salarioBase;
        } else {
            throw new IllegalArgumentException("El salario base debe ser un n�mero positivo");
        }
    }

    public void setAntiguedad(int antiguedad) {
        if (antiguedad >= 0) {
            this.antiguedad = antiguedad;
        } else {
            throw new IllegalArgumentException("La antiguedad no puede ser negativa");
        }
    }

    public void setCatDoc(String catDoc) {
        if (catDoc != null && !catDoc.trim().isEmpty()) {
            this.catDoc = catDoc;
        } else {
            throw new IllegalArgumentException("La categor�a docente no puede estar vac�a");
        }
    }

    public void setCatCientif(String catCientif) {
        if (catCientif != null && !catCientif.trim().isEmpty()) {
            this.catCientif = catCientif;
        } else {
            throw new IllegalArgumentException("La categor�a cient�fica no puede estar vac�a");
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
    
    public float getSalario(){
    	float salario = salarioBase;
    	
    	if(catDoc.equalsIgnoreCase("Titular")){
    		salario += 500;
    	}
    	else if(catDoc.equalsIgnoreCase("Auxiliar")){
    		salario+=400;
    	}
    	else if(catDoc.equalsIgnoreCase("Asistente")){
    		salario+=300;
    	}
    	else if(catDoc.equalsIgnoreCase("Instructor")){
    		salario+=200;
    	}
    	else if(catDoc.equalsIgnoreCase("ATD")){
    		salario+=100;
    	}
    	
    	if(catCientif.equalsIgnoreCase("Doctor")){
    		salario += 500;
    	}
    	else if(catCientif.equalsIgnoreCase("M�ster")){
    		salario += 300;
    	}
    	
    	salario += 200 * antiguedad;
    	
    	return salario;
    }
}
