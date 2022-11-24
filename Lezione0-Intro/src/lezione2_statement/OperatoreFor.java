package lezione2_statement;

public class OperatoreFor {
	
	public static void main(String[] args) {
		
		String[] giorni = {"Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato", "Domenica"};
		
//		for(int i = 0; i < giorni.length; i++) {
//			
//			if(giorni[i] == "Venerdì" || giorni[i] == "Sabato") {
//				System.out.println(giorni[i] + " Festa");
//			}else if( giorni[i] == "Domenica"){
//				System.out.println(giorni[i] + " Relax");
//			}else {
//				System.out.println(giorni[i] + " Lavoro / Studio");
//			}
//		}
		
		
		for (int i = 0; i < giorni.length; i++) {
			
			if(i == 4 || i == 5) {
				System.out.println(giorni[i] + " Festa");
			}else if(i == 6) {
				System.out.println(giorni[i] + " Relax");
			}else {
				System.out.println(giorni[i] + " Lavoro / Studio");
			}
		}

		
// Scorriamo l'array al contrario 
		System.out.println("Leggo l'array al contrario");
		
		for(int i = giorni.length-1; i >=0 ; i--) {
			System.out.println(giorni[i]);
		}
		
		
	}

}
