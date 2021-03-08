package laçoRepetiçao;

import java.util.Scanner;

public class exe3 {
	/* * Solicitar a idade de várias pessoas e imprimir:Total 
	 * de pessoas com menos de 21 anos. Total de pessoas com mais
	 *  de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
		
		public static void main(String[] args) {
			
			Scanner tec = new Scanner(System.in);
			
			int idade=0, menor21=0 , maior50=0;
			
			System.out.print("Digite sua idade: ");
			idade = tec.nextInt();
			
			while (idade != -99) {
				
				if (idade <=21) {
					
					menor21=menor21+1;
				}
				
				if (idade>50) {
					maior50=maior50+1;
				}
				idade = tec.nextInt();
			}
			 System.out.printf("\nA quantidade de pessoas com menos que 21 anos é de: %d", menor21);
			 System.out.printf("\nA quantidade de pessoas com mais que 51 anos é de: %d", maior50);
		}

}
