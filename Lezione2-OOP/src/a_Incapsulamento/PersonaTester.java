package a_Incapsulamento;

import java.util.Scanner;

public class PersonaTester {

	public static void main(String[] args) {
		
		Persona utente = new Persona(1, "Dario", "Mennillo", "MNNDRA9786hdqekjh", 33, "dario.mennillo@mail.it");
		System.out.println( utente.getNome() + " " + utente.getCognome() + " " + utente.getEmail() );
		System.out.println(utente.toString());
		
		Persona studente = new Persona(); //posso chiamare il costruttore di default perché nelle classi, se non specificato nulla, esisterà sempre un cosrtuttore di default
		
		studente.setNome("Paolo");
		studente.setCognome("Rossi");
		studente.setEmail("paolo.rossi@mail.it");
		
		System.out.println(studente.toString());
		
		
		Persona docente = new Persona();
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci il nome del docente");
		String nomeDoc = sc.nextLine();
		System.out.println("inserisci il cognome del docente");
		String cognomeDoc = sc.nextLine();
		System.out.println("Inserisci la mail del docente");
		String emailDoc = sc.nextLine();
		
		
		docente.setNome(nomeDoc);
		docente.setCognome(cognomeDoc);
		docente.setEmail(emailDoc);
		
		System.out.println(docente.toString());
		
		
		Persona amministratore = new Persona("Anna", "Bianchi", "anna.bianchi@mail.it");
		
		System.out.println("Inserisci le informazioni per un impiegato");
		System.out.println("Nome: ");
		String nomeImp = sc.nextLine();
		System.out.println("Cognome: ");
		String cognomeImp = sc.nextLine();
		System.out.println("Email: ");
		String emailImp = sc.nextLine();
		
		Persona impiegato = new Persona(nomeImp, cognomeImp, emailImp);
		
		System.out.println("Hai appena creato la seguente utenza impiegato: " + impiegato.getNome() + " " + impiegato.getCognome() + " " + impiegato.getEmail());
		
//		System.out.print(impiegato.nome); Questo non posso farlo perché le mie prop sono tutte private
		
		
		
		
	}
	
}
