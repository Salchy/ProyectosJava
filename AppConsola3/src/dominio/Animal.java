package dominio;

public class Animal {
	private String nombre;

	// Constructores:
	public Animal() {
		this.nombre = "Sin nombre";
	}
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}
	
	// Getters y Setters:
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Es un animal, su nombre es: " + nombre;
	}
	
	// Método toString
	
}
