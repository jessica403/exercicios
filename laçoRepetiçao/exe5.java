package la�oRepeti�ao;

import java.util.Scanner;

public class exe5 {
	/*Crie um programa que leia um n�mero do teclado at� que encontre um
	 *  n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/

		
		public static void main(String[] args) {
			
			Scanner tec = new Scanner(System.in);
			
			int numero, soma = 0;
							
			do 	
			{
				System.out.print("Digite um numero do teclado: ");
				numero = tec.nextInt();
				soma=soma+numero;
				
			}while (numero !=0);
				
			tec.close();
			System.out.printf("\nA soma dos n�meros digitados �: %d",soma);
		}
}
