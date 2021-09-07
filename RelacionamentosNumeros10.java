package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 10) Escrever um programa que leia dois números inteiros e mostre todos os 
* relacionamentos de ordem existentes entre eles. Os relacionamentos possíveis 
* são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
*******************************************************************************/

public class RelacionamentosNumeros10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B; 
		boolean igual=false, naoIgual=false, maior=false, menor=false, maiorIgual=false, menorIgual=false;
		
		System.out.println("Digite o primeiro numero(A): ");
		A = sc.nextInt();
		
		System.out.println("Digite o segundo numero(B): ");
		B = sc.nextInt();
		
		if(A == B) { 
			igual = true;
		}
		if(A != B) {
			naoIgual = true;
		}
		if(A > B) { 
			maior = true; 
		}
		if(A < B) { 
			menor = true; 
		}
		if(A >= B) { 
			maiorIgual = true; 
		}
		if(A <= B) { 
			menorIgual = true; 
		}
		
		System.out.println("Igual = " + igual );
		System.out.println("naoIgual = " + naoIgual );
		System.out.println("Maior = " + maior );
		System.out.println("Menor = " + menor );
		System.out.println("Maior ou igual = " + maiorIgual );
		System.out.println("Menor ou igual = " + menorIgual );
		
		sc.close();
	}

}
