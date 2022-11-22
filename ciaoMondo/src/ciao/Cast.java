package ciao;

public class Cast {

	public static void main(String[] args) {
	
		//cast da int a byte
		
		int i1 = 10, i2 = 135, i3 = 352; //OSS: posso definire tutto su una riga separando con le virgole
		
		byte b1, b2, b3;
		
		b1 = (byte) i1; //(byte) è il casting
		b2 = (byte) i2;
		b3 = (byte) i3;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3); //96 perché 352 non ci entra nel byte
		
		
		int valoreNum = 7600;
		
		short valoreShort = (short) valoreNum;
		
		System.out.println(valoreShort);
		
		//cast da double a int
		double valoreDB = 39.99;
		int valoreINT = (int) valoreDB;
		 
		System.out.println(valoreINT);
		
		
		int valoreInt2 = 45;
		double valoreDB2 = (double) valoreInt2;
		System.out.println(valoreDB2);
		
		
		//Calcolatrice SCEMA
		
	}
}
