package day02;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {

		/*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede ‘e’ harfi 3 kere kullanilmis.
         */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir cumle giriniz");
		String cumle = scan.nextLine().toLowerCase();
		System.out.println("Bir harf giriniz");
		char harf = scan.next().toLowerCase().charAt(0);
		
		int count=0;
		
		for (int i = 0; i <cumle.length(); i++) { // i<cumle.length(); diye de yazilabilir
			
			if (cumle.charAt(i) == harf) {
				count++;
				
			} 

		
		}	System.out.print("Cumlenizde " + "'"+ harf +"'"+ " harfi "+ count + " defa kullanilmistir.");		

		
		scan.close();
		
	}

}
