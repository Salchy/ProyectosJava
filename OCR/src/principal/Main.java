package principal;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		File imagen = new File("imagenes/img.png");

        OCR ocr = new OCR();
        
        String texto = ocr.leerImagen(imagen);

        System.out.println(texto);

	}
}