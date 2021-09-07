package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 18) Escreva um programa que leia um n�mero inteiro (vari�vel CODIGO). Verificar se o c�digo
* � igual a 1, igual a 2 ou igual a 3. Caso n�o seja, apresentar a mensagem �C�digo inv�lido�.
* Ao ser verificado o c�digo e constatado que � um valor v�lido, o programa deve verificar cada
* c�digo em separado para determinar seu valor por extenso, ou seja, apresentar a mensagem
* �um�, �dois� ou �tr�s�. (Utilizar o comando Switch).
*******************************************************************************/

public class Switch18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo; 
		
		System.out.println("Digite o c�digo: ");
		codigo = sc.nextInt();
		
		switch(codigo) {			
			case 1: 
			System.out.println("um");
			
			case 2: 
				System.out.println("dois");
				
			case 3: 
				System.out.println("tres");
				
			default:
				System.out.println("c�digo invalido");
		}
		
		sc.close();
	}

}
