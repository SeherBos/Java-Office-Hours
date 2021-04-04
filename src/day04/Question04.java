package day04;

import java.util.ArrayList;
import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
	
		/*
		 * Bir array'de aranilan sayinin olup olmadigini
		 * kontrol eden bir method yazin
		 * 
		 */
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Aramak istediginiz sayiyi giriniz");
			int arananSayi = scan.nextInt();
			
			int arr[] = new int[10];
			
			
			for(int i = 0; i<arr.length; i++) {
				arr[i] = i+1;
			}
			
			System.out.println(sayiKontrol(arr, arananSayi));
			
			scan.close();
			
		}
		
		public static boolean sayiKontrol(int arr[], int sayi) {
			
			boolean flag = false;
			
			ArrayList<Integer> arrList = new ArrayList<>(); 
			
				for(int each:arr) {
					arrList.add(each);
				}
				
				if(arrList.contains(sayi)) {
					flag = true;
				}
				
			
			return flag;
		}
		
		

	}

