package dominio;

public class Principal {

	public static void main(String[] args) {
		/*
		Articulo art1 = new Articulo("Articulo 1");
		Articulo art2 = new Articulo("Articulo 2");
		Articulo art3 = new Articulo("Articulo 3");
		
		//System.out.println("ID: " + art.getId() + " - Nombre: " + art.getNombre());
		
		// System.out.println(art.toString());
		
		System.out.println(art1.toString());
		System.out.println(art2.toString());
		System.out.println(art3.toString());
		*/
		
		Articulo[] articulos = new Articulo[3];
		
		articulos[0] = new Articulo("Articulo 1");
		articulos[1] = new Articulo("Articulo 2");
		articulos[2] = new Articulo("Articulo 3");
		
		for (Articulo articulo : articulos) {
			System.out.println(articulo.toString());
		}
		
		System.out.println(Articulo.returnNextID());

	}

}