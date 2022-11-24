package lezione1_tipi;

public class Stringhe {
	public static void main(String[] args) {
	
		//String è un oggetto non è un tipo primitivo
		String nomeCorso = "Tecnico Sviluppo Software";
		
		//definisco una string allo stesso modo in cui definirò un oggetto
		String denominazione = new String("Corso di informatica avanzato");
		
		System.out.println(nomeCorso);
		System.out.println(denominazione);
		
		//charAt identifica il carattere nella posizione che gli passo tra parentesi
		char carattere2 = nomeCorso.charAt(2);
		System.out.println(carattere2); //tutte le stringhe sono 0-based, cioè la conta parte da 0
		
		char carattere0 = nomeCorso.charAt(0);
		System.out.println(carattere0);
		
		int lunghezzaStringa = nomeCorso.length();
		System.out.println(lunghezzaStringa);
		
		char ultimoCarattere = nomeCorso.charAt(lunghezzaStringa - 1);
		System.out.println(ultimoCarattere);
		
		
		boolean contieneParola = nomeCorso.contains("Software"); //true
		System.out.println(contieneParola);
		
		boolean contieneParola2 = nomeCorso.contains("Database"); //false
		System.out.println(contieneParola2);
		
		if(nomeCorso.contains("Database")) {
			System.out.println("Sono nell'aula giusta");
		}else {
			System.out.println("Mi sa che ho sbagliato classe");
		}
		
		//lastIndexOf() recupera l'indice dell'ultima occorrenza
		System.out.println(nomeCorso.lastIndexOf("e"));

		//indexOf() individua la prima occorrenza di un carattere
		System.out.println(nomeCorso.indexOf("e"));
		
		System.out.println(nomeCorso.indexOf("Software"));
		
		//quando richiedo l'indice di qualcosqa che non esiste risponde con -1 SEMPRE, anche negli array
		System.out.println(nomeCorso.indexOf("Database"));
		
		String s1 = "explorer è il miglior browser al mondo!!";
		
		String nuovaStringa = s1.replace("explorer", "Google Chrome");
		
		System.out.println(nuovaStringa);
		
		///equals
		String nome1 = "DARIO";
		String nome2 = "Dario";
		
		System.out.println(nome1 == nome2); //boolean
		System.out.println(nome1.equals(nome2));
		
		boolean controlloNomi = nome1.equalsIgnoreCase(nome2); //boolean
		
		System.out.println(controlloNomi);
		
		if(nome1.equalsIgnoreCase(nome2)) {
			System.out.println("I due nomi sono identici");
		}else {
			System.out.println("I due nomi non corrispondono");
		}
		 
		
		////////////////////////////
		
		String nomeUtente = "Chicco85";
		String password = "LoveXx";
		
		if(nomeUtente.equalsIgnoreCase("chicco84") && password.equals("LoveXx") ) {
			System.out.println("Benvenuto " + nomeUtente);
		}else {
			System.out.println("Mi dispiace non abbiamo il tuo nome nel Database");
		}
		
		
		///DOPO fare esempio vero
	}
}
