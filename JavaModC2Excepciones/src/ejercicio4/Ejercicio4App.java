/**
 * 
 */
package ejercicio4;

import java.util.Scanner;

import calculadora.Calculadora;

/**
 * @author aitor
 *
 */
public class Ejercicio4App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eleccion;
		Calculadora calculo = new Calculadora();
		int num1, num2;
		System.out.println("Bienvenido a la calculadora");
		try {
			
		
		do {
			System.out.println("1: SUMAR");
			System.out.println("2: RESTAR");
			System.out.println("3: MULTIPLICAR");
			System.out.println("4: POTENCIA");
			System.out.println("5: RAIZ CUADRADA");
			System.out.println("6: RAIZ CUBICA");
			System.out.println("7: DIVISION");
			System.out.println("0: SALIR");
			System.out.print("Elige una opcion: ");
			eleccion = sc.nextInt();
			switch (eleccion) {
			case 1:
				System.out.print("Introduce el primer numero: ");
				num1 = sc.nextInt();
				System.out.print("Introduce el primer numero: ");
				num2 = sc.nextInt();
				calculo.sumar(num1, num2);
				break;
			case 2:
				System.out.print("Introduce el primer numero: ");
				num1 = sc.nextInt();
				System.out.print("Introduce el primer numero: ");
				num2 = sc.nextInt();
				calculo.restar(num1, num2);
				break;
			case 3:
				System.out.print("Introduce el primer numero: ");
				num1 = sc.nextInt();
				System.out.print("Introduce el primer numero: ");
				num2 = sc.nextInt();
				calculo.multiplicar(num1, num2);
				break;
			case 4:
				System.out.print("Introduce la base: ");
				num1 = sc.nextInt();
				System.out.print("Introduce la potencia: ");
				num2 = sc.nextInt();
				calculo.potencia(num1, num2);
				break;
			case 5:
				System.out.print("Introduce un numero: ");
				num1 = sc.nextInt();
				calculo.raizCuadrada(num1);
				break;
			case 6:
				System.out.print("Introduce un numero: ");
				num1 = sc.nextInt();
				calculo.raizCubica(num1);
				break;
			case 7:
				System.out.print("Introduce el dividendo: ");
				num1 = sc.nextInt();
				System.out.print("Introduce el divisor: ");
				num2 = sc.nextInt();
				calculo.division(num1, num2);
				break;
			case 0:
				System.out.println("Que tenga un buen dia");
				break;
			}
			System.out.println("");
		} while (eleccion != 0);
		}catch(ArithmeticException e) {
			System.err.println(e.getLocalizedMessage().toString());
		} finally {
			sc.close();
		}
	}
}
