package exerciciosJava;

import java.util.Scanner;

/*****************************************************************************************************************
* 7) Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
* 		temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
* 		variável C é a temperatura em graus Celsius.
*****************************************************************************************************************/

public class ConversaoTemperatura2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		double celsius, fahrenheit;
		
		System.out.println("Digite a temperatura em graus fahrenheit: ");
		fahrenheit = sc.nextDouble();
		
		celsius = (fahrenheit - 32) * 5 / 9;  
		
		System.out.println("A temperatura em graus Celsius é de: " + celsius);

		sc.close();
	}

	}


