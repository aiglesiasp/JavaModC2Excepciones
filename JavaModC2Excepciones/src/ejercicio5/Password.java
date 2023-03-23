/**
 * 
 */
package ejercicio5;

import java.security.SecureRandom;

import excepciones.MiExcepcion;

/**
 * @author aitor
 *
 */
public class Password {

	private final int LONGITUD = 8;
	private static final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	// ATRIBUTOS
	private int longitud;
	private String contraseña;

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

	public int getLongitud() {
		return longitud;
	}

	// METODO QUE GENERA UN PASSWORD ALEATORIO CON LA LONGITUD INDICADA
	private String generarPassword(int longitud) {

		SecureRandom random = new SecureRandom();
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < longitud; i++) {
			int index = random.nextInt(ALFABETO.length());
			builder.append(ALFABETO.charAt(index));
		}
		return builder.toString();
	}
	
	//METODO QUE COMPRUEBA SI UNA CONTRASEÑA ES DEBIL(FALSE) o FUERTE(TRUE)
	public boolean esFuerte() {
		int contMay = 0;
		int contMin = 0;
		int contNum = 0;
		for (int i = 0; i<contraseña.length(); i++) {
			char letra = contraseña.charAt(i);
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
