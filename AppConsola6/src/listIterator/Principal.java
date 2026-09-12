package listIterator;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// Hay 2 iteradores:
		// ListIterator: sólo para colecciones de tipo List
		// Iterator: para todas las demas colecciones (Set, Queue, Map)
		
		List<Persona> personas = new ArrayList<Persona>();
		
		personas.add(new Persona("Leandro", "Correa"));
		personas.add(new Persona("Angela", "Leiva"));
		personas.add(new Persona("Pepito", "Juarez"));
	
		// Recorrer con un for: clásico
		System.out.println("Recorriendo 'personas' con un for:");
		for (int i = 0; i < personas.size(); i++) {
			System.out.println(personas.get(i).toString());
		}
		
		// Recorrer con ListIterator:
		
		ListIterator<Persona> it = personas.listIterator();
		
		System.out.println("\nRecorriendo 'personas' con un Iterator");
		while (it.hasNext()) { // Mientras haya proximo índice
			Persona p = it.next();
			// it.remove(); // un iterador me permite modificar la lista, mientras la estoy recorriendo
			System.out.println(p.toString());
		}
	}
}
