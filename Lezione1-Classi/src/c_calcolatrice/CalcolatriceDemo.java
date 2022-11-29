package c_calcolatrice;

import java.util.Scanner;

public class CalcolatriceDemo {

	public static void main(String[] args) {
	
	//il metodo somma è static, quindi appartiene direttamente alla classe
	System.out.println( Calcolatrice.somma(5, 9.2) );

	//questo sotto ha poco senso
//	Calcolatrice miaCalc = new Calcolatrice();
//	System.out.println( miaCalc.moltiplica(5, 8) );
	
	double num1 = chiediNumero();
	double num2 = chiediNumero();
	
	System.out.println("Addizione: " + Calcolatrice.somma(num1, num2));
	System.out.println("Sottrazione: " + Calcolatrice.sottrai(num1, num2));
	System.out.println("Moltiplicazione: " + Calcolatrice.moltiplica(num1, num2));
	System.out.println("Divisione: " + Calcolatrice.dividi(num1, num2));
	
	}
	
	
	public static double chiediNumero() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		double numero = sc.nextDouble();
		return numero;		
	}
	
}
