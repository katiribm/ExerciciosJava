package exerciciosJava;

import java.util.Scanner;

/*****************************************************************************************************************
* 5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
* 	12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
* 	Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
* 	Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
* 	fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
* 	tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
*****************************************************************************************************************/

public class CalculoCombustivel5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double litrosCombustivel, tempoViagem, distancia, velocidadeMedia, autonomia=12; 
		
		System.out.println("Digite o tempo gasto na viagem(h): ");
		tempoViagem = sc.nextDouble();
		
		System.out.println("Digite a velocidade média(km/h): ");
		velocidadeMedia = sc.nextDouble(); 
		
		distancia = tempoViagem * velocidadeMedia; 
		litrosCombustivel = distancia / autonomia; 
		
		System.out.println("A quantidade de litro de combustível utilizada nesta viagem foi: " + litrosCombustivel + " litros.");
	}

}
