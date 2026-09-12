package ejemplo1_IOExeption;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Principal {

	public static void main(String[] args) {
		// Las IOexeption siempre van a estar dentro de un bloque try - catch
		
		try {
			Image imagen = ImageIO.read( new File("src/imagen-gif"));
		} catch (IOException e) {
			e.printStackTrace(); // Me tira informacion más precisa del error
			System.out.println("No se pudo acceder a la imagen");
		} finally {
			// Siempre se va a ejecutar
		}
	}

}
