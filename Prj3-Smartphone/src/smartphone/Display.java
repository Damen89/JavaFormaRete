package smartphone;

public class Display {
	
	private String marca;
	private String modello;
	private String risoluzione;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getRisoluzione() {
		return risoluzione;
	}
	public void setRisoluzione(String risoluzione) {
		this.risoluzione = risoluzione;
	}
	
	@Override
	public String toString() {
		return "Display [marca=" + marca + ", modello=" + modello + ", risoluzione=" + risoluzione + "]";
	}
	
	
}
