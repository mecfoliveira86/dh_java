//Fa�a um programa que receba a temperatura m�dia de cada m�s do ano e
//armazene-as em um array. Mostre a maior e a menor temperatura do ano e em que m�s
//elas ocorreram (mostrar o m�s por extenso: 1 � janeiro, 2 � fevereiro, ...).
//Obs: Desconsiderar empates.


package aula13;

public class exe4_lista2 {
	
	public static void main(String[] args) {
		int [] temperaturas= {17,34,28,27,27,20,17,19,22,24,27,30};
		String [] meses= {"Janeiro","Fevereiro","Mar�o","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
		
		int temp=0;
		int ocurrence=0;
		
		for(int i=0;i<temperaturas.length;i++) {
			if(temperaturas[i]>temp) {
				temp=temperaturas[i];
				ocurrence=i;
			}
		}
		
		System.out.println("A maior temperatura foi " + temp + "�C e ocorreu no m�s " + meses[ocurrence]);
		
		temp=1000;
		ocurrence=0;
		
		for(int i=0;i<temperaturas.length;i++) {
			if(temperaturas[i]<temp) {
				temp=temperaturas[i];
				ocurrence=i;
			}
		}
		
		System.out.println("A maior temperatura foi " + temp + "�C e ocorreu no m�s " + meses[ocurrence]);
	
		
	}

}
