package bloccoNote;

public class BloccoNote {

	//l'elenco è un array di oggetti di tipo Nota
	Nota[] elenco =  new Nota[10]; //elenco è una variabile di classe BloccoNote, una proprietà, un attributo
	
	//il metodo aggiungi nota inserisce una nuova nota nel mio elenco
	public void addNota(String descrizione, int posizione) {
		
		//creo una nuova nota, avendo solo il costruttore di default devo valorizzare descrizione
		Nota n = new Nota(); 
		n.descrizione = descrizione;
		
		//stabilisco la posizione
		elenco[posizione] = n;
	}
	
	public void stampaElenco() {
		for(int i = 0; i < elenco.length; i++) {
			if(elenco[i] != null) {
				System.out.println(elenco[i].stampa()); //questo NON è stampa() della riga 19 ma è stampa() della classe Nota perché elenco[i] è la nota
			}
		}
	}
	
}
