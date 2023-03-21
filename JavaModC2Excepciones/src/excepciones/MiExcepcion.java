package excepciones;

public class MiExcepcion extends Exception {

	//ATRIBUTOS
	private String errorMessage;
	
	//CONSTRUCTORES
	public MiExcepcion(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	
	public MiExcepcion() {
		super();
	}
	
	//METODOS
	@Override
	public String getMessage() {
		return errorMessage;
	}
}
