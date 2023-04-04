package complexidadeAlgoritimos;
import java.util.Random;

public class InsertionSort {
	public static void main(String[] args) {
		int tam= 5;
		int [] vetor = new int [tam];	
		Random rand = new Random();
		for(int i=0; i < vetor.length; i++) {
			vetor[i] = rand.nextInt(20);
			System.out.println(vetor[i]);
		}
		vetor = insertSort(vetor);
		System.out.println("vetor ordenado");
		for(int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}
	public static int[] insertSort(int [] vetor) {
		int valor;
		for(int i = 1; i < vetor.length; i++) {
			valor = vetor[i];
			int j = i-1;
			while(j >= 0 && vetor[j] > valor) {
				vetor[j+1] = vetor[j];
				j--;
			}
			vetor[j+1] = valor;
		}
		return vetor;
	}

}
