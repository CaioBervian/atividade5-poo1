package vetor;

import java.util.Scanner;

public class Exercicio17 {


	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM=3;
		String[] nome = new String[TAM];
		String sobrenome[] = new String[TAM];
		int mes[] = new int[TAM];

		
		for (int x=0; x<TAM;x++) {
			System.out.println("Nome: ");
			nome[x]= entrada.next();

			System.out.println("Sobrenome: ");
			sobrenome[x]= entrada.next();
			
			System.out.println("Mês do Aniversário: ");
			mes[x]= entrada.nextInt();
		}
		
		
		for (int x=0; x<TAM;x++) {
			System.out.println("Nome: " + nome[x] + " " + sobrenome[x] + ", nascido no mês: "+ mes[x]);
		}
		
				
			
entrada.close();
	}

}