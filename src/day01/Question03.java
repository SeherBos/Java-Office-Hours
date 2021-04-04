package day01;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan kilosunu ve boyunu alip
	Vucut kitle indeksini hesaplayan bir program yaziniz.
	Ipucu : Vucut 
	Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
	ORNEK:
	INPUT      : Kilo: 71
	                  Boy: 1,72
	OUTPUT  : Vucut Kitle Indeksiniz : 23
		 */
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen kilonuzu kg cinsinden ve sonra boyunuzu cm cinsinden yaziniz.");
		double kilo = scan.nextDouble();
		double boy=scan.nextDouble();
		boy = boy/100; // boy/=100; de olur 
		double vki = kilo/(boy*boy);
		
				
		System.out.println(vki);
		
		
		scan.close();
		
	}

}
