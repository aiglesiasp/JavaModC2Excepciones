/**
 * 
 */
package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author aitor
 *
 */
public class Ejercicio1App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int numeroAdivinar = (int)(Math.random()*500+1);
		boolean estado = true;
		int contador = 0;
		int numeroIntroducido = 0;
		
		do {
			System.out.print("Introduce un numero del 1 al 500 a ver si lo adivinas: ");
			try {
				contador++;
				numeroIntroducido = sc.nextInt();
				if(numeroIntroducido<numeroAdivinar) {
					System.out.println("El numero que buscas es mas grande");
				} else if (numeroIntroducido>numeroAdivinar) {
					System.out.println("El numero que buscas es mas pequeño");
				} else {
					estado = false;
					System.out.println("HAS ENCONTRADO EL NUMERO!!!, efectivamente era el "+numeroIntroducido+" y has necesitado "+contador+" intentos");
				}
			} catch (NullPointerException e) {
				System.out.println("No se ha conseguido reconocer la entrada por teclado");
			} 
		} while (estado);
		System.out.println("");

	}
}
