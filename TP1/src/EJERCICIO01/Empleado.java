package EJERCICIO01;

public class Empleado extends Persona {
	private static int indice = 1000;
	
	final private int legajo;
	private String puesto;
	
	public Empleado() {
		super();
		indice++;
		
		legajo = indice;
	}
	
	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", puesto=" + puesto + "]";
	}
	
	// Getters an setters
	public int getLegajo() {
		return legajo;
	}
	
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
}
