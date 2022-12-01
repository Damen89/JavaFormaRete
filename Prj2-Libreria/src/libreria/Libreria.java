package libreria;

import java.util.ArrayList;

public class Libreria {

	public static void main(String[] args) {
		
//		//creo un po' di libri a caso
//		Libro libro1 = new Libro("Moby Dick", "Melville",600, 15.80, true);
//		
//		Libro libro2 = new Libro();
//		libro2.titolo = "Solaris";
//		libro2.autore = "Lem";
//		
//		System.out.println(libro1.stampaScheda());
//		System.out.println(libro2.stampaScheda());
//		
//		System.out.println(libro1.toString());
//		System.out.println(libro2.toString());
//		
		
		Libro[] scaffale = new Libro[5];
		
//		scaffale[1] = new Libro("La sanfelice", "Dumas", 2500, 20, true);
		
		String titoli[] = {
				"Moby Dick",
				"Solaris",
				"Sogni di robot",
				"Il signore degli anelli",
				"Harry Potter"
		};
		
		String autori[] =  {
				"Melville",
				"Lem",
				"Asimov",
				"Tolkien",
				"Rowling"
		};
		
		double prezzi[] = {
				12.50,
				5.20,
				5.00,
				11.75,
				67.30
		};
		
		//questo for associa i titoli e gli autori ai libri
		for(int i = 0; i < scaffale.length; i++) {
//			scaffale[i] = new Libro();
//			scaffale[i].titolo = titoli[i];
//			scaffale[i].autore = autori[i];
//			scaffale[i].prezzo = 5;
			
			scaffale[i] = new Libro(titoli[i], autori[i], 0, prezzi[i], true);
		}
	
		//questo for stampa le schedeLibro
		for(int i = 0; i < scaffale.length; i++) {
			if( scaffale[i] != null) {
				System.out.println(scaffale[i].stampaScheda());
			}
		}

	/////CREO UN NUOVO SCAFFALE FATTO CON GLI ARRAYLIST
		
		
		ArrayList<Libro> scaffale2 = new ArrayList<Libro>();
		
		scaffale2.add(new Libro("Il giovane Holden", "Kerouak", 200, 3.50, false));
		
		scaffale2.add(new Libro());
		scaffale2.get(1).titolo = "Il rosso e il nero";
		scaffale2.get(1).autore = "Stendhal";
		scaffale2.get(1).prezzo = 10.20;
		scaffale2.get(1).numPagine = 550;
		scaffale2.get(1).disponibilita = true;
		
		//cambio la disponibilità del primo libro per poterlo mostrare
		scaffale2.get(0).cambiaDisponibilita();
		
	
		for(int i = 0; i < scaffale2.size(); i++) {
			if(scaffale2.get(i).disponibilita != false ) {				
				System.out.println(scaffale2.get(i).stampaScheda());
			}
		}
	
	}

}
