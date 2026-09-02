package dominio;

public class Principal {

	public static void main(String[] args) {
		Cantante c = new Cantante("Angela", "Leiva", true);
		System.out.print(c.getNombre() + " " + c.getApellido() + " canta: ");
		c.cantar();
		
		Pajaro p = new Pajaro("Pepe");
		System.out.print(p.getNombre() + " canta: ");
		p.cantar();
	}
}