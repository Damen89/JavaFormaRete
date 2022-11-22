package esempi;

import java.util.Scanner;

public class IndovinaNumero {
	public static void main(String[] args) {
		//L'utente deve indovinare un numero tra 0 e 100. Chiedi all'utente di digitare il numero, dopoché controlla. Se giusto stampa "Bravo, hai vinto". Se sbagliato stampa "troppo alto" oppure "troppo basso"
		
		int numeroDaIndovinare = (int)(Math.random() * 100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		var numeroUtente = scanner.nextInt(); 
		
		
		
		System.out.println(numeroDaIndovinare);
		
	}
}
