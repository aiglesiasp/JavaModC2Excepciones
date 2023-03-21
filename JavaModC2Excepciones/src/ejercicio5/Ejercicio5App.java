/**
 * 
 */
package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author aitor
 *
 */
public class Ejercicio5App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cuantas contraseñas quieres generar? ");
		int tamaño = sc.nextInt();
		Password listaPasswords[] = new Password[tamaño];
		boolean listaSeguridad[] = new boolean[tamaño];
		
		for(int i = 0; i<listaPasswords.length; i++) {
			System.out.print("Introduce la longitud de la contraseña: ");
			int longitud = sc.nextInt();
			Password password = new Password(longitud);
			listaPasswords[i] = password;
			listaSeguridad[i] = Password.esFuerte(password.getContraseña());
			listaPasswords[i].toString();
		}
		
		for(int i=0; i<listaPasswords.length; i++) {
			System.out.print(listaPasswords[i].getContraseña());
			System.out.print(" ");
			System.out.println(listaSeguridad[i]);
		}
	}
}
