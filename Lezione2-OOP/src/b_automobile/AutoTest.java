package b_automobile;

public class AutoTest {
	public static void main(String[] args) {
	
		Automobile berlina = new Automobile("blu", "Fiat", "Tipo", 1200);
		
		//Voglio ricavare le info di quest'auto, quindi devo utilizzare i miei metodi getters
		System.out.println(berlina.getMarca() + " " + berlina.getModello() + " - colore " + berlina.getColore() + " - Stato accensione: " + berlina.isAccesa());
		
		System.out.println("Consegna avvenuta al Cliente");
		
		berlina.accendiSpegni();
		
		System.out.println("Stato accensione: " + berlina.isAccesa());
		
		System.out.println( berlina.controllaVelocita() );
		
		System.out.println( berlina.cambiaMarcia(2) ) ;
		
		berlina.accendiSpegni();
		
		System.out.println("Stato accensione: " + berlina.isAccesa());
		
		System.out.println(berlina.controllaVelocita());
		
		
		berlina.accendiSpegni();
		
		System.out.println("Stato accensione " + berlina.isAccesa());
		
		System.out.println(berlina.controllaVelocita());
		
		System.out.println(berlina.cambiaMarcia(5));
		
		berlina.accendiSpegni();
		System.out.println(berlina.controllaVelocita());
		
		
		
		
	}
}
