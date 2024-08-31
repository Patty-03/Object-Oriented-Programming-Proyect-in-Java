package util;

public class Autenticacion {
	private String user;
	private String password;

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Autenticacion(String user, String password) {
		setUser(user);
		setPassword(password);
	}

	public String comprobarLogin(String user, String pass){
		String textoError = "";
		if(user.equals(getUser()) && !pass.equals(getPassword())){
			textoError = "Contraseña incorrecta";
		}
		else if(!user.equals(getUser()) && pass.equals(getPassword())){
			textoError = "Nombre de usuario incorrecto";
		}
		else if(!user.equals(getUser()) && !pass.equals(getPassword())){
			textoError = "Usuario y contraseña incorectos";
		}

		return textoError;
	}

}
