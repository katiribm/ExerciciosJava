package exerciciosJava;

import java.util.Scanner;

/*************************************************************************
 *  2) Faça um programa que:
 *    - Leia a cotação do dólar
 *    - Leia um valor em dólares
 *    - Converta esse valor para Real
 *    - Mostre o resultado
 *
 *************************************************************************/

public class ConversorDolarReal2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		
		double cotacaoDolar, valorDolar, valorReal; 
		
		System.out.println("Digite a cotação do dolar do dia: ");
		cotacaoDolar = sc.nextDouble(); 
		
		System.out.println("Digite o valor em dolar: ");
		valorDolar = sc.nextDouble();
		
		valorReal = valorDolar * cotacaoDolar; 
		System.out.println("O valor em reais é R$: " + valorReal);

	}

}
