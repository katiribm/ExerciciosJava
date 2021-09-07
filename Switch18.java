package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 18) Escreva um programa que leia um número inteiro (variável CODIGO). Verificar se o código
* é igual a 1, igual a 2 ou igual a 3. Caso não seja, apresentar a mensagem “Código inválido”.
* Ao ser verificado o código e constatado que é um valor válido, o programa deve verificar cada
* código em separado para determinar seu valor por extenso, ou seja, apresentar a mensagem
* “um”, ”dois” ou “três”. (Utilizar o comando Switch).
*******************************************************************************/

public class Switch18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo; 
		
		System.out.println("Digite o código: ");
		codigo = sc.nextInt();
		
		switch(codigo) {			
			case 1: 
			System.out.println("um");
			
			case 2: 
				System.out.println("dois");
				
			case 3: 
				System.out.println("tres");
				
			default:
				System.out.println("código invalido");
		}
		
		sc.close();
	}

}
