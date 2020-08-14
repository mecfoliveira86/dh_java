
//Faça um programa que gere os dez primeiros números primos acima de 100 e
//armazene-os em um array, escrevendo ao final o array resultante.
package aula13;

public class exe7_lista2 {
	
	public static void main(String[] args) {

		int divNoRest = 0;
		
		int countCousin = 0;
		
		for(int numLista = 101; numLista <= 150; numLista++) {
			
			for(int div = 1; div <= numLista; div++) {
				
				if(numLista % div == 0) {
					divNoRest += 1;
				}
				
			}
			if(divNoRest==2) {
				countCousin += 1;
				System.out.println(numLista + " é número primo!!!");
			}
			divNoRest=0;
			
			if(countCousin == 10) {
				break;
			}
			
		}
		
	}
}

//falta adicionar os números primos localizados no Array.