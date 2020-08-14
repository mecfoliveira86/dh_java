//Faça um programa que leia um código numérico inteiro e um array de cinco posições
//de números reais. Se o código for zero, termine o programa. Se o código for 1, mostre o
//array na ordem direta. Se o código for dois mostre o array na ordem inversa.


package aula13;

import java.util.Scanner;

public class exe6_lista2 {
	
	public static void main(String[] args) {
		int[] numeros= {0,1,2,3,4};
		System.out.println("Selecione como você quer exibir o Array!");
		System.out.println("0 - Fecha o programa;");
		System.out.println("1 - Exibe o Array em ordem direta;");
		System.out.println("2 - Exibe o Array em ordem inversa.");
		
		System.out.print("Sua opção é: ");
		
		Scanner sc_opcao=new Scanner(System.in);
		int opcao=sc_opcao.nextInt();
		
		switch(opcao) {
		case 0:
			System.out.println("------------");
			System.out.println("Você optou por fechar o Programa!");
			break;
			
		case 1:
			System.out.println("------------");
			System.out.println("Você optou por imprimir o Array em ordem direta");
			for(int i=0; i<numeros.length;i++) {
				System.out.println("Posição " + i + " tem como valor "+ numeros[i]);
			}
			break;
			
		case 2:
			System.out.println("------------");
			System.out.println("Você optou por imprimir o Array em ordem inversa");
			for(int i=numeros.length-1; i>=0;i--) {
				System.out.println("Posição " + i + " tem como valor "+ numeros[i]);
			}
			break;
			
		default:
			System.out.println("Opção Desconhecida!");
		}
		
		sc_opcao.close();
		
	}

}
