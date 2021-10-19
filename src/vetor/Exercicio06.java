package vetor;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM=20;
		int vet[] = new int[TAM];
		final int PAR=20;
		int vetp[] = new int[PAR];
		final int IMPAR=20;
		int veti[] = new int[IMPAR];
		for (int x=0; x<TAM;x++) {
			vet[x]= entrada.nextInt();
		}
		for (int x=0;x<TAM;x++) {
			if(vet[x]%2==0) {
			vetp[x]= vet[x];
			} else {
			veti[x]= vet[x];}
		}
		for (int x=0;x<TAM;x++) {
			System.out.print(vet[x] + " , ");
		}
		System.out.println();
		for (int x=0;x<TAM;x++) {
			if(vet[x]%2==0) {
			System.out.print("Par - " + vet[x] + " ||| ");
		}}
		System.out.println();
		for (int x=0;x<TAM;x++) {
			if(vet[x]%2!=0) {
			System.out.print("Impar - " + vet[x] + " ||| ");
		}}
entrada.close();

}}