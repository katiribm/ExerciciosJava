package exerciciosJava;

/************************************************************************
13) Escreva um programa que leia 3 números inteiros e imprima na tela os
* valores em ordem crescente.
************************************************************************/ 

import java.util.Scanner;

public class IfCrescente13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y, z; 
		
		System.out.println("Informe um numero (x): ");
		x = sc.nextInt();
		
		System.out.println("Informe um numero (y): ");
		y = sc.nextInt();
		
		System.out.println("Informe um numero (z): ");
		z = sc.nextInt();
		
			
		if(x<y && y<z) {
			System.out.println(x + ", " + y + ", " + z);
		} 
		else if(x==y && y<z) {
			System.out.println(x + ", " + y + ", " + z);
		} 
		else if(z<y && y==z) {
			System.out.println(x + ", " + y + ", " + z);
		} 
		else if(x==z && z<y) {
			System.out.println(x + ", " + z + ", " + y);
		}
		else if(x<z && z<y)	{
			System.out.println(x + ", " + z + ", " + y);
		}
		else if(y<x && x<z) {
			System.out.println(y + ", " + x + ", " + z);
		}
		else if (y<z && z<x) {
			System.out.println(y + ", " + z + ", " + x); 
		}
			
		else if(z<x && x<y) {
			System.out.println(z + ", " + x + ", " + y);
		}
		else {
			System.out.println(z + ", " + y + ", " + x);
		}
		
		sc.close(); 
	}
}
			
			
			