package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 11) Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos
* valores de modo que a variável A passe a possuir o valor da variável B, e a
* variável B passe a possuir o valor da variável A. Apresentar os valores
* trocados.
*******************************************************************************/

public class TrocaValores11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A, B, variavelTemporaria;
		
		System.out.println("Digite o valor da variável A: ");
		A = sc.nextInt();
		
		System.out.println("Digite o valor da variável B: ");
		B = sc.nextInt();
		
		variavelTemporaria = A;
		A = B; 
		B = variavelTemporaria; 
		
		System.out.println("A= " + A + " B= " + B);
		
		sc.close();

	}

}
