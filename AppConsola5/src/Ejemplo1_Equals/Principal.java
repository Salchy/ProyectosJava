package Ejemplo1_Equals;

public class Principal {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setNombre("Leandro");
		p1.setApellido("Correa");
		p1.setDni("1122334455");
		
		Persona p2 = new Persona();
		p2.setNombre("Leandro");
		p2.setApellido("Correa");
		p2.setDni("1122334455");
		
		// == iguala la misma direccion de memoria
		
		if (p1 == p2) {
			System.out.println("Son la misma persona");
		} else {
			System.out.println("No son la misma persona");
		}
		
		// Para comparar objetos, se usa .equals, pero tengo que sobreescribir el metodo en la clase padre, para que compare atributo por atributo
		
		if (p1.equals(p2)) {
			System.out.println("Son la misma persona");
		} else {
			System.out.println("No son la misma persona");
		}
	}

}
