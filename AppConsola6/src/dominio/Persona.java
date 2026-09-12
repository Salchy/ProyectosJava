package dominio;

import java.util.Objects;

// Para usar treeSet tengo que implementar la interfaz Comparable
public class Persona implements Comparable<Persona> {
	// atributo estatico de la clase
	private static int contador = 0;
	
	private final int id;
	private String nombre;
	private String apellido;
	
	// Constructor
	public Persona(String nombre, String apellido) {
		contador = contador + 1;
		this.id = contador;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre = " + nombre + ", apellido = " + apellido + "]";
	}

	// Getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(nombre, other.nombre);
	}

	// el método compareTo me lo oblica a desarollar la interfaz Comparable
	// o es objeto ya existente en el treeset
	// this, es el objeto nuevo que quiero añadir
	
	// Regla practica:
	// me paro desde el this (objeto nuevo)
	// -1 significa, this es MENOR, ponme ANTES (a la izquierda)
	// 1 significa, this es MAYOR, ponme DESPUES (a la derecha)
	@Override
	public int compareTo(Persona o) {
		// Ordenamiento
		if (o.id == this.id)
			return 0; // devuelve 0, el elemento está duplicado, es igual a uno que ya está en la lista. No se va a añadir
		
		if (this.id > o.id) // el ID del objeto nuevo que quiero añadir es mayor al ID ya existente?
			return 1;
		
		return -1;
	}
	
	
}
