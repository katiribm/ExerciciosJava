package exerciciosJava;

import java.util.Scanner;

/*************************************************************************
 *  2) Fa�a um programa que:
 *    - Leia a cota��o do d�lar
 *    - Leia um valor em d�lares
 *    - Converta esse valor para Real
 *    - Mostre o resultado
 *
 *************************************************************************/

public class ConversorDolarReal2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		
		double cotacaoDolar, valorDolar, valorReal; 
		
		System.out.println("Digite a cota��o do dolar do dia: ");
		cotacaoDolar = sc.nextDouble(); 
		
		System.out.println("Digite o valor em dolar: ");
		valorDolar = sc.nextDouble();
		
		valorReal = valorDolar * cotacaoDolar; 
		System.out.println("O valor em reais � R$: " + valorReal);

	}

}
