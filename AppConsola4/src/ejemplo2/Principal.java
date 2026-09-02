package ejemplo2;

public class Principal {

	public static void main(String[] args) {
		
		Barcelona b = new Barcelona();
		b.setFechaClub("01/01/89");
		
		Messi messi = new Messi();
		messi.setEquipo(b);
		messi.setNacionalidad("Argentina");
		
		System.out.println(messi.toString());
		
		Juventus j = new Juventus();
		j.setCantJugadores(35);
		
		messi.setEquipo(j);
		
		System.out.println(messi.toString());
	}

}
