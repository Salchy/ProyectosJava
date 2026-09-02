package dominio;

public class Cantante extends Persona implements ICantar {
	private boolean estudios;
	
	public Cantante() {
		
	}
	
	public Cantante(String nombre, String apellido, boolean estudios) {
		super(nombre, apellido);
		this.estudios = estudios;
	}
	
	public void cantar() {
		System.out.println("Sabías, que te amo, MI VIDA!");
	}

	public boolean isEstudios() {
		return estudios;
	}

	public void setEstudios(boolean estudios) {
		this.estudios = estudios;
	}
	
	
}
