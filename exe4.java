//Crie um programa que receba um nome e imprima uma saudação

package aula13;

import java.util.Scanner;

public class exe4{
	public static void main(String[] args) {
	
	System.out.println("Digite seu nome");
	Scanner sc = new Scanner(System.in);
	String nome = sc.next();
	System.out.println("Seja muito bem vindo(a) "+nome+"!!!");
	
	sc.close(); //Scanner error in order to avoid memory error!
	}

}
