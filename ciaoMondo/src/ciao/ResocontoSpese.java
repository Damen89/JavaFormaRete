package ciao;

public class ResocontoSpese {

	public static void main(String[] args) {
		
		String nome = "Dario";
		String cognome = "Mennillo";
		
		int speseGenerali = 1500;
		double speseAuto = 284.39;
		int speseViaggi = 2200;
		
		
		double somma = speseGenerali + speseAuto + speseViaggi;
		
		double media = somma/3;
		
		System.out.println("Nome: " + nome + "\nCognome: " + cognome);

		System.out.println("-----------------------------");
		System.out.println("Spese generali: " + speseGenerali);
		System.out.println("Spese Auto: " + speseAuto);
		System.out.println("Spese Viaggi " + speseViaggi);

		System.out.println("-----------------------------");

		System.out.println("Il totale " + somma);
		System.out.println("Media: " + media);
		
		
		
		//calcola il totale delle spese, calcola la media delle singole spese. Stampa le due informazioni a terminale. All'inizio del codice inserisci le info utente , cioè nome e cognome
		
		
		
	}
	
	
}
