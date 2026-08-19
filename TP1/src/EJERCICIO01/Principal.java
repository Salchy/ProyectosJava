package EJERCICIO01;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {		
		Empleado[] empleados = new Empleado[5];
		
		empleados[0] = new Empleado();
		empleados[1] = new Empleado("123456", "Leandro", "Correa", LocalDate.of(2000, 6, 27), "Masculino", "Calle 123", "1122334455", "correo@contoso.com", "Soporte de Sistemas");
		empleados[2] = new Empleado();
		empleados[3] = new Empleado();
		empleados[4] = new Empleado();
		
		for (Empleado empleado : empleados) {
			System.out.println(empleado.toString());
		}
		
		System.out.println("Proximo legajo a ser añadido: " + Empleado.devuelveProximoLegajo());
	}
}