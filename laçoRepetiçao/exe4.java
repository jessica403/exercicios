package la�oRepeti�ao;

import java.util.Scanner;

public class exe4 {
		
		public static void main(String[] args) {
			
			/*
			 * 4-	Uma empresa desenvolveu uma pesquisa para saber as
			 * caracter�sticas psicol�gicas dos indiv�duos de uma regi�o.
			 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo
			 * (1-feminino / 2-masculino), e as op��es (1, se a pessoa era calma;
			 * 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
			 *  Pede-se para elaborar um sistema que permita ler os dados de
			 *  150 pessoas, calcule e mostre: (WHILE)
	�	o n�mero de pessoas calmas; // todos os calmos
	�	o n�mero de mulheres nervosas;  // s� as mulheres
	�	o n�mero de homens agressivos; // homens
	�	o n�mero de pessoas nervosas com mais de 40 anos; // pessoas - geral - idade - nervosa
	�	o n�mero de pessoas calmas com menos de 18 anos. // todos - < 18 - calmos
			  */
		 //declara��o de variaveis	
			Scanner sc = new Scanner(System.in);
			int idade, sexo, temperamento;
			int individuos = 0, mulherNervosa = 0, calma = 0, homemAgressivo = 0, pessoaCalma = 0, pessoaNervosa = 0;
			final int LIMITE = 5;
			
			//teste com 3 pessoas
			while (individuos < LIMITE) {
				System.out.println("digite a idade:");
				idade = sc.nextInt();
				System.out.println("\nSexo: 1 - Masculino--2-Feminino :");
				sexo = sc.nextInt();
				
				System.out.println("\nTemperamento da pessoa:  1 - Calmo  2 - Nervoso  3 - Agressivo");
				temperamento = sc.nextInt();
				if(temperamento == 1) {
					calma++;
					if (idade<18) {
						pessoaCalma++;
					}
				}
				else if(sexo ==1 && temperamento == 3) {
					homemAgressivo++;
					
				}
				else if (idade > 40 && temperamento ==2) {
					pessoaNervosa++;
					if (sexo==2) {
						mulherNervosa++;
					}
				}
				individuos++;
				
			}
			System.out.printf("\nTotal de pessoas pesquisadas: %d", individuos);
			System.out.printf("\nNumero de pessoas calma: %d", calma);
			System.out.printf("\nMulheres nervosas: %d", mulherNervosa);
			System.out.printf("\nNumeros de homens agressivos: %d",  homemAgressivo);
			System.out.printf("\nNumero de pessoas nervorsas com mais de 40 anos: %d", pessoaNervosa);
			System.out.printf("\nNumero de pessoas calmas menores de 18 anos: %d", pessoaCalma);
			
			sc.close();
		}
	}


