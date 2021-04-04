package day04;

public class Question02 {

	public static void main(String[] args) {
		/*
	     * bir array'deki sayilarin ortalamasini bulan java kodunu yaziniz
	     *
	     * input[]= {1,2,3,4,5,6,7}
	     * Output : 4
	     */
		
			int	input[]= {1,2,3,4,5,6,7,23};
		
		
			System.out.println(ortalamaBul (input));
	}

	public static double ortalamaBul (int input []) {
			
			double toplam = 0;
			double ortalama= 0 ;
			
			for (int each : input) {
				
				toplam+=each;
			
			}
			ortalama= toplam/input.length;
			
			return ortalama;
		
	}
	
}
