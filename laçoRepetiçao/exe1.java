package laçoRepetiçao;

import java.util.Scanner;

public class exe1 {
	/*Informar todos os números de 1000 a 1999 que 
	 *quando divididos por 11 obtemos resto = 5. (FOR)*/



		public static void main(String[] args) {
			
			Scanner tec = new Scanner(System.in);
			
			int x;
			
			for (x = 1000 ; x <= 1999 ; x++ ) {			
							
				if ( x % 11 == 5 ) {
					System.out.printf("\n%d",x);
				}
			}
			
			
		}


}
