package principal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Factura implements Comparable<Factura> {
	private int nroCmp;
	private String fecha;
	private double importe;
	private String file;
	
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
	public int hashCode() {
		return Objects.hash(fecha, importe, nroCmp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		return Objects.equals(fecha, other.fecha)
				&& Double.doubleToLongBits(importe) == Double.doubleToLongBits(other.importe) && nroCmp == other.nroCmp;
	}

	@Override
	public String toString() {
		return "Factura [fecha=" + fecha + ", nroCmp=" + nroCmp + ", importe=" + importe + "]";
	}

	@Override
	public int compareTo(Factura o) {
		if (o.nroCmp == this.nroCmp)
			return 0;
		
		if (this.nroCmp > o.nroCmp)
			return 1;
		
		return -1;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}
}
