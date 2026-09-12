package iterator;
import java.util.HashSet;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		HashSet<Persona> personas = new HashSet<Persona>();

		personas.add(new Persona("Leandro", "Correa"));
		personas.add(new Persona("Angela", "Leiva"));
		personas.add(new Persona("Pepito", "Juarez"));
		
		Iterator<Persona> it = personas.iterator();
		
		while (it.hasNext()) {
			Persona p = it.next();
			System.out.println(p.toString());
		}
	}
}
