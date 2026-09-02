package dominio;

public class Pajaro implements ICantar {
	private String nombre;
	
	public Pajaro() {
		
	}
	
	public Pajaro(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void cantar() {
		System.out.println("Pio Pio Pio");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pajaro [edad=" + nombre + "]";
	}
	
	
}
