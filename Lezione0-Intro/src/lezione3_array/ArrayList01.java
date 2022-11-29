package lezione3_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayList01 {
	public static void main(String[] args) {
		
		//String[] parole = {"Ciao", "Come", "Stai"};
		
		ArrayList<String> prodotti = new ArrayList<>();
		prodotti.add("scarpe");
		prodotti.add("t-shirt");
		prodotti.add("camicie");
		
		//size() al posto di length
		int lunghezza = prodotti.size();
		
		//get() per prendere un elemento
		String elemento0 = prodotti.get(0);
		
		//remove() per rimuovere un elemento
		prodotti.remove(2);
		
		prodotti.add("giacche");
		
		//stampo
//		for(int i = 0; i < prodotti.size(); i++) {
//			System.out.println(prodotti.get(i));
//		}
		
		//quando si tratta di array esiste anche il foreach
		for(String elemento: prodotti) {
			System.out.println(elemento);
		}
		
		
		ArrayList<String> classe = new ArrayList<>();
		
		classe.add("Marco");
		classe.add("Gennaro");
		classe.add("Anna");
		classe.add("Laura");
		
	
		
		for(String studente: classe) {
			System.out.println(studente);
		}
		
		
		//Integer è la classe wrapper di int, cioè la classe che mi permette di trattare l'intero come un oggetto e non come un tipo primitivo
		ArrayList<Integer> voti = new ArrayList<>();
		voti.add(25);
		voti.add(30);
		voti.add(30);
		voti.add(27);
		
		//stampo il nome dello studente con il voto accanto
		for(int i = 0; i < voti.size(); i++) {
			System.out.println("Nome Studente: " + classe.get(i) + " - voto: " + voti.get(i));
		}
		
		
		
	}
}
