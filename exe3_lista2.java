//Faça um programa que carregue de maneira ordenada (crescente) um array de 8
//elementos.

package aula13;

import java.util.Arrays;

public class exe3_lista2 {
	public static void main(String[] args) {
	
		int[] numeros = {8,1,2,7,6,3,5,4};
		System.out.println("O Array tem os seguintes números:");
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Na posição " + (i+1) + ", temos o número "+numeros[i]);
		}
		
		Arrays.sort(numeros,0,8);
		
		
		System.out.println("------------");
		System.out.println("Ordenando os números de forma crescente:");
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Na posição " + (i+1) + ", temos o número "+numeros[i]);
		}
		
	}
}
