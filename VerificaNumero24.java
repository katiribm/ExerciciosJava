package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 24) Escreva um programa que leia dois n�meros inteiros e apresente as op��es para usu�rio escolher o que deseja
* realizar:
* 1 � Verificar se um dos n�meros lidos � ou n�o m�ltiplo do outro
* 2 � Verificar se os dois n�meros lidos s�o pares
* 3 � Verificar se a m�dia dos dois n�meros � maior ou igual a 7.
* 4 � Sair
*******************************************************************************/

public class VerificaNumero24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int PrimeiroNumero,SegundoNumero,Resultado,Menu;
	    boolean LoopMenu = true;

	    System.out.print("Digite o primeiro n�mero: ");
		PrimeiroNumero = sc.nextInt();

		System.out.print("Digite o segundo n�mero: ");
		SegundoNumero = sc.nextInt();
	
		while(LoopMenu){
		      System.out.print("\nVoc� deseja verificar se...\n\t1 - um dos n�meros lidos � ou n�o m�ltiplo do outro\n\t2 - os dois n�meros lidos s�o pares\n\t3 - a m�dia dos dois n�meros � maior ou igual a 7\n\t4 - Sair\n");
		      Menu = sc.nextInt();
		  		switch(Menu){
		  			case 1:
		  				if(PrimeiroNumero%SegundoNumero==0||SegundoNumero%PrimeiroNumero==0){
		  					System.out.println("Sim, um dos n�meros � m�ltiplo do outro");
		  				}else{
		  					System.out.println("N�o, nenhum dos n�meros � m�ltiplos do outro");
		  				}
		  			break;
		  			case 2:
		  				if(PrimeiroNumero%2==0 && SegundoNumero%2==0){
		  					System.out.println("Sim, os dois n�meros lidos s�o pares.");
		  				}else{
		  					System.out.println("N�o, os dois n�meros lidos s�o �mpares.");
		  				}
		  			break;
		  			case 3:
		  				if((PrimeiroNumero+SegundoNumero)/2 >= 7){
		  					System.out.println("Sim, a m�dia dos dois n�meros � maior ou igual a 7.");
		  				}else{
		  					System.out.println("N�o, a m�dia dos dois n�meros n�o � maior ou igual a 7.");
		  				}
		  			break;
		  			case 4:
		  				LoopMenu = false;
		  					System.out.print("Saindo...\n");
		  			break;
		  			default:
		  				System.out.println("Op��o inv�lida!");
		  	}
		  		sc.close();
		}
	}
}
	
	


