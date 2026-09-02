package ejemplo2;

public class Juventus implements IEquipo {
	private int cantJugadores;
	
	public Juventus() {
		
	}

	@Override
	public String devuelveInformacion() {
		return "Equipo Juventus...";
	}
	
	public int getCantJugadores() {
		return cantJugadores;
	}

	public void setCantJugadores(int cantJugadores) {
		this.cantJugadores = cantJugadores;
	}

	@Override
	public String toString() {
		return "Juventus [cantJugadores=" + cantJugadores + "]";
	}
	
	
}