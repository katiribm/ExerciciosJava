package exerciciosJava;

import java.util.Scanner;

/*************************************************************************
* 3) Faça um programa para pagamento de comissão de vendedores de peças,
*		levando-se em consideração que sua comissão será de 5% do total da venda 
*		e que você tem os seguintes dados:
* 		- Identificação do vendedor
* 		- Código da peça
* 		- Preço unitário da peça
* 		- Quantidade vendida
*************************************************************************/

public class Comissao3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idVendedor, quantidade; 
		double precoPeca, valorComissao, porcentagemComissao=0.05; 
		
		System.out.println("Digite a identificação do vendedor: ");
		idVendedor = sc.nextInt();
		
		System.out.println("Digite o codigo da peça vendida: ");
		System.out.println("Digite o preço unitario da peça: ");
		precoPeca = sc.nextDouble();
		
		System.out.println("Digite a quantidade de peças vendidas: ");
		quantidade = sc.nextInt();
		
		valorComissao = (precoPeca * quantidade) * porcentagemComissao; 
		
		System.out.println(idVendedor + "O valor da comissao a receber é R$: " + valorComissao);
		
		sc.close(); 

	}

}
