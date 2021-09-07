package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 22) Faça um programa que leia um número. Se positivo armazene-o em A, se for
* negativo, em B. No final mostrar o resultado.
*******************************************************************************/

public class DoWhile22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A=0, B=0, numero;
		
		//do {
			System.out.println("Digite um numero ou digite 0 para sair: ");
			numero = sc.nextDouble();
				if(numero>0) {
					A += numero;
					System.out.println("numero armazenado em A\n");
				}else if(numero<0) {
					B+=numero;
					System.out.println("numero armazenado em B");
			}
		//	}while(numero != 0);
			System.out.printf("A= %2f\nB= %2f\n",A,B);
			sc.close(); 
}
}
