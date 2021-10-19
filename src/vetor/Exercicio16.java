package vetor;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM=20;
		int soma = 0;
		
		int vet[] = new int[TAM];
		
		for (int x=0; x<TAM;x++) {
			System.out.println("Valor: ");
			vet[x]= entrada.nextInt();
		}
		
			for (int i=0; i<TAM;i++) {
				System.out.print(vet[i] + ": " );
				soma = 0 ;
				
				do {
					
				soma++;
					System.out.print("#");
					
				} while ( soma<vet[i] );
				
			System.out.println();
				
			}
entrada.close();
	}

}