package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 11) Ler dois valores inteiros para as vari�veis A e B, efetuar a troca dos
* valores de modo que a vari�vel A passe a possuir o valor da vari�vel B, e a
* vari�vel B passe a possuir o valor da vari�vel A. Apresentar os valores
* trocados.
*******************************************************************************/

public class TrocaValores11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A, B, variavelTemporaria;
		
		System.out.println("Digite o valor da vari�vel A: ");
		A = sc.nextInt();
		
		System.out.println("Digite o valor da vari�vel B: ");
		B = sc.nextInt();
		
		variavelTemporaria = A;
		A = B; 
		B = variavelTemporaria; 
		
		System.out.println("A= " + A + " B= " + B);
		
		sc.close();

	}

}
