package exerciciosJava;

import java.util.Arrays;
import java.util.Scanner;

/*******************************************************************************
* 20) Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor
* maior que zero para cada variável (se o valor digitado não é válido, mostrar mensagem e ler
* novamente). Exibe o menor valor lido multiplicado pelo maior e o maior valor dividido pelo
* menor.
*******************************************************************************/

public class TestaForWhile20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] valores = new int[3];
		
			for(int x=0; x<3; x++) {
				System.out.println("Digite o valor " +(x+1)+ ": ");
				valores[x] = sc.nextInt(); 
					while(valores[x]<=0) {
						System.out.println("Digite um valor válido " +(x+1)+ ": ");
						valores[x] = sc.nextInt(); 
			}
	}
			Arrays.sort(valores);
			System.out.println("Exibe o menor valor lido multiplicado pelo maior: "+(valores[0]*valores[2]+
					" E o maior valor dividido pelo menor: "+(valores[2]/valores[0])));

			sc.close();
}
}
