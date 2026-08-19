package dominio;

public abstract class Animal { // clase abstract, hace que no se pueda crear instancias de la clase Animal
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
	
	// Metodo abstracto, hago que este metodo, sea de la clase animal
	// Pero que tenga que ser desarollada en las clases que hereden
	// de animal
	public abstract String habilidades();
	
	// Método toString
	
}
