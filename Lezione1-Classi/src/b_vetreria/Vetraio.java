package b_vetreria;

public class Vetraio {
	//qUESTA CLASSE è LA PARTE ESECUTIVA
	public static void main(String[] args) {
		
		VetroFinestra vetro = new VetroFinestra(25.9, 13.6);
		
		
		double areaVetro = vetro.calcolaArea();
		double perimetro = vetro.calcolaPerimetro();
		double prezzo = vetro.calcolaPrezzoAlmetroQuadro();
		
		System.out.println("L'area del vetro è " + Math.round(areaVetro) + " metri quadrati");
		System.out.println("Il perimetro è " + Math.round( perimetro )+ " metri");
		System.out.println("Prezzo: " + Math.round( prezzo )+ " €");
		
		
	}
}
