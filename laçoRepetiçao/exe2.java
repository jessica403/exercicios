package laçoRepetiçao;

public class exe2 {
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		
		public static void main(String[] args) {
					
			int x, par=0, impar=0;
			
			for (x = 1 ; x <= 10 ; x++) {
				
				if (x % 2 == 0) {				
					par=par+1;
					System.out.printf("| Par %d ",x);				
				}
				else {
					impar=impar+1;
					System.out.printf("\nImpar %d ", x);
				}
			}
		 System.out.printf("\n\nA quantidade de números pares é: %d", par);
		 System.out.printf("\nA quantidade de números impares é: %d", impar);
		}
		
	}

