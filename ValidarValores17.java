package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 17) Escreva um programa que leia um n�mero inteiro. Verificar por meio de condi��o se o
* valor fornecido est� na faixa entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da
* faixa, apresentar a mensagem �valor v�lido�. Caso contr�rio, apresentar a mensagem �valor
*  inv�lido�.
*******************************************************************************/

public class ValidarValores17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero; 
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt(); 
		
		if(numero >= 0 && numero <=9) {
			System.out.println("Valor v�lido");
		} else {
			System.out.println("Valor inv�lido");
		}

		sc.close();
	}

}
