package a_Incapsulamento;

public class Persona {

	private int id;
	private String nome;
	private String cognome;
	private String codFis;
	private int eta;
	private String email;
	
	//costruttore con tutte le prop
	public Persona(int id, String nome, String cognome, String codFis, int eta, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.codFis = codFis;
		this.eta = eta;
		this.email = email;
	}
	
	
	//costruttore con prop parziali
	public Persona(String nome, String cognome, String email) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}

	
	//costruttore di default
	public Persona() {
		super();
	}


	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", email=" + email + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getCodFis() {
		return codFis;
	}


	public void setCodFis(String codFis) {
		this.codFis = codFis;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//Genero i Setter & Getters
	
	
	
	
	
}
