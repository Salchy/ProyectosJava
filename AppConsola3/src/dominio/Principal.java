package dominio;

public class Principal {

	public static void main(String[] args) {
		Animal a = new Animal("Animal");
		
		Gato gato = new Gato("Pepita");
		
		Perro perro = new Perro("Huesos", "Galgo");
		
		System.out.println(a.toString());
		System.out.println(perro.toString());
		System.out.println(gato.toString());
		
		// Polimorfismo
		// Un objeto de la clase Hija, puede guardarse dentro de la clase Padre
		
		Animal xxx = new Perro();
		
		//////////
		
		Animal[] animales = new Animal[3];
		animales[0] = a;
		animales[1] = gato;
		animales[2] = perro;
		
		for (Animal animal : animales) {
			System.out.println(animal.toString());
		}
	}

}