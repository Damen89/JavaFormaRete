package a_creaOggetti;

public class RettangoloTest1 {

	//definisco degli attibuti all'interno della classe
	double base;
	double altezza;
	
	
	public static void main(String[] args) {
		
		//nel metodo main costruisco l'oggetto Rettangolo
		//richiamando il metodo costruttore di default del mio rettangolo 
		
		RettangoloTest1 rettangolo = new RettangoloTest1(); //Creo una nuova istanza della classe Rettangolo, quindi a tutti gli effetti sto creando un nuovo oggetto
		
		//assegno un valore agli attributi
		rettangolo.altezza = 3.5;
		rettangolo.base = 8.2;
		
		double area = rettangolo.altezza * rettangolo.base;
		double perimetro = (rettangolo.altezza + rettangolo.base) * 2;
		
		System.out.println("L'area del rettangolo vale " + area);
		System.out.println("Il perimetro del rettangolo vale " + perimetro);
		
		
		RettangoloTest1 rettangolino = new RettangoloTest1();
		
		rettangolino.altezza = 0.4;
		rettangolino.base = 0.1;
		
		double areaRpiccolo = rettangolino.altezza * rettangolino.base;
		
		System.out.println("L'area del rettangolino è " + areaRpiccolo);
		
		
		
		
		
	}
	
	
}
