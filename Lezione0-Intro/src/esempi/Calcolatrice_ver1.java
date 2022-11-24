package esempi;

public class Calcolatrice_ver1 {
	public static void main(String[] args) {
		
		int primoNum = 45;
		int secondoNum = 27;
		
		//stampo le varie operazioni
		int somma = primoNum + secondoNum;
		System.out.println("Il risultato della somma: " + somma);
		
		int differenza = primoNum - secondoNum;
		System.out.println("Il risultato della sottrazione: " + differenza);
		
		int prodotto = primoNum * secondoNum;
		System.out.println("Il risultato del prodotto: " + prodotto);
		
		double quoziente = (double) primoNum/secondoNum;
		System.out.println("Il risultato della divisione: " + quoziente);
		double quozRound = Math.round(quoziente);
		System.out.println("Il risultato della divisione arrotondato vale: " + quozRound);
		
		double restoDiv = (double) primoNum % secondoNum;
		System.out.println("Il resto della divisione: " + restoDiv);
		
		
		double mioNum = -654;
		System.out.println(Math.abs(mioNum));
		
		int mioNum2 = 64;
		System.out.println(Math.sqrt(mioNum2));
		
		
	}
}
