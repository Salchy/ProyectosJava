package dominio;

public class Principal {

	public static void main(String[] args) {
		Animal a = new Animal("Animal");
		
		Gato gato = new Gato("Pepita");
		
		Perro perro = new Perro("Huesos", "Galgo");
		
		System.out.println(a.toString());
		System.out.println(perro.toString());
		System.out.println(gato.toString());
	}

}
