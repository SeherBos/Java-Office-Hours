package day01;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {

		/* Kullanicidan bir karakter girmesini isteyip o kadarkterin ascii degerini yazdirin. 
		 * 
		 * input : #
		 * output : girdiginiz # karakterinin ascii degeri  = 125 dir
		 * 
		 * */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Bir karakter giriniz.");
		
		char karakter=  scan.next().charAt(0);
		
				
		int karakterAscii = (int) karakter;
		
		System.out.println("Girdiginiz " + karakter +  " karakterinin ASCII degeri : "+ karakterAscii );

		
		System.out.println( karakter + 0); // bu cozumu 23 ve 25.satirlari yazmadan da cozebiliriz.
		
		
		scan.close();
		
		
		
	}

}
