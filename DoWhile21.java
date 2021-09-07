package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 21) Faça um programa que leia um número inteiro e mostre uma mensagem na tela
* indicando se este número é positivo ou negativo. Pare a execução do programa
* quando o usuário requisitar.
*******************************************************************************/

public class DoWhile21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
				
		do {
			System.out.println("Digite um numero inteiro, digite 0 para sair: ");
			numero = sc.nextInt();
				if(numero>0) {
					System.out.println("o numero: "+numero+ " é positivo");
				}else if(numero<0) {
					System.out.println("o numero: "+numero+ " é");
				}
		}while(numero !=0);
			
		sc.close(); 
		}
		

	}


