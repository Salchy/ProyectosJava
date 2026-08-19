package dominio;

public class Perro extends Animal {
	private String raza;

	// Constructores:
	public Perro() {
		super();
		this.raza = "Sin raza";
	}
	
	public Perro(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}
	
	// Getters y setters:
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	@Override
	public String habilidades() {
		return "Los perros pueden localizar y separar olores.";
	}
	
	// Método ToString:
	@Override
	public String toString() {
		return "Es un perro, su nombre es: " + getNombre() + " y su raza es: " + raza;
	}
}