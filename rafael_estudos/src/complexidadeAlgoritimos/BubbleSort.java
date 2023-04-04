package complexidadeAlgoritimos;

import java.util.Random;

public class BubbleSort {
	public static void main(String[]args) {
		int tam= 10;
		int [] vetor = new int [tam];	
		Random rand = new Random();
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = rand.nextInt(20);
			System.out.println(vetor[i]);
		}
		
		vetor = bubbleSort(vetor); 
		System.out.println("vetor ordenado");
		for(int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
	}
	//BUBBLESORT
	public static int [] bubbleSort(int [] vetor) {
		int valor;
		for(int i = 0; i < vetor.length;i++){ // O(n)
			for(int j = i+1; j < vetor.length; j++) {//O(n)
				if(vetor[i] > vetor[j]) {
					valor = vetor[j]; 
					vetor[j]= vetor[i];
					 vetor[i] = valor;

				}
			}
		}
		return vetor;
	}
}
