package exerciciosJava;

import java.util.Scanner;

/*************************************************************************
* 3) Fa�a um programa para pagamento de comiss�o de vendedores de pe�as,
*		levando-se em considera��o que sua comiss�o ser� de 5% do total da venda 
*		e que voc� tem os seguintes dados:
* 		- Identifica��o do vendedor
* 		- C�digo da pe�a
* 		- Pre�o unit�rio da pe�a
* 		- Quantidade vendida
*************************************************************************/

public class Comissao3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idVendedor, quantidade; 
		double precoPeca, valorComissao, porcentagemComissao=0.05; 
		
		System.out.println("Digite a identifica��o do vendedor: ");
		idVendedor = sc.nextInt();
		
		System.out.println("Digite o codigo da pe�a vendida: ");
		System.out.println("Digite o pre�o unitario da pe�a: ");
		precoPeca = sc.nextDouble();
		
		System.out.println("Digite a quantidade de pe�as vendidas: ");
		quantidade = sc.nextInt();
		
		valorComissao = (precoPeca * quantidade) * porcentagemComissao; 
		
		System.out.println(idVendedor + "O valor da comissao a receber � R$: " + valorComissao);
		
		sc.close(); 

	}

}
