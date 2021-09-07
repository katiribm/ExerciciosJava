package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 19) Escreva um programa que leia tr�s valores para os lados de um tri�ngulo
* (vari�veis A, B e C). Verificar se cada lado � menor que a soma dos outros dois lados. Se sim,
* saber de A==B e se B==C, sendo verdade o tri�ngulo � eq�il�tero; Se n�o, verificar de A==B
* ou se A==C ou se B==C, sendo verdade o tri�ngulo � is�sceles; e caso contr�rio, o tri�ngulo
* ser� escaleno. Caso os lados fornecidos n�o caracterizarem um tri�ngulo, avisar a ocorr�ncia.
*******************************************************************************/

public class Triangulo19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C; 
		
		System.out.println("Digite o lado A do triangulo: ");
		A =sc.nextInt();
		
		System.out.println("Digite o lado B do triangulo: ");
		B =sc.nextInt();
		
		System.out.println("Digite o lado C do triangulo: ");
		C =sc.nextInt();
		
		if(A<B+C && B<C+A && C<A+B) {
			if(A==B && B==C) {
				System.out.println("Triangulo equilatero");
			}else if(A==B || A==C || B==C) {
				System.out.println("Triangulo isosceles");
			}else {
				System.out.println("Triangulo escaleno");
			}
		}else{
			System.out.println("N�o caracteriza um triangulo");
			}
		
		sc.close();
		}
	}
	


