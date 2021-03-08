package Poo;

import java.util.Scanner;

public class testaFuncionario {
public static void main(String[] args) {
		
		System.out.println("SISTEMA DE CONTROLE DE FUNCIONÁRIOS  \n");
		
		Scanner tec = new Scanner(System.in);
		
		funcionario funcionario1 = new funcionario(); // instanciei o aluno
		int idade;
		
		System.out.print("Digite o nome do Funcionario: ");
		funcionario1.nomeFuncionario=tec.next().toUpperCase();
		
		System.out.print("Digite a Idade: ");
		idade = tec.nextInt();
		
		System.out.print("Sexo (M) para Masculino / (F) para Feminino:");
		funcionario1.sexoFuncionario = tec.next().toUpperCase().charAt(0);
		
		System.out.print("Digite o cargo --> (1) DEV Jr. / (2) Faxineiro(a) / (3) Advogado(a): ");
		funcionario1.servico=tec.nextInt();
		
		
		
		System.out.printf("\n");
		funcionario1.mostra();
		funcionario1.mostrarAnoNascimento(idade);
		funcionario1.mostrarServico();
		
		tec.close();
	}

}
