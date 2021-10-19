package vetor;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM=5;
		int soma=0;
		int menor=0;
		int maior=0;
		int vet[] = new int[TAM];
		for (int x=0; x<TAM;x++) {
			vet[x]= entrada.nextInt();
			soma = soma+vet[x];
			if(x==0) {
				maior = vet[x];
				menor = vet[x];
			}
			if (vet[x]> maior) {
				maior = vet[x];
			}
			if (vet[x]<menor) {
				menor = vet[x];
			}
			
		}
		for (int x=0;x<TAM;x++) {
			System.out.print(vet[x] + "|");}
		System.out.println();
		for (int x=0;x<TAM;x++) {
			if(vet[x]%2==0) {
			System.out.print("Par - " + vet[x] + " ||| ");
			} else {
			System.out.print("Impar - " + vet[x] + " ||| ");}
		}
			System.out.println();
			System.out.println("Soma: " +soma);
			System.out.println("Média: " +  (soma/TAM));
			System.out.println("Maior: " +maior);
			System.out.println("Menor: " +menor);
		
entrada.close();
	}

}