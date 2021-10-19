package vetor;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM=4;
		int media=0;
		int vet[] = new int[TAM];
		for (int x=0; x<TAM;x++) {
			System.out.println("Digite a nota");
			vet[x]= entrada.nextInt();
			media = media+vet[x];
	}
	
			System.out.print("Média: " + media/4);
entrada.close();
	}}