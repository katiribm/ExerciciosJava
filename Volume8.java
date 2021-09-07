package exerciciosJava;

import java.util.Scanner;

/*****************************************************************************************************************
* 8) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
* 		V = 3.14159 * R * R * A
* 		Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
*****************************************************************************************************************/

public class Volume8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		double V, R, A; 
		
		System.out.println("Digite a altura da lata(cm): ");
		A = sc.nextDouble(); 
		
		System.out.println("Digite o raio da lata(cm): ");
		R = sc.nextDouble();
		
		V = 3.14159 * R * R * A; 
		
		System.out.println("O volume da lata de óleo é de: " + V + " cm3");
		
		sc.close();
	}
	
	

}
