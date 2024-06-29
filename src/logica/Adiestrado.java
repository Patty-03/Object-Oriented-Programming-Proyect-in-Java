package logica;

public class Adiestrado extends Profesor{
	private boolean autorizacion;

	public boolean isAutorizacion() {
		return autorizacion;
	}

	public void setAutorizacion(boolean autorizacion) {
		this.autorizacion = autorizacion;
	}

	public Adiestrado(String iD, String nombre, String catDoc,
			String catCientif, String disponibilidad, float salarioBase,
			int antiguedad, boolean autorizacion) {
		super(iD, nombre, catDoc, catCientif, disponibilidad, salarioBase,
				antiguedad);
		this.autorizacion = autorizacion;
	}
	
	
}
