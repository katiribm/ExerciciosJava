package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 12) Escreva um programa que leia um n�mero inteiro e exiba o seu m�dulo.
*   O m�dulo de um n�mero x �:
*   x se x � maior ou igual a zero
*   x * (-1) se x � menor que zero
*******************************************************************************/

public class Modulo12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x, moduloX;
		
		System.out.println("Escreva um numero(X): ");
		x = sc.nextDouble();
		
		if (x > 0) {
			moduloX = x;
		}
		else { 
			moduloX = x * (-1); 
		}
		
		System.out.println("O modulo de x � : " + moduloX);

		sc.close();

	}

}
