package lezione1_tipi;

public class PrimaStringa {
	
	public static void main(String[] args) {
		
		//JAVA è fortemente tipizzato: ho l'obbligo di dichiarare il tipo di dato
		
		//dichiaro la mia variabile
		String nome;
		
		//assegno un valore alla variabile nome
		nome = "Dario";
		
		//istanzio la variabile cognome
		String cognome = "Mennillo";
		
		String eta = "33";
		//riassegno un valore alla mia variabile

		//per commentare più righe in un colpo solo ctrl + shift + 7
//		eta = "34";
//		eta = "35";
//		eta = "36";
		
		//commento riga singola
		
		/**
		 * commento multiriga
		 * @author Dario
		 * @input nome, cognome, eta
		 */
		
		System.out.println("Il mio nome è: " + nome + " " + cognome + "\nLa mia età: " + eta);
		
		
	}
			

}
