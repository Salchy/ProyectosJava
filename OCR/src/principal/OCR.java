package principal;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class OCR {

    private ITesseract tesseract;

    public OCR() {

        tesseract = new Tesseract();

        tesseract.setDatapath("./tessdata");
        tesseract.setLanguage("spa");
    }

    public String leerImagen(File imagen) {

        try {

            return tesseract.doOCR(imagen);

        } catch (TesseractException e) {

            e.printStackTrace();

            return "";
        }
    }
}