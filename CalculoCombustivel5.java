package exerciciosJava;

import java.util.Scanner;

/*****************************************************************************************************************
* 5) Efetuar o c�lculo da quantidade de litros de combust�vel gasta em uma viagem, utilizando um autom�vel que faz
* 	12 Km por litro. Para obter o c�lculo, o usu�rio deve fornecer o tempo gasto na viagem e a velocidade m�dia.
* 	Desta forma, ser� poss�vel obter a dist�ncia percorrida com a f�rmula DISTANCIA = TEMPO * VELOCIDADE.
* 	Tendo o valor da dist�ncia, basta calcular a quantidade de litros de combust�vel utilizada na viagem com a
* 	f�rmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade m�dia,
* 	tempo gasto, a dist�ncia percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
*****************************************************************************************************************/

public class CalculoCombustivel5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double litrosCombustivel, tempoViagem, distancia, velocidadeMedia, autonomia=12; 
		
		System.out.println("Digite o tempo gasto na viagem(h): ");
		tempoViagem = sc.nextDouble();
		
		System.out.println("Digite a velocidade m�dia(km/h): ");
		velocidadeMedia = sc.nextDouble(); 
		
		distancia = tempoViagem * velocidadeMedia; 
		litrosCombustivel = distancia / autonomia; 
		
		System.out.println("A quantidade de litro de combust�vel utilizada nesta viagem foi: " + litrosCombustivel + " litros.");
	}

}
