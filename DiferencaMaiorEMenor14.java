package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 14) Escreva um programa que leia dois números e apresente a diferença do
* maior para o menor.
*******************************************************************************/

public class DiferencaMaiorEMenor14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int x, y, diferenca; 
		
		System.out.println("Digite um numero (x): ");
		x = sc.nextInt();
		
		System.out.println("Digite um numero (y): ");
		y = sc.nextInt();
		
		if (x>=y) {
			diferenca = x - y;
		}
			else {
				diferenca = y - x;
			}
		
		
		System.out.println("A diferenca do o maior para o menor numero é: " + diferenca);
		
		sc.close(); 
		}
		
	}


