package la�oRepeti�ao;

public class exe2 {
	//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

		
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
		 System.out.printf("\n\nA quantidade de n�meros pares �: %d", par);
		 System.out.printf("\nA quantidade de n�meros impares �: %d", impar);
		}
		
	}

