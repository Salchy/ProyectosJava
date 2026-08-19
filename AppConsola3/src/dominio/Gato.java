package dominio;

public class Gato extends Animal {
	// Constructores
	public Gato() {
		super();
	}
	
	public Gato(String nombre) {
		super(nombre);
	}

	@Override
	public String habilidades() {
		return "Los gatos tienen gran flexibilidad y elasticidad";
	}
	
	// Metodo ToString:
	
	@Override
	public String toString() {
		return "Es un gato, su nombre es: " + getNombre() + "";
	}
}
