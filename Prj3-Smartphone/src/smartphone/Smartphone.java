package smartphone;

public class Smartphone {
	
	private String marca;
	private String modello;
	private String imei;
	private String numSeriale;
	
	private Display schermo;  //la classe Display è un tipo di dato complesso
	
	
//  IL METODO DI DEFAULT, SE NON SPECIFICATO, VERRà COMUNQUE INSERITO DI DEFAULT
//	public Smartphone() {
//		super();
//	}

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

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getNumSeriale() {
		return numSeriale;
	}

	public void setNumSeriale(String numSeriale) {
		this.numSeriale = numSeriale;
	}

	public Display getSchermo() {
		return schermo;
	}

	public void setSchermo(Display schermo) {
		this.schermo = schermo;
	}

	@Override
	public String toString() {
		return "Smartphone [marca=" + marca + ", modello=" + modello + ", imei=" + imei + ", numSeriale=" + numSeriale
				+ ", schermo=" + schermo.toString() + "]";
	}
	
	
	

}
