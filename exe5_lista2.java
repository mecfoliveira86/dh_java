//Fa�a um programa que receba o n�mero sorteado em um dado durante 20 jogadas,
//mostre os n�meros sorteados e a frequ�ncia com que aparecem.

package aula13;

import java.util.Random;

public class exe5_lista2 {
	
	public static void main(String[] args) {
		
		int[] sorteio = new int[20];
		Random gerador=new Random();
		int repete=0;
		
		for(int i=0;i<20;i++) {
			int numDado = gerador.nextInt(6)+1;
			sorteio[i]=numDado;
		}
		
		System.out.println("Contagem dos sorteios do dado �:");
		
		for(int k=1; k<7;k++) {
			for(int j=0; j<sorteio.length;j++) {
				
				if(sorteio[j]==k) {
					repete+=1;
				}
			}
			System.out.println("O n�mero " + k + " foi sorteado " + repete + " vezes!");
			repete=0;
		}
		
		System.out.println("Foram realizados " + sorteio.length + "!");
	}
}