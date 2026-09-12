package ejemplo3_creandoExcepciones;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String correo = JOptionPane.showInputDialog("Ingrese correo electronico");
		
		try {
			Mail.validarMail(correo);			
		}
		catch (FaltaArrobaException e) {
			JOptionPane.showMessageDialog(null, "Debes colocar un arroba.", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		catch (FaltaPuntoException e) {
			JOptionPane.showMessageDialog(null, "Debes colocar un punto.", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
		JOptionPane.showMessageDialog(null, "Correcto.", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
	}
}