//Crie um programa que receba um input de teclado com uma idade e retorne maior ou menor de idade

package aula13;

import java.util.Scanner;

public class exe5 {
	public static void main(String[] args) {
		
		System.out.print("Digite seu nome: ");
		Scanner sc1 = new Scanner(System.in);
		String nome = sc1.next();
		
		System.out.print("Digite sua idade: ");
		Scanner sc2 = new Scanner(System.in);
		int idade = sc2.nextInt();
		
		System.out.println(nome+" você é:");
		
		if (idade<18) {
			System.out.println("MENOR de idade!");
		} else {
			System.out.println("MAIOR de idade!");
		}
		
		sc1.close();
		sc2.close(); //Scanner closing command in order to avoid memory error

	}

}
