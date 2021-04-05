package day06;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		/*
	 	Kullanicidan yasini alin ve eger kullanici yasini 0 veya daha az bir yas girerse
	 kullaniciya musade etmeyin(Exception throw edin)
		 */
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        
        if(age<=0) {
			try {
				throw new IllegalArgumentException();
			}catch (Exception e) {
				System.out.println("Yasiniz 0'dan kucuk olamaz");
			}
			
		}
      
        
	}
}
