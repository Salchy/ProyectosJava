package dominio;

public class Gato extends Animal {
	// Constructores
	public Gato() {
		super();
	}
	
	public Gato(String nombre) {
		super(nombre);
	}

	// Metodo ToString:
	
	@Override
	public String toString() {
		return "Es un gato, su nombre es: " + getNombre() + "";
	}
}
