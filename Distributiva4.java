package exerciciosJava;

import java.util.Scanner;

/*************************************************************************
 * 4) Ler quatro valores num�ricos inteiros e apresentar o resultado dois a dois da adi��o e multiplica��o entre os
 * 	valores lidos, baseando-se na utiliza��o do conceito de propriedade distributiva. Dica: se forem lidas as vari�veis
 * 	A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
 * 	com D e por �ltimo C com D. Note que para cada opera��o ser�o utilizadas seis combina��es. Assim sendo,
 * 	devem ser realizadas doze opera��es de processamento, sendo seis para as adi��es e seis para as
 * 	multiplica��es.
*************************************************************************/

public class Distributiva4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int[] valores = new int[4];
		
		for(int i = 0; i<4; i++) {
			System.out.println("Digite o valor " +(i+1)+ ": ");
			valores[i] = sc.nextInt(); 					
		}

		System.out.print("Valor 1 e Valor 2:\n");
		System.out.print("	"+valores[0]+" + "+valores[1]+" = "+(valores[0]+valores[1])+"\n");
		System.out.print("	"+valores[0]+" * "+valores[1]+" = "+(valores[0]*valores[1])+"\n\n");

		System.out.print("Valor 1 e Valor 3:\n");
		System.out.print("	"+valores[0]+" + "+valores[2]+" = "+(valores[0]+valores[2])+"\n");
		System.out.print("	"+valores[0]+" * "+valores[2]+" = "+(valores[0]*valores[2])+"\n\n");

		System.out.print("Valor 1 e Valor 4:\n");
		System.out.print("	"+valores[0]+" + "+valores[3]+" = "+(valores[0]+valores[3])+"\n");
		System.out.print("	"+valores[0]+" * "+valores[3]+" = "+(valores[0]*valores[3])+"\n\n");
		
		System.out.print("Valor 2 e Valor 3:\n");
		System.out.print("	"+valores[1]+" + "+valores[2]+" = "+(valores[1]+valores[2])+"\n");
		System.out.print("	"+valores[1]+" * "+valores[2]+" = "+(valores[1]*valores[2])+"\n\n");

		System.out.print("Valor 2 e Valor 4:\n");
		System.out.print("	"+valores[1]+" + "+valores[3]+" = "+(valores[1]+valores[3])+"\n");
		System.out.print("	"+valores[1]+" * "+valores[3]+" = "+(valores[1]*valores[3])+"\n\n");

		System.out.print("Valor 3 e Valor 4:\n");
		System.out.print("	"+valores[2]+" + "+valores[3]+" = "+(valores[2]+valores[3])+"\n");
		System.out.print("	"+valores[2]+" * "+valores[3]+" = "+(valores[2]*valores[3])+"\n\n");
		
		sc.close(); 
	}


}
