//Crie um programa que verifique se a pessoa tem todos os requisitos para dirigir

package aula13;

import java.util.Scanner;

public class exe7 {
	public static void main(String[] args) {
		System.out.println("----Verifica��o de permiss�o de condutor----");
		System.out.println("Digite seu nome: ");
		Scanner sc_nome = new Scanner(System.in);
		String nome= sc_nome.next().toUpperCase();		
		
		System.out.println("Digite sua idade: ");
		Scanner sc_idade = new Scanner(System.in);
		int idade = sc_idade.nextInt();
		
		if(idade>=18) {
			System.out.println("Possui CPF e RG? (Digite S para Sim ou N para n�o)");
			Scanner sc_doctos = new Scanner(System.in);
			String doctos = sc_doctos.next().toUpperCase();
			
			if(doctos.equals("S")) {
				System.out.println("Voc� � alfabetizado? (Digite S para Sim ou N para n�o)");
				Scanner sc_alfabeto = new Scanner(System.in);
				String alfabeto = sc_alfabeto.next().toUpperCase();	

				if(alfabeto.equals("S")) {				
				
					System.out.println("Voc� tem CNH? (Digite S para Sim ou N para n�o)");
					Scanner sc_cnh = new Scanner(System.in);
					String cnh= sc_cnh.next().toUpperCase();
					
					if(cnh.equals("S")) {
						System.out.println("Qual o tipo de sua CNH?");
						Scanner sc_tipo = new Scanner(System.in);
						String tipo = sc_tipo.next().toUpperCase();
						
						switch(tipo) {
						case "A":
							System.out.println("Voc� pode conduzir ve�culo motorizado de 2 ou 3 rodas, como motos ou triciclos!");
							break;
							
						case "B":
							System.out.println("Voc� pode conduzir ve�culo motorizado cujo peso total n�o deve excede 3.500 kg, com lota��o m�xima de 8 ocupantes, ou seja carros de passeio!");
							break;
							
						case "C":
							System.out.println("Voc� pode conduzir ve�culo motorizado utilizado para transporte de carga, com o peso bruto para al�m de 3500 kg!");
							break;
							
						case "D":
							System.out.println("Voc� pode conduzir ve�culo motorizado que atua com transporte de passageiros em ve�culo com mais de 8 lugares.!");
							break;
							
						case "E":
							System.out.println("Voc� pode conduzir ve�culo motorizado que se enquadre nas categorias B, C ou D e sobre o qual esteja acoplada uma carroceria reboque, semi-reboque ou articulada com 6000 kg ou mais.");
							break;
							
						default:
							System.out.println("Tipo de CNH n�o reconhecido!");
							break;
						
						}
						
						sc_tipo.close();
						
						} else {
							System.out.println(nome+", voc� n�o possui CNH! � proibido conduzir ve�culo automotor sem CNH!!!");
							sc_cnh.close();
							
							}
				} else {
					System.out.println(nome+", voc� n�o � alfabetizado! Este � um dos requisitos b�sicos para conseguir permiss�o de condutor de um ve�culo!!!");
					sc_alfabeto.close();
					}
			}else{
				System.out.println(nome+", voc� n�o possui os documentos m�nimos para conseguir sua CNH!!! N�o pode dirigir!");
				sc_doctos.close();
			}
		}else {
			System.out.println(nome+" A idade m�nima para ter CNH � 18 anos completos. Infelizmente voc� n�o pode dirigir!");
	}

		System.out.println("----LEMBRETE----");
		System.out.println("Para poder conduzir um ve�culo automotor no Brasil � necess�rio cobrir os seguintes requisitos:");
		System.out.println("1-Ter 18 anos completos;");
		System.out.println("2-Ser alfabetizado");
		System.out.println("3-Ter RG e CPF");
				
		sc_nome.close();
		sc_idade.close(); //Scanner close in order to avoid memory error
	}
}