
public class Persona {
		
	String nome;
	String cognome;
	int eta;
	
	//metodo costruttore
	public Persona(String nome, String cognome, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}



	public static void main(String[] args) {
		
		Persona personaTest = new Persona("Dario", "Mennillo", 33);
		
		System.out.println(personaTest.toString());
		System.out.println("Ciao " + personaTest.nome + " "  + personaTest.cognome +  "Quest'anno hai " + personaTest.eta +  "anni");
	}
	
	
}
