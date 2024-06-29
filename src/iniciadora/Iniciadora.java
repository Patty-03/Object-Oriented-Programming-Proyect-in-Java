package iniciadora;
import interfaz.*;


public class Iniciadora {

	public static void main(String[] args) {
		try {
			Bienvenida frame = new Bienvenida();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
