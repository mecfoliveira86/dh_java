//Crie um programa que, dado um dia da semana, verifique se � final de semana.

package aula13;

import java.util.Scanner;

public class exe6 {
	public static void main(String[] args) {
		System.out.println("Verificador de Dia da Semana");
		System.out.println("----OP��ES----");
		System.out.println("[1] - Segunda-feira");
		System.out.println("[2] - Ter�a-feira");
		System.out.println("[3] - Quarta-feira");
		System.out.println("[4] - Quinta-feira");
		System.out.println("[5] - Sexta-feira");
		System.out.println("[6] - S�bado");
		System.out.println("[7] - Domingo");
		
		System.out.println("Fa�a sua escolha: ");
		
		Scanner sc1 = new Scanner(System.in);
		int escolha = sc1.nextInt();
		
//		Resolution with SWITCH		
//		
//		switch(escolha) {
//		case 1:
//			System.out.println("Voc� selecionou Segunda-feira.");
//			System.out.println("Dia �til!");
//			break;
//			
//		case 2:
//			System.out.println("Voc� selecionou Ter�a-feira.");
//			System.out.println("Dia �til!");
//			break;
//			
//		case 3:
//			System.out.println("Voc� selecionou Quarta-feira.");
//			System.out.println("Dia �til!");
//			break;
//			
//		case 4:
//			System.out.println("Voc� selecionou Quinta-feira.");
//			System.out.println("Dia �til!");
//			break;
//			
//		case 5:
//			System.out.println("Voc� selecionou Sexta-feira.");
//			System.out.println("Dia �til!");
//			break;
//			
//		case 6:
//			System.out.println("Voc� selecionou S�bado.");
//			System.out.println("Final de Semana!");
//			break;
//			
//		case 7:
//			System.out.println("Voc� selecionou Domingo.");
//			System.out.println("Final de Semana!");
//			break;
//			
//		default:
//			System.out.println("Sua sele��o � inv�lida");
//			System.out.println("---Finalizando o sistema...----");
//			break;
		
		if(escolha<1 ||escolha>7) {
			System.out.println("Sua sele��o � inv�lida");
			System.out.println("---Finalizando o sistema...----");
		} else if(escolha<6) {
			System.out.println("Dia �til!");
		} else {
			System.out.println("Final de Semana!");
		}
		sc1.close();
	}

}
