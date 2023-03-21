/**
 * 
 */
package ejercicio5;

import java.security.SecureRandom;

/**
 * @author aitor
 *
 */
public class Password {

	private final int LONGITUD = 8;

	// ATRIBUTOS
	int longitud;
	String contraseña;

	// CONSTRUCTORES
	public Password() {
		this.longitud = LONGITUD;
		this.contraseña = generarPassword(LONGITUD);

	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword(longitud);
	}

	//GETTERS y SETTERS
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	// METODO QUE GENERA UN PASSWORD ALEATORIO CON LA LONGITUD INDICADA
	private static String generarPassword(int longitud) {

		final String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		SecureRandom random = new SecureRandom();
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < longitud; i++) {
			int index = random.nextInt(alfabeto.length());
			builder.append(alfabeto.charAt(index));
		}
		return builder.toString();
	}
	
	//METODO QUE COMPRUEBA SI UNA CONTRASEÑA ES DEBIL(FALSE) o FUERTE(TRUE)
	public static boolean esFuerte(String password) {
		int contMay = 0;
		int contMin = 0;
		int contNum = 0;
		for (int i = 0; i<password.length(); i++) {
			char letra = password.charAt(i);
			if(Character.isUpperCase(letra)) {
				contMay++;
			} else {
				contMin++;
			}
			if(Character.isDigit(letra)) {
				contNum++;
			}
		}
		if(contMay>2 && contMin>1 && contNum>5) return true;
		else return false;
	}
}
