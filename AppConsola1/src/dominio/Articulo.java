package dominio;

public class Articulo {
	// Atributos o variables que son de la clase (static)
	private static int cont = 0;
	
	// Atributos propios del objeto, o cada objeto de esta clase
	
	private int id;
	private String nombre;
	
	
	// Constructor
	public Articulo(String nombre) {
		cont++;
		
		//this.id = id;
		this.id = cont;
		this.nombre = nombre;
	}
	
	// Getters y setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Metodo toString
	
	@Override
	public String toString() {
		return "Articulo [id = " + id + ", nombre = " + nombre + "]";
	}

	// Metodo statico, es de la clase
	
	public static int returnNextID() {
		return cont+1;
	}
}
