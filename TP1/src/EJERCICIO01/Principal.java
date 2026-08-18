package EJERCICIO01;

public class Principal {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado();
		Empleado emp2 = new Empleado();
		Empleado emp3 = new Empleado();
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		
		System.out.println("Proximo legajo a ser añadido: " + Empleado.devuelveProximoLegajo());
	}
}