package esempi;

import java.util.Scanner;

public class IndovinaNumero {
	public static void main(String[] args) {
		//L'utente deve indovinare un numero tra 0 e 100. Chiedi all'utente di digitare il numero, dopoché controlla. Se giusto stampa "Bravo, hai vinto". Se sbagliato stampa "troppo alto" oppure "troppo basso"
		
		
			int numeroDaIndovinare = (int)(Math.random() * 100) + 1;		
			
			System.out.println("Inserisci un numero");
			
			Scanner scanner = new Scanner(System.in);
			
			var numeroUtente = scanner.nextInt(); 
			
			if(numeroUtente == numeroDaIndovinare) {
				System.out.println("Bravo, hai beccato il numero");
			}else if(numeroUtente < numeroDaIndovinare){
				System.out.println("Il tuo numero è minore");
			}else {
				System.out.println("Il tuo numero è maggiore");
			}
	
			
			System.out.println("Numero estratto: " + numeroDaIndovinare);
			System.out.println("Il tuo numero: " + numeroUtente);
		
	}
}
