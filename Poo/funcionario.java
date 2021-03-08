package Poo;

public class funcionario {
		
		
		public String nomeFuncionario;
		public int idadeFuncionario;
		public char sexoFuncionario;
		public int servico;
		
	
		public void mostra()
		{
			if (sexoFuncionario == 'M')
			{
				System.out.printf("O nome do Funcionário é %s do sexo %s", nomeFuncionario, sexoFuncionario);
			}
			else if (sexoFuncionario =='F')
			{
				System.out.printf("O nome da Funcionária é %s do sexo %s", nomeFuncionario, sexoFuncionario);
			}		
		}
		
		public void mostrarAnoNascimento(int idadeFuncionario)	
		{	
			System.out.printf("\nO ano de nascimento de %s é : %d",nomeFuncionario, (2020-idadeFuncionario));
			
		}
		
		public void mostrarServico()
		{
			if (servico == 1)
			{
				System.out.printf("%s é Programador(a) Java Junior.",nomeFuncionario);
			}
			else if (servico == 2)
			{
				System.out.printf("\n%s é Faxineiro(a).",nomeFuncionario);
			}	
			else if (servico == 3)
			{
				System.out.printf("\n%s é Advogado.",nomeFuncionario);
			}
		}

}
