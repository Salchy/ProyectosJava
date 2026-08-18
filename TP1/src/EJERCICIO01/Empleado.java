package EJERCICIO01;
import java.time.LocalDate;

public class Empleado extends Persona {
	private static int indice = 1000;
	
	final private int legajo;
	private String puesto;
	
	public Empleado() {
		super();
		indice++;
		
		this.legajo = indice;
	}
	
	public Empleado(String dni, String nombre, String apellido,
			LocalDate fechaNacimiento, String genero, String direccion,
			String telefono, String email, String puesto) {
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		
		indice++;
		
		this.legajo = indice;
		this.puesto = puesto;
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
