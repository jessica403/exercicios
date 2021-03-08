package laçoRepetiçao;

import java.util.Scanner;

public class exe6 {
	/*Escrever um programa que receba vários números inteiros no teclado.
	 * E no final imprimir a média dos números múltiplos de 3. 
	 * Para sair digitar 0(zero).(DO...WHILE)*/

		public static void main(String[] args) {
			
			Scanner tec = new Scanner(System.in);
			
			int numeros, soma=0, cont=0;
			double media = 0;
			
			do {
				System.out.print("Digite um número: ");
				numeros = tec.nextInt();
				
				if (numeros != 0 && numeros % 3 == 0){
					soma=soma+numeros;
					cont++;				
				}			
				
			} while (numeros!=0);
			
			media=soma/cont;
			System.out.printf("\n A media dos números multiplos de 3 é: %.2f ",media);
			tec.close();
		}


}
