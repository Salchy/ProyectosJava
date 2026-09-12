package ejemplo3_creandoExcepciones;

public class Mail {
	public Mail() {
		
	}
	
	// En la definicion del método, tengo que poner throws, y TODOS los exceptions que este método arroja
	public static Boolean validarMail (String mail) throws FaltaArrobaException, FaltaPuntoException {
		Boolean auxArroba = false;
		Boolean auxPunto = false;
		
		for (int i = 0; i < mail.length(); i++) {
			if (mail.charAt(i) == '@')
				auxArroba = true;
			if (mail.charAt(i) == '.')
				auxPunto = true;
			
			if (auxArroba && auxPunto)
				break;
		}
		
		if (!auxArroba) {
			FaltaArrobaException exc1 = new FaltaArrobaException();
			throw exc1;			
		}
		
		if (!auxPunto)
			//FaltaPuntoException exc2 = new FaltaPuntoException();
			throw new FaltaPuntoException();
		
		return auxArroba && auxPunto;
	}
}