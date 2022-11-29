package bloccoNote;

import java.util.Date;

public class Nota {
	
	String descrizione;
	Date data = new Date();
	
	//nel main voglio utilizzare il costruttore di default per cui non lo dichiaro
	
	public String stampa() {
		
		String notaCompleta = data.toString() + " - " + descrizione;
		
		return notaCompleta;
	}

}
