package dominio;

public class ArticuloGimnasio extends Articulo {
	private int peso;
	//private final int GRAMOS = 1000; // constante del objeto (cada instancia va a tener una copia de este valor)
	private static final int GRAMOS = 1000; // constante de la clase

	// Constructores
	public ArticuloGimnasio() {
		super(); // Constructor del padre
	}
	
	public ArticuloGimnasio(String nombre, int peso) {
		super(nombre); // Llamo al consutrcor padre (Articulo) que recibe un String
		this.peso = peso;
	}
	
	// Getters y setters
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	// Metodos
	public int devuelvePesoEnGramos() {
		return peso * GRAMOS;
	}

	@Override
	public String toString() {
		return super.toString() + ", peso = " + peso;
	}
}
