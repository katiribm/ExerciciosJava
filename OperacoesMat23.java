package exerciciosJava;

/*******************************************************************************
* 23) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada
* uma delas:
*		1 – Adição
*		2 – Subtração
*		3 – Multiplicação
*		4 – Divisão
*******************************************************************************/

import java.util.Scanner;

public class OperacoesMat23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double primeiroNumero, segundoNumero, resultado;
		int menu;
		
			System.out.println("Digite uma das operações a seguir:\n\t1-adição\n\t2-Subtração\n\t3-Multiplicação\n\t4-Divisão");
			menu = sc.nextInt();
			
			System.out.print("Digite o primeiro número: ");
			primeiroNumero = sc.nextDouble();
			
			System.out.print("Digite o segundo número: ");
			segundoNumero = sc.nextDouble();
			
		switch(menu){
			case 1:
				resultado = primeiroNumero + segundoNumero;
				System.out.printf("%f + %f = %f",primeiroNumero,segundoNumero,resultado);
				break;
				
			case 2:
				resultado = primeiroNumero - segundoNumero;
				System.out.printf("%f - %f = %f",primeiroNumero,segundoNumero,resultado);
				break;
				
			case 3:
				resultado = primeiroNumero * segundoNumero;
				System.out.printf("%f * %f = %f",primeiroNumero,segundoNumero,resultado);
				break;
				
			case 4:
				resultado = primeiroNumero / segundoNumero;
				System.out.printf("%f / %f = %f",primeiroNumero,segundoNumero,resultado);
				break;
				
			default:
				System.out.print("Opção inválida!");
		}
		
		sc.close();

	}

}
