package exerciciosJava;

/*************************************************************************
 *  1-)Fa�a um programa para calcular o estoque m�dio de uma pe�a, sendo que:
 *  ESTOQUE M�DIO = (QUANTIDADE_M�NIMA + QUANTIDADE_M�XIMA) / 2.
 *
 *************************************************************************/

import java.util.Scanner;

public class EstoqueMedio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double estMinimo, estMaximo, estMedio; 
		
		System.out.println("Digite a quantidade minima do estoque: ");
		estMinimo = sc.nextDouble(); 
		
		System.out.println("Digite a quantidade m�xima do estoque: ");
		estMaximo = sc.nextDouble(); 
		
		estMedio = (estMinimo + estMaximo) / 2; 
		
		System.out.println("O estoque m�dio �: " + estMedio);

		sc.close(); 
	}

}
