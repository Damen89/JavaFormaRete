package libreria;

public class Libro {
	
	public  String titolo;
	public String autore;
	public int numPagine;
	public double prezzo;
	public boolean disponibilita;
	
	
	
	public Libro(String titolo, String autore, int numPagine, double prezzo, boolean disponibilita) {
		this.titolo = titolo;
		this.autore = autore;
		this.numPagine = numPagine;
		this.prezzo = prezzo;
		this.disponibilita = disponibilita;
	}
	
	public Libro() {
		super();
	}

	public String stampaScheda() {
		String scheda = titolo + " - " + autore + " - €" + prezzo;
		return scheda;
	}
	
	public void cambiaDisponibilita() {
		disponibilita = !disponibilita;
	}

	
	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", numPagine=" + numPagine + ", prezzo=" + prezzo
				+ ", disponibilita=" + disponibilita + "]";
	}
	
	
	
}
