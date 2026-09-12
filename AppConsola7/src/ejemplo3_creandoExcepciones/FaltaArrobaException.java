package ejemplo3_creandoExcepciones;

public class FaltaArrobaException extends Exception {
	public FaltaArrobaException() {
		
	}

	@Override
	public String getMessage() {
		return "Falta colocar el arroba";
	}
}
