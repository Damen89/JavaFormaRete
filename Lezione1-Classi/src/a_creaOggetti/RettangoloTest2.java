package a_creaOggetti;

public class RettangoloTest2 {
	
	double base;
	double altezza;
	
	
	//il metodo costruttore lo utilizzo per inizializzare le proprietà, gli attributi 
	//1. deve avere lo stesso identico nome della classe
	//2.this fa riferimento al parametro della classe
	//3.posso creare i metodi costruttori con Alt+shift+S -> Generate constructor using fields
	
	public RettangoloTest2(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}


	//Costruttore di Default da dichiarare obbligatoriamente se lo si vuole utilizzare in presenza di un costruttore con parametri
//	public RettangoloTest2() {
//		super();
//	}
//	
	
	//creo dei metodi per calcolare area e perimetro
	//modificatore tipoDiRitorno nomeDelMetodo()
	public double calcolaArea() {
		double area = this.base * this.altezza;
		return area;
	}
	
	public double calcolaPerimetro() {
		double perimetro = (this.altezza + this.base) * 2;
		return perimetro;
	}
	
	
	public static void main(String[] args) {
		
		//richiamo il costruttore
		RettangoloTest2 mioRettangolo = new RettangoloTest2(3.5, 4.2);
		
		//richiamo il metodo per calcolare l'area
		double area = mioRettangolo.calcolaArea();
		System.out.println("L'area vale " + area);
		
		double perimetro = mioRettangolo.calcolaPerimetro();
		System.out.println("Il perimetro vale " + perimetro);
		
	}
	
}
