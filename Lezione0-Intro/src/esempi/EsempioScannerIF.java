package esempi;

import java.util.Scanner;

public class EsempioScannerIF {
 public static void main(String[] args) {
	
	 //Lo scanner permette di intercettare l'input utente
	 
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Inserisci lo username");
	 String username = scanner.next(); //next() prende la riga che scrive l'utente e la salva in una variabile
	
	 System.out.println("Inserisci la password");
	 String password = scanner.next();
	 
	 
	 //System.out.println("Ciao " + username +  "\nLa tua password è : " + password);
	 
	 if(username.equals("Chicco84") && password.equals("LoveXx")) {
		 System.out.println("Benvenuto " + username + ", ci mancava un tamarro come te");
	 }
	 else {
		 System.out.println("Mi dispiace, non ti conosco !!");
	 }
	 	 
}
}
