package principal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Factura {
	private String fecha;
	private int nroCmp;
	private double importe;
	
	public Factura() {
		
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getNroCmp() {
		return nroCmp;
	}

	public void setNroCmp(int nroCmp) {
		this.nroCmp = nroCmp;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "Factura [fecha=" + fecha + ", nroCmp=" + nroCmp + ", importe=" + importe + "]";
	}
	
	
}
