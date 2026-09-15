package principal;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;

public class main {

	public static void main(String[] args) {
		System.out.println("Factura QR Reader iniciado");
		ArrayList<Factura> facturas = new ArrayList<Factura>();
		
		try {
			
			File carpeta = new File("facturas");
			
			File[] archivos = carpeta.listFiles();
			
			for (File archivo : archivos) {
				try {
					System.out.println("Procesando: " + archivo.getName());
					
					BufferedImage img = ImageIO.read(archivo);
					BufferedImageLuminanceSource fuente = new BufferedImageLuminanceSource(img);
					BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(fuente));
					
					Result resultado = new MultiFormatReader().decode(bitmap);
					
					String contenidoQR = resultado.getText();
					
					String parametroP = contenidoQR.substring(contenidoQR.indexOf("?p=") + 3);
					
					byte[] datos = Base64.getDecoder().decode(parametroP);
					
					String json = new String(datos, StandardCharsets.UTF_8);
					
					ObjectMapper mapper = new ObjectMapper();
					Factura factura = mapper.readValue(json, Factura.class);
					
					facturas.add(factura);
					
				} catch (NotFoundException e) {
					e.printStackTrace();
			        System.out.println("No se encontró QR en: " + archivo.getName());
				}
				catch (Exception e) {
					e.printStackTrace();
					System.out.println("Error procesando: " + archivo.getName());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (Factura factura : facturas) {
			System.out.println(factura.toString());
		}
	}
}
