package ejemplo2_RuntimeExeption;

import javax.swing.JOptionPane;

public class Principal2 {

	public static void main(String[] args) {
		
		try {			
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese num1:"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese num2:"));
			
			int resultado = num1 / num2;
		}
		catch (ArithmeticException e) {
			System.out.println("Error por division por cero.");
		}
		catch (NumberFormatException e) {
			System.out.println("Error se necesita formato numérico");
		}
		finally {
			
		}
	}
}