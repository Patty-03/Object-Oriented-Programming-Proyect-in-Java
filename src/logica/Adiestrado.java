package logica;

public class Adiestrado extends Docente{
	private boolean autorizacion;

	public Adiestrado(String iD, String nombre, String disponibilidad,
			float salarioBase, int antiguedad, String catDoc, String catCientif, boolean autorizacion) {
		super(iD, nombre, disponibilidad, salarioBase, antiguedad, catDoc, catCientif);
		this.autorizacion = autorizacion;
	}

	public boolean isAutorizacion() {
		return autorizacion;
	}

	public void setAutorizacion(boolean autorizacion) {
		this.autorizacion = autorizacion;
	}
}
