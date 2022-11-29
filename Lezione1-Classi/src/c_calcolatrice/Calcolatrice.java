package c_calcolatrice;

public class Calcolatrice {
 
	//il metodo static appartiene alla classe, non all'istanza della classe, cioè non all'oggetto concreto.
	//Nella calcolatrice demo NON avrò una new Calcolatrice
	//Questa calcolatrice sarà uno strumento, non un vero oggetto 
	
	public static double somma(double a, double b) {
		return a + b;
	}
	
	public static double sottrai (double a, double b) {
		return a - b;
	}
	
	public static double moltiplica (double a, double b) {
		return a * b;
	}
	
	public static double dividi (double a, double b) {
		return a / b;
	}
}
