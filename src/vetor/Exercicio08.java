package vetor;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM=5;
		int soma=0;
		int mult=1;
		int vet[] = new int[TAM];
		for (int x=0; x<TAM;x++) {
			vet[x]= entrada.nextInt();
			soma = soma+vet[x];
			mult= mult*vet[x];
		}
			System.out.println();
			System.out.println("Soma: " +soma);
			System.out.println("Multiplicação: " +  mult);
			for (int x=0; x<TAM;x++) {
			System.out.print(vet[x] + " || ");}
		
entrada.close();
	}

}