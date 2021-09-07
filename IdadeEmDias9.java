package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e 
* dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
* com 365 dias e mês com 30 dias.
*******************************************************************************/

public class IdadeEmDias9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int anos, meses, dias, idadeEmDias;
		
		System.out.println("Digite os anos: ");
		anos = sc.nextInt();
		
		System.out.println("Digite os meses: ");
		meses = sc.nextInt();
		
		System.out.println("Digite os dias: ");
		dias = sc.nextInt();
		
		idadeEmDias = dias + (meses * 30) + (anos * 365); 
		
		System.out.println("A idade expressa em dias é de: " + idadeEmDias + " dias");

		sc.close(); 
	}

}
