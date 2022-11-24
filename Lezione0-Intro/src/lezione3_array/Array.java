package lezione3_array;

import java.io.Console;
import java.util.Iterator;

public class Array {
	public static void main(String[] args) {
		
		//definisco un array di note musicali
		
		String[] noteMusicali = new String[7];
		
		//assegno, per ogni indice, un valore
		
		noteMusicali[0] = "Do";
		noteMusicali[1] = "Re";
		noteMusicali[2] = "Mi";
		noteMusicali[3] = "Fa";
		noteMusicali[4] = "Sol";
		noteMusicali[5] = "La";
		noteMusicali[6] = "Si";
		
		int lunghezzaArr = noteMusicali.length;
		
		System.out.println("L'array contiente " + lunghezzaArr + " elementi");
		System.out.println(noteMusicali); //stampa il puntatore
		
		//stampo il contenuto dell'array: leggere un array
		//Utilizzo un ciclo For
		
		for(int i = 0; i < lunghezzaArr; i++) {
			
			String mioNome = "Dario"; //variabile locale
			System.out.println(noteMusicali[i]);
			System.out.println(mioNome);
		}
		
		String mioNome = "Paola"; //variabile globale
		
		System.out.println(mioNome);
		
		
		//dichiaro un altro array e lo leggo con un for
		String[] giorni = {"Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato", "Domenica"};
		
		for(int i = 0; i < giorni.length; i++) {
			
			if(giorni[i] == "Venerdì" || giorni[i] == "Sabato") {
				System.out.println(giorni[i] + " Festa");
			}else if( giorni[i] == "Domenica"){
				System.out.println(giorni[i] + " Relax");
			}else {
				System.out.println(giorni[i] + " Lavoro / Studio");
			}
		}
		
		
		
		
	}
}
