package smartphone;

public class SmartphoneTest {

	public static void main(String[] args) {
		
		Smartphone smartphone = new Smartphone();
		Display schermo = new Display();
		
		//setto le prop dello smartphone
		smartphone.setMarca("Samsung");
		smartphone.setModello("S22");
		smartphone.setImei("a876aab78dfjf93kj");
		smartphone.setNumSeriale("AAA0101");
		
		
		//setto le prop dello schermo
		schermo.setMarca("Screen+");
		schermo.setModello("Lcd");
		schermo.setRisoluzione("1200 x 1480");
				
		//setto lo schermo allo smartphone
		smartphone.setSchermo(schermo);
		
		System.out.println(smartphone.toString());
				
	}
}
