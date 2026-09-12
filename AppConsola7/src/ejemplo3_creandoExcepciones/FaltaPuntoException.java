package ejemplo3_creandoExcepciones;

public class FaltaPuntoException extends RuntimeException {
	public FaltaPuntoException() {
		
	}

	@Override
	public String getMessage() {
		return "Falta colocar el punto";
	}
}
