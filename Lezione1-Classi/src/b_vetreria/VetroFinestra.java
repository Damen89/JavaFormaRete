package b_vetreria;

public class VetroFinestra {
	//QUESTA CLASSE è LA PARTE STRUTTURALE DEL PROGRAMMA
	
	public double altezza;
	public double base;
	
	
	public VetroFinestra(double altezza, double base) {
		super();
		this.altezza = altezza;
		this.base = base;
	}
	
	public double calcolaArea() {
		double area = this.base * this.altezza;
		return area;
	}
	
	
	public double calcolaPerimetro() {
		 double perimetro = (this.base + this.altezza) * 2; 
		 return perimetro;
	}
	
	public double calcolaPrezzoAlmetroQuadro() {
		double prezzo = this.calcolaArea() * 1.20;
		return prezzo;
	}	
	
}
