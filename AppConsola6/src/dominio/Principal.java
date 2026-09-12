package dominio;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		Persona lean = new Persona("Leandro", "Correa");
		Persona angi = new Persona("Angela", "Leiva");
		
		// List
		
			// Ejemplo de ArrayList (Se guarda en celdas continuas en memoria)
			List<Persona> personasList1 = new ArrayList<>();
			
			personasList1.add(lean);
			personasList1.add(angi);
			personasList1.add(new Persona("Angela", "Leiva"));
			
			System.out.println("ArrayList:");
	        System.out.println(personasList1);
	        
	        // Ejemplo de LinkedList (Son listas enlazadas)
	        List<Persona> personasList2 = new LinkedList<>();
	        personasList2.add(lean);
	        personasList2.add(angi);
	        
	        System.out.println("LinkedList:");
	        System.out.println(personasList2);
	        
        // Set
	        // No se pueden tener 2 elementos iguales
	        // Ejemplo de HashSet (No repite elementos, orden aleatorio)
	        Set<Persona> personasSet1 = new HashSet<>();
	        
	        personasSet1.add(lean);
	        personasSet1.add(angi);
	        
	        System.out.println("HashSet:");
	        System.out.println(personasSet1);

	        // Ejemplo de TreeSet (No repite elementos, se ordena solo)
	        // Para el ejemplo de persona, creo que tengo que usar interfaces en persona
	        // lCORRECCION: De hecho, lo que tengo que hacer, es implementar método hashCode y Equals en Persona
			
			  Set<Persona> personasSet2 = new TreeSet<>();
			  
			  personasSet2.add(new Persona("Test", "TreeSet")); // el valor a añadir, es ID 3, por mas que lo añadí primero, se va a ir ordenando con los add de abajo, ya que tienen ID menor
			  personasSet2.add(angi); // Angii es ID 2
			  personasSet2.add(lean); // Lean es ID 1 // Como id 1 es menor que ID 2, lo va a colocar antes
			  
			  System.out.println("TreeSet:");
			  System.out.println(personasSet2);
			 
	        // ----------------
			
			  Set<Integer> treeSet = new TreeSet<>();
			  
			  treeSet.add(5); treeSet.add(3); treeSet.add(1);
			  
			  System.out.println("TreeSet:");
			  System.out.println(treeSet);
			 
	        
        // Queue
	        // Para el ejemplo con Persona tengo que implementar Comparables
		/*
		 * Queue<Persona> queuePersonas = new PriorityQueue<>();
		 * 
		 * queuePersonas.add(lean); queuePersonas.add(angi);
		 */
	        
	        Queue<String> cola = new PriorityQueue<>();
	        
	        cola.add("Leandro");
	        cola.add("Angela");
	        
	        System.out.println("Queue (PriorityQueue):");
	        System.out.println(cola);
	        
      	// Map
	        // Clave - Valor (Orden aleatorio)
	        Map<String, Integer> hashMap = new HashMap<>();
	         
	        hashMap.put("Leandro", 26);
	        hashMap.put("Angela", 37);
	        
	        System.out.println("hashMap:");
	        System.out.println(hashMap);
	        
	        // TreeMap
	        
	        // Ordena por la clave
	        Map<String, Double> treeMap = new TreeMap<>();
	        
	        treeMap.put("Pan", 150.0);
	        treeMap.put("Leche", 200.0);
	        treeMap.put("Arroz", 120.0);
	        
	        System.out.println("TreeMap:");
	        System.out.println(treeMap);
	}
}
