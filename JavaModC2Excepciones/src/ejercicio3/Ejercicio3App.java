/**
 * 
 */
package ejercicio3;

import excepciones.MiExcepcion;

/**
 * @author aitor
 *
 */
public class Ejercicio3App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		int numero = (int)(Math.random()*999+1);
		System.out.println("Generando número aleatorio...");
		System.out.println("El numero aleatorio generado es: "+numero);
		try {
			comprobarParidad(numero);
			
		} catch(MiExcepcion ex) {
			System.out.println(ex.getMessage());
		}

	}
	
	public static void comprobarParidad(int numero) throws MiExcepcion {
		if(numero%2==0) {throw new MiExcepcion("El numero "+numero+" es PAR");}
		else {throw new MiExcepcion("El numero "+numero+" es IMPAR");} 
	}

}
