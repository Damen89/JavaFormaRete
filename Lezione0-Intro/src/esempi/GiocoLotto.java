package esempi;

import java.util.ArrayList;
import java.util.Scanner;

public class GiocoLotto {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numeriEstratti = new ArrayList<Integer>();
		
		int numeroGiri = 0;
		
		do {
		
			Scanner input = new Scanner(System.in);
			System.out.println("Caro utente, quanti numeri vuoi estrarre ?");
			
			int numeriDaEstrarre = input.nextInt();
			
			if(numeriDaEstrarre > 90) {
				System.out.println("Caro utente, non puoi estrarre più di 90 numeri");
			}else if(numeriDaEstrarre < 0) {
				System.out.println("Caro utente, non puoi estrarre una quantità negativa");
			}else {
				
			
			for(int i = 0; i < numeriDaEstrarre; i++) {
				
				//Math.random() genera un numero casuale tra 0.0 e 1.0
				//Math.ceil() arrotonda all'intero superiore
				//Math.floor() arrotonda all'intero inferiore
				
	//			double numero = Math.random() * 20;
	//			int arrotondato = (int) Math.ceil(numero);
	//			System.out.println("Numero Originale: " + numero + " - Numero arrotondato: " + arrotondato);
				
				numeroGiri++;
				
				int numero = (int) Math.ceil(Math.random() * 90 );
	//			System.out.println(numero);
				
				if(numeriEstratti.indexOf(numero) == -1) { //non c'è e quindi lo posso aggiungere
					numeriEstratti.add(numero);				
				}else {
					int numeroDoppione = numero;
					System.out.println("Doppione estratto: " + numeroDoppione);
					i--;
				}
			}
				
			System.out.println(numeriEstratti);
			System.out.println("Per estrarre " + numeriEstratti.size()+ " numeri sono stati eseguiti: " + numeroGiri + " giri");
			}
		
		}while(numeriEstratti.size() == 0);
			
	}
	
}
