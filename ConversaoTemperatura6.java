package exerciciosJava;

import java.util.Scanner;

/*****************************************************************************************************************
* 6) Ler uma temperatura em graus Celsius e apresent�-Ia convertida em graus Fahrenheit. A f�rmula de convers�o de
* 	temperatura a ser utilizada � F = (9 * C + 160) / 5, em que a vari�vel F representa � a temperatura em graus
* 	Fahrenheit e a vari�vel C representa � a temperatura em graus Celsius.
*****************************************************************************************************************/

public class ConversaoTemperatura6 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		double celsius, fahrenheit;
		
		System.out.println("Digite a temperatura em graus celsius: ");
		celsius = sc.nextDouble();
		
		fahrenheit = (9 * celsius + 160) / 5; 
		
		System.out.println("A temperatura em graus Fahrenheit � de: " + fahrenheit);

		sc.close();
	}

}
