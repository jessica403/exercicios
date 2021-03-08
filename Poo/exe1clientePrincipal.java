package Poo;

import java.util.Scanner;

public class exe1clientePrincipal {

		public static void main(String[] args) {
			
			System.out.println("SISTEMA DE CONTROLE DE CLIENTES \n");
			
			Scanner tec = new Scanner(System.in);
			
			exe1cliente cliente1 = new exe1cliente();
			int idade;
			
			System.out.print("Digite o nome do Cliente: ");
			cliente1.nomeCliente=tec.next().toUpperCase();
			
			System.out.print("Digite a Idade: ");
			idade = tec.nextInt();
			
			System.out.print("Sexo (M) para Masculino / (F) para Feminino:");
			cliente1.sexoCliente = tec.next().toUpperCase().charAt(0);
			
			System.out.print("Digite o serviço que o cliente realizou (1) Unhas / (2) Corte de Cabelo / (3) Depilação: ");
			cliente1.servico=tec.nextInt();
			
			
			
			System.out.printf("\n");
			cliente1.mostra();
			cliente1.mostrarAnoNascimento(idade);
			cliente1.mostrarServico();
			
			tec.close();
		}


}
