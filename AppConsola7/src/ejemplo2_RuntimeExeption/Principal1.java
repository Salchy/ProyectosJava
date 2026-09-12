package ejemplo2_RuntimeExeption;

public class Principal1 {

	public static void main(String[] args) {
		int [] vector = new int[5];
		
		try {
			vector[0] = 10;
			vector[1] = 20;
			vector[2] = 30;
			vector[3] = 40;
			vector[4] = 50;
			vector[5] = 60; // este está mal			
		}
		catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("Se está tratando de acceder a una posicion inválida");
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Números: " + vector[i]);
		}
	}

}