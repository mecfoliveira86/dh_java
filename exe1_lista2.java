//Fa�a um programa que carregue um array de nove elementos num�ricos inteiros e
//mostre os n�meros primos e suas respectivas posi��es.


package aula13;

public class exe1_lista2 {
	public static void main(String[] args) {
		
		int[] numeros = new int[9];
		int countCousin=0;
		
		for(int i=0; i<numeros.length; i++) {
			
			numeros[i]=i+1;
			
			for(int j=1; j<=numeros[i];j++) {
				if(numeros[i]%j==0) {
					countCousin+=1;
				}
			}
			
			if(countCousin==2) {
				System.out.println(numeros[i] + ", que est� na posi��o " + i + " � PRIMO!");
			}
			
			countCousin=0;
			
			}
			
		}
	}

