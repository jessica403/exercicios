package Poo;

public class aviao {
	/*2) Crie uma classe avião e apresente os atributos e
	 *métodos referentes esta classe, em seguida crie um
	 *objeto avião, defina as instâncias deste objeto e apresente
	 * as informações deste objeto no console.*/

		
	
		public String modeloAviao;
		public int destino;
		public String partida;
		public int quantidadePassageiros;
		public final int capacidadePassageiros = 200;
		
		
		public void mostra()
		{
			if (quantidadePassageiros <= capacidadePassageiros )
			{
				System.out.printf("\nModelo %s - Voo liberado com %d passageiros.", modeloAviao, quantidadePassageiros);
			}
			else if (quantidadePassageiros > capacidadePassageiros )
			{
				System.out.printf("\nModelo %s - Voo cancelado por excesso de passageiros com %d passageiros a mais que o permitido.", modeloAviao,(quantidadePassageiros-capacidadePassageiros));
			}		
		}
		
		public void mostrarPartida(String partida)	
		{	
			System.out.printf("\nVoo com partida em: ",partida);
			
		}
		
		public void mostrarDestino()
		{
			if (destino == 1)
			{
				System.out.printf("\nVoo com destino a Russia.");
			}
			else if (destino == 2)
			{
				System.out.printf("\nVoo com destino a Madagascar.");
			}	
			else if (destino == 3)
			{
				System.out.printf("\nVoo com destino a Australia.");
			}
		}

}
