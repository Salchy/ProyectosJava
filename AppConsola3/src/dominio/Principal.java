package dominio;

public class Principal {

	public static void main(String[] args) {
		//Animal a = new Animal("Animal");
		
		Gato gato = new Gato("Pepita");
		
		Perro perro = new Perro("Huesos", "Galgo");
		
		//System.out.println(a.toString());
		//System.out.println(perro.toString() + " " + perro.habilidades());
		//System.out.println(gato.toString() + " " + gato.habilidades());
		
		// Polimorfismo
		// Un objeto de la clase Hija, puede guardarse dentro de la clase Padre
		
		Animal xxx = new Perro();
		
		//////////
		
		Animal[] animales = new Animal[2];
		//animales[0] = a;
		animales[0] = gato;
		animales[1] = perro;
		
		for (Animal animal : animales) {
			System.out.println(animal.toString() + " " + animal.habilidades());
		}
	}
}