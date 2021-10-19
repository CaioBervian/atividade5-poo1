package vetor;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM=5;
		int vet[] = new int[TAM];
		for (int x=0; x<TAM;x++) {
			System.out.println("Digite o número");
			vet[x]= entrada.nextInt();
	}
		for ( int x=4 ; x>=0 ; x--) {
			
			System.out.print(vet[x] + " || ");
		}
entrada.close();
	}}