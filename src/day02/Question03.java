package day02;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int input = scan.nextInt();
		faktoriyel(input);
		
		scan.close();
		
	}
	
	public static void faktoriyel(int sayi){
		int carpim = 1;
		for(int i = sayi; i>0; i--){
			carpim *= i;
		}
		
		System.out.print(sayi + "!=");
		while(sayi>0){
			if(sayi!=1){
				System.out.print(sayi + "*");
				
			}else{
				System.out.print(sayi);
			}
			sayi--;
		}
		
		System.out.println(" = " + carpim);
		
	}


}
