package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 16) Escreva um programa que leia dois números e exiba mensagem informando o
* valor do maior número e o valor do menor número. Se os dois números forem
* iguais, o programa deve exibir mensagem informando este fato.
*******************************************************************************/


public class InformaMaiorEMenor16 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int PrimeiroNumero, SegundoNumero;

	        System.out.print("Digite o primeiro número:  ");
	        PrimeiroNumero = sc.nextInt();

	        System.out.print("Digite o segundo número:  ");
	        SegundoNumero = sc.nextInt();


	        if(PrimeiroNumero > SegundoNumero){
	          System.out.println("O primeiro número é maior que o segundo número.");
	        }else if(PrimeiroNumero <SegundoNumero){
	          System.out.println("O primeiro número é menor que o segundo número.");
	        }else{
	          System.out.println("Os dois números são iguais.");
	        }
	        
	        sc.close(); 

	    }

	}