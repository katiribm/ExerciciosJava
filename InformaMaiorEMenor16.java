package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 16) Escreva um programa que leia dois n�meros e exiba mensagem informando o
* valor do maior n�mero e o valor do menor n�mero. Se os dois n�meros forem
* iguais, o programa deve exibir mensagem informando este fato.
*******************************************************************************/


public class InformaMaiorEMenor16 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int PrimeiroNumero, SegundoNumero;

	        System.out.print("Digite o primeiro n�mero:  ");
	        PrimeiroNumero = sc.nextInt();

	        System.out.print("Digite o segundo n�mero:  ");
	        SegundoNumero = sc.nextInt();


	        if(PrimeiroNumero > SegundoNumero){
	          System.out.println("O primeiro n�mero � maior que o segundo n�mero.");
	        }else if(PrimeiroNumero <SegundoNumero){
	          System.out.println("O primeiro n�mero � menor que o segundo n�mero.");
	        }else{
	          System.out.println("Os dois n�meros s�o iguais.");
	        }
	        
	        sc.close(); 

	    }

	}