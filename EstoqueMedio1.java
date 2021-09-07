package exerciciosJava;

/*************************************************************************
 *  1-)Faça um programa para calcular o estoque médio de uma peça, sendo que:
 *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 *
 *************************************************************************/

import java.util.Scanner;

public class EstoqueMedio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double estMinimo, estMaximo, estMedio; 
		
		System.out.println("Digite a quantidade minima do estoque: ");
		estMinimo = sc.nextDouble(); 
		
		System.out.println("Digite a quantidade máxima do estoque: ");
		estMaximo = sc.nextDouble(); 
		
		estMedio = (estMinimo + estMaximo) / 2; 
		
		System.out.println("O estoque médio é: " + estMedio);

		sc.close(); 
	}

}
