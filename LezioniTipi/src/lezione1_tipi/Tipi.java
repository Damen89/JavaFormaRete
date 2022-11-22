package lezione1_tipi;

public class Tipi {
	
	public static void main(String[] args) {
		
	//tipi interi
	byte anni = 33;
	short kmViaggio = 553;
	int fatturatoAzienda = 450000;
	long etaTerra = 4000000000L;
	
	//Stampo le mie variabili
	System.out.println("Miei anni: " + anni);
	System.out.println("Ho percorso: " + kmViaggio + " km");
	System.out.println("L'azienda quest'anno ha fatturato: " + fatturatoAzienda + " €");
	System.out.println("L'età della terra è di " + etaTerra + " anni");
		
	//tipi reali, con virgola
	
	float litriBottiglia = 0.7f;
	double litriBotte = 125.6;
	
	double litriTotali = litriBotte + litriBottiglia;
	
	System.out.println("Litri totali " + litriTotali);
	
	//System.out.println("Litri totali " + litriBotte + litriBottiglia);//ATT: tratta i due numeri come se fossero due stringhe
	
	///////Tipi char e boolean
	
	char genereA = 'a';
	char genereM = 'm';
	char genereF = 'f';
	
	char C = 'c';
	char I = 'i';
	char A = 'a';
	char O = 'o';
	
	System.out.println(C+I+A+O); //somma il codice ascii dei singoli caratteri
	
	////Boolean definisce una variabile 
	boolean acceso = true;
	
	boolean presente = true;
	
	System.out.println("Il candidato è presente ? " + presente);
	
		//condizioni
		if(presente) {
			System.out.println("Lo studente è presente");
		}else {
			System.out.println("Lo studente è assente");
		}
		
	}
}
