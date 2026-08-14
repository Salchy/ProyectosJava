package dominio;

public class Principal {

	public static void main(String[] args) {
		ArticuloGimnasio artGym = new ArticuloGimnasio("Gimnasio 1", 5);
		
		System.out.println(artGym.toString());
		
		System.out.println(artGym.devuelvePesoEnGramos() + " gramos");

	}

}