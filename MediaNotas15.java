package exerciciosJava;

import java.util.Scanner;

/*******************************************************************************
* 15) Escreva um programa que leia quatro notas escolares de um aluno e
* apresentar uma mensagem que o aluno foi aprovado se o valor da m�dia escolar
* for maior ou igual a 7. Se o valor da m�dia for menor que 7, solicitar a nota
* do recupera��o, somar com o valor da m�dia e obter a nova m�dia. Se a nova
* m�dia for maior ou igual a 7, apresentar uma mensagem informando que o aluno
* foi aprovado na recupera��o. Se o aluno n�o foi aprovado, apresentar uma
* mensagem informando esta condi��o. Apresentar junto com as mensagens o valor
* da m�dia do aluno.
*******************************************************************************/

public class MediaNotas15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, media, recuperacaoNota, recuperacaoMedia; 
		boolean aprovacao = false; 
		
		System.out.println("nota 1: ");
		nota1 = sc.nextDouble();
		
		System.out.println("nota 2: ");
		nota2 = sc.nextDouble();
		
		System.out.println("nota 3: ");
		nota3 = sc.nextDouble();
		
		System.out.println("nota 4: ");
		nota4 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4; 
		
		if (media >= 7) { aprovacao = true;
		}
		else {
			System.out.println("O aluno ficou de recupera��o, digite a nota da recuperacao: ");
			recuperacaoNota = sc.nextDouble();
			media = (media + recuperacaoNota) / 2; 
			}
				if (media >= 7) { aprovacao = true;
			}
			
				
				if(aprovacao == true) {
				System.out.println("Aluno aprovado com media: " + media);
			}
				else {
				System.out.println("Aluno reprovado com media: " + media);
			}
				
				sc.close(); 
	}

}
