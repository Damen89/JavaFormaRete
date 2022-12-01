package smartphone;

public class Batteria {
	
	private String marca;
	private String capacita;
	private String percentualeCarica;
	
	public void caricaBatteria() {
		System.out.println("Batteria in carica");
	}
	
	
	
	
	public String getPercentualeCarica() {
		return percentualeCarica;
	}

	
	public void setPercentualeCarica(String percentualeCarica) {
		this.percentualeCarica = percentualeCarica;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCapacita() {
		return capacita;
	}
	public void setCapacita(String capacita) {
		this.capacita = capacita;
	}
	
	

}
