package bloccoNote;

import java.util.Scanner;

public class Gestore {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String risposta = null;
		boolean gira = true;	
		
		String descrizione = null;
		int posizione = 0;
		
		BloccoNote bn = new BloccoNote();
		
		while(gira) {
			
			System.out.println("Seleziona una risposta: ");
			System.out.println("( a ) Aggiungi Nota");
			System.out.println("( b ) Stampa blocco note");
			System.out.println("( x ) Esci");
			
			risposta = sc.nextLine();
			
			switch(risposta) {
			case "a":
				
				System.out.println("Inserisci la descrizione della nota");
				descrizione = sc.nextLine();
				
				System.out.println("Inserisci la posizione della nota");
				posizione = sc.nextInt();

				sc.nextLine();
				//inserisco la nota nel blocco note
				bn.addNota(descrizione, posizione);

			break;
			
			case "b":
				bn.stampaElenco();
			break;
			
			case "x":
				gira = false;
			break;
			
			//default è il caso generico, contempla tutto ciò che non è  nei casi
			default: 
				System.out.println("Operazione non disponibile");
			break;
			}
		}
		
		System.out.println("Grazie per aver utilizzato il nostro software");
		
	}
}
