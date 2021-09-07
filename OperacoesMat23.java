package exerciciosJava;

/*******************************************************************************
* 23) Escreva um programa que exiba as seguintes op��es e realize os que se pede em cada
* uma delas:
*		1 � Adi��o
*		2 � Subtra��o
*		3 � Multiplica��o
*		4 � Divis�o
*******************************************************************************/

import java.util.Scanner;

public class OperacoesMat23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double primeiroNumero, segundoNumero, resultado;
		int menu;
		
			System.out.println("Digite uma das opera��es a seguir:\n\t1-adi��o\n\t2-Subtra��o\n\t3-Multiplica��o\n\t4-Divis�o");
			menu = sc.nextInt();
			
			System.out.print("Digite o primeiro n�mero: ");
			primeiroNumero = sc.nextDouble();
			
			System.out.print("Digite o segundo n�mero: ");
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
				System.out.print("Op��o inv�lida!");
		}
		
		sc.close();

	}

}
