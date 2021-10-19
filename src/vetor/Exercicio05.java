package vetor;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM = 10;
		char vet[] = new char [TAM];
		int cont = 0;
		for (int x = 0; x < TAM; x++) {
			vet[x] = entrada.next().charAt(0);
			if ((vet[x]!= 'a')&&(vet[x]!= 'e')&&(vet[x]!= 'i')&&(vet[x]!= 'o')&&(vet[x]!= 'u')) {
				cont++;	
			}
			}
		System.out.println("Total de  "+ cont + " consoantes");
		for (int x = 0; x < TAM; x++) {
			if ((vet[x]!= 'a')&&(vet[x]!= 'e')&&(vet[x]!= 'i')&&(vet[x]!= 'o')&&(vet[x]!= 'u'))
			System.out.print(vet[x] + " | " );
			}
		
		entrada.close();
		}}