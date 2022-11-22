package lezione2_statement;

public class OperatoreConfrontoIF {
	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 4;
		
		boolean confronto1 = (num1 == num2);
		System.out.println(confronto1);
		
		boolean confronto2 = (num1 > num2);
		System.out.println(confronto2);
		
		boolean confronto3 = (num1 < num2);
		System.out.println(confronto3);
		
		if(confronto2) {
			//questo viene eseguito se confronto2 è TRUE
			System.out.println(num1 + " è il num maggiore");
		}else {
			System.out.println(num2 + " è il num maggiore");
		}
		
		//oppure posso farlo direttamente
		if(num1 > num2) {
			//questo viene eseguito se confronto2 è TRUE
			System.out.println(num1 + " è il num maggiore");
		}else {
			System.out.println(num2 + " è il num maggiore");
		}
		
		////////////confronto di tipo logico///////////
		
		int punteggio = 9;
		int skill = 51;
		
		//per superare il livello skill e punteggio devono essere sopra una certa soglia
		//punteggio >= 60
		//skill > 50
		
//		boolean valutazione = (punteggio >= 60) && (skill > 50);
//		
//		if(valutazione) {
//			System.out.println("Bravo giocatore, hai superato il livello");
//		}else {
//			System.out.println("Giocatore, mi sa che c'è qualcosa che non va");
//		}
//		
		
//		///cambio le regole del gioco, basta che solo una delle due sia sopra la soglia per superare il livello
//		
//		System.out.println("Cambiamo le regole del gioco");
//		
//		if(punteggio >=60 || skill > 50) {
//			System.out.println("Bravo, hai superato il livello");
//			
//		}else {
//			System.out.println("Caro giocatore, cambia gioco!!");
//		}
		
		
		//miglioriamo la UX perché diciamo al giocatore cos'è che non va
		if(punteggio < 60 && skill < 50) {
			
			System.out.println("Caro giocatore mi sa che hai sotto tutto");
			
		}else if(punteggio >= 60 && skill < 50) {
			
			System.out.println("Caro giocatore, devi migliorare le tue skill");
			
		}else if(punteggio < 60 && skill >50) {
			
			System.out.println("Caro giocatore, devi migliorare il tuo punteggio");
			
		}else {
			
			System.out.println("Bravo giocatore, hai vinto !!");
		}
		
		
		
	}
}
