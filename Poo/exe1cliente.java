package Poo;

public class exe1cliente {
	/*1) Crie uma classe cliente e apresente os atributos e m�todos
	 *  referentes esta classe, em seguida crie um objeto cliente,
	 *   defina as inst�ncias deste objeto e apresente as informa��es deste objeto no console.*/
		
		
		public String nomeCliente;
		public int idadeCliente;
		public char sexoCliente;
		public int servico;
		
		
		public void mostra()
		{
			if (sexoCliente == 'M')
			{
				System.out.printf("O nome do cliente � %s do sexo %s", nomeCliente, sexoCliente);
			}
			else if (sexoCliente =='F')
			{
				System.out.printf("O nome da cliente � %s do sexo %s", nomeCliente, sexoCliente);
			}		
		}
		
		public void mostrarAnoNascimento(int idadeCliente)	
		{	
			System.out.printf("\nO ano de nascimento de %s � : %d",nomeCliente, (2020-idadeCliente));
			
		}
		
		public void mostrarServico()
		{
			if (servico == 1)
			{
				System.out.printf("%s veio fazer as unhas.",nomeCliente);
			}
			else if (servico == 2)
			{
				System.out.printf("\n%s veio fazer/cortar o cabelo.",nomeCliente);
			}	
			else if (servico == 3)
			{
				System.out.printf("\n%s veio fazer depila��o.",nomeCliente);
			}
		}

	}
