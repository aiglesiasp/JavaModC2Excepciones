package calculadora;

public class Calculadora {
	//ATRIBUTOS
	double resultado;
	//GETTERS y SETTERS
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	//CONSTRUCTOR
	public Calculadora() {
		this.resultado = 0.0;
	}
	//METODOS
	public void sumar(double num1, double num2) throws ArithmeticException {
		double res = num1+num2;
		setResultado(res);
		System.out.println("El resultado de la suma entre "+num1+" y "+num2+" es de "+res);
	}
	
	public void restar(double num1, double num2) throws ArithmeticException {
		double res = num1-num2;
		setResultado(res);
		System.out.println("El resultado de la resta entre "+num1+" y "+num2+" es de "+res);
	}
	
	public void multiplicar(double num1, double num2) throws ArithmeticException {
		double res = num1*num2;
		setResultado(res);
		System.out.println("El resultado de la multiplicacion entre "+num1+" y "+num2+" es de "+res);
	}
	
	public void potencia(double base, double potencia) throws ArithmeticException {
		double res = Math.pow(base, potencia);
		setResultado(res);
		System.out.println("El resultado de "+base+" elevado a "+potencia+" es de "+res);
	}
	
	public void raizCuadrada(double num) throws ArithmeticException {
		double res = Math.sqrt(num);
		setResultado(res);
		System.out.println("La raiz cuadrada de "+num+" es de "+res);
	}
	
	public void raizCubica(double num) throws ArithmeticException {
		double res = Math.cbrt(num);
		setResultado(res);
		System.out.println("La raiz cubica de "+num+" es de "+res);
	}
	
	public void division(double num1, double num2) throws ArithmeticException {
		double res = num1/num2;
		setResultado(res);
		System.out.println("El resultado de la division entre "+num1+" y "+num2+" es de "+res);
	}

}
