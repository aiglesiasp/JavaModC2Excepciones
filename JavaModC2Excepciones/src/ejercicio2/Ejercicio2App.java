/**
 * 
 */
package ejercicio2;

import excepciones.MiExcepcion;

/**
 * @author aitor
 *
 */
public class Ejercicio2App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			System.out.println("Mensaje mostrado por pantalla");
			throw new MiExcepcion("Excepcion capturada con mensaje: Esto es un objeto Exception");
			
		} catch(MiExcepcion excepcion) {
			System.out.println(excepcion.getMessage());
		} finally {
			System.out.println("Programa terminado");
		}
	}

}
