package b_automobile;

public class Automobile {

	private String colore;
	private String marca;
	private String modello;
	private int peso;
	private boolean accesa;
	private int marcia;
	

	public Automobile(String colore, String marca, String modello, int peso) {
		super();
		this.colore = colore;
		this.marca = marca;
		this.modello = modello;
		this.peso = peso;
		this.accesa = false;
	}

	public Automobile(String marca, String modello, boolean accesa) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.accesa = accesa;
	}

	
	public String controllaVelocita() {
		String risposta = null;
		double velocita = 0;
		
		if(isAccesa()) {
			int marcia = getMarcia();
			velocita = marcia * 3.6;
			risposta =  ("Sono in marcia " + marcia + " alla velocità di " + velocita + " km/h");
		}else {
			setMarcia(0);
			velocita = marcia * 3.6;
			risposta = ("Sono in marcia " + marcia + " alla velocità di " + velocita + " km/h");
		}
		return risposta;
	}
	
	public String cambiaMarcia(int marcia) {
		System.out.println("Stai cambiando marcia, sei alla marcia " + marcia);
//		this.marcia = marcia;
		//oppure
		setMarcia(marcia);
		return controllaVelocita();
	}
	
	
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

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

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public boolean isAccesa() {
		return accesa;
	}

	public void accendiSpegni() {
		accesa = !accesa;
	}
		
	public int getMarcia() {
		return marcia;
	}
	
	public void setMarcia(int marcia) {
		this.marcia = marcia;
	}
	
}
