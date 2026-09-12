package dominio;
import java.util.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		List<Persona> arrayListPersona = new ArrayList<>();
		
		arrayListPersona.add(new Persona("Leandro", "Correa"));
		arrayListPersona.add(new Persona("Pepito", "Juarez"));
		arrayListPersona.add(new Persona("Angela", "Leiva"));
		
		System.out.println("ArrayList:");
        System.out.println(arrayListPersona);
	}

}
