//Crie um programa que, dado um dia da semana, verifique se é final de semana.

package aula13;

import java.util.Scanner;

public class exe6 {
	public static void main(String[] args) {
		System.out.println("Verificador de Dia da Semana");
		System.out.println("----OPÇÕES----");
		System.out.println("[1] - Segunda-feira");
		System.out.println("[2] - Terça-feira");
		System.out.println("[3] - Quarta-feira");
		System.out.println("[4] - Quinta-feira");
		System.out.println("[5] - Sexta-feira");
		System.out.println("[6] - Sábado");
		System.out.println("[7] - Domingo");
		
		System.out.println("Faça sua escolha: ");
		
		Scanner sc1 = new Scanner(System.in);
		int escolha = sc1.nextInt();
		
//		Resolution with SWITCH		
//		
//		switch(escolha) {
//		case 1:
//			System.out.println("Você selecionou Segunda-feira.");
//			System.out.println("Dia Útil!");
//			break;
//			
//		case 2:
//			System.out.println("Você selecionou Terça-feira.");
//			System.out.println("Dia Útil!");
//			break;
//			
//		case 3:
//			System.out.println("Você selecionou Quarta-feira.");
//			System.out.println("Dia Útil!");
//			break;
//			
//		case 4:
//			System.out.println("Você selecionou Quinta-feira.");
//			System.out.println("Dia Útil!");
//			break;
//			
//		case 5:
//			System.out.println("Você selecionou Sexta-feira.");
//			System.out.println("Dia Útil!");
//			break;
//			
//		case 6:
//			System.out.println("Você selecionou Sábado.");
//			System.out.println("Final de Semana!");
//			break;
//			
//		case 7:
//			System.out.println("Você selecionou Domingo.");
//			System.out.println("Final de Semana!");
//			break;
//			
//		default:
//			System.out.println("Sua seleção é inválida");
//			System.out.println("---Finalizando o sistema...----");
//			break;
		
		if(escolha<1 ||escolha>7) {
			System.out.println("Sua seleção é inválida");
			System.out.println("---Finalizando o sistema...----");
		} else if(escolha<6) {
			System.out.println("Dia Útil!");
		} else {
			System.out.println("Final de Semana!");
		}
		sc1.close();
	}

}
