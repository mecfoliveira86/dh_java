//Faça um programa que carregue um array com oito números inteiros e mostre dois
//arrays resultantes. O primeiro array resultante deve conter os números positivos. O
//segundo array resultante deve conter os números negativos. Cada array resultante vai
//ter no máximo oito posições, sendo que nem todas devem obrigatoriamente serem
//utilizadas.

package aula13;

public class exe2_lista2 {
	
	public static void main(String [] args) {
		int [] numeros= {-4, -3, -2, -1, 1, 2, 3, 4};
		int [] positivos=new int[8];
		int [] negativos = new int[8];
		
		for(int i=0; i<numeros.length;i++) {
			if(numeros[i]>=0) {
				positivos[i]=numeros[i];
			}
		}
		
		for(int k=0; k<numeros.length;k++) {
			if(numeros[k]<0) {
				negativos[k]=numeros[k];
			}
		}
				
			
		System.out.println("Os números referência foram:");
		for(int j=0; j<numeros.length;j++) {
			System.out.print(numeros[j]+",");
		}
		System.out.println();
		
		System.out.println("Os números Positivos extraídos são:");
		for(int j=0; j<positivos.length;j++) {
			System.out.print(positivos[j]+",");
		}
		System.out.println();
		System.out.println("Os números Negativos extraídos são:");
		for(int j=0; j<negativos.length;j++) {
			System.out.print(negativos[j]+",");
		}
		
	}

}
