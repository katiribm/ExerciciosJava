package exerciciosJava;

import java.util.Scanner;

/*****************************************************************************************************************
* 7) Ler uma temperatura em graus Fahrenheit e apresent�-Ia convertida em graus Celsius. A f�rmula de convers�o de
* 		temperatura a ser utilizada � C = (F - 32) * 5 / 9, em que a vari�vel F � a temperatura em graus Fahrenheit e a
* 		vari�vel C � a temperatura em graus Celsius.
*****************************************************************************************************************/

public class ConversaoTemperatura2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		double celsius, fahrenheit;
		
		System.out.println("Digite a temperatura em graus fahrenheit: ");
		fahrenheit = sc.nextDouble();
		
		celsius = (fahrenheit - 32) * 5 / 9;  
		
		System.out.println("A temperatura em graus Celsius � de: " + celsius);

		sc.close();
	}

	}


