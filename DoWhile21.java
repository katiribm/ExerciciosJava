package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 21) Fa�a um programa que leia um n�mero inteiro e mostre uma mensagem na tela
* indicando se este n�mero � positivo ou negativo. Pare a execu��o do programa
* quando o usu�rio requisitar.
*******************************************************************************/

public class DoWhile21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
				
		do {
			System.out.println("Digite um numero inteiro, digite 0 para sair: ");
			numero = sc.nextInt();
				if(numero>0) {
					System.out.println("o numero: "+numero+ " � positivo");
				}else if(numero<0) {
					System.out.println("o numero: "+numero+ " �");
				}
		}while(numero !=0);
			
		sc.close(); 
		}
		

	}


