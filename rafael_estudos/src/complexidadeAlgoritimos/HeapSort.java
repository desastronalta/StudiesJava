package complexidadeAlgoritimos;
import java.util.Random;
public class HeapSort {

	public static void main(String[] args) {
		//heap sort utilizando recursivdade
		Random rand = new Random();
		int [] vet = new int [10];
		int n = vet.length;
		for(int i = 0; i < vet.length; i++) {
			vet[i] = rand.nextInt(10);
		}
		System.out.println("Desordenado");
		for(int i = 0; i < vet.length; i++) {
			System.out.print(" " + vet[i] + " ");
		}
		for(int i = n/2 - 1; i >= 0; i-- ) { 
			aplicarHeap(vet , n, i);
		}
		System.out.print("\n");
		System.out.println("quase ordenado");
		for(int i = 0; i < vet.length; i++) {
			System.out.print(" " + vet[i] + " ");
		}
		System.out.print("\n");
		for(int i = n-1; i > 0; i--) {
			int aux = vet[0];
			vet[0] = vet[i];
			vet[i] = aux;
			aplicarHeap(vet, i, 0);
		}
		
		System.out.println("Ordenado");
		for(int i = 0; i < vet.length; i++) {
			System.out.print(" " + vet[i] + " ");
		}
	}
	public static void aplicarHeap(int [] vet, int n, int i ) {
		int raiz = i;
		int esquerda = 2*i + 1;
		int direita = 2*i+2;
			if(esquerda < n && vet[esquerda] > vet[raiz]) {
				raiz = esquerda;
			}
			if(direita < n && vet[direita] > vet[raiz]) {
				raiz = direita ;
			}
			if(raiz != i) {
				int aux = vet[i];
				vet[i] = vet[raiz];
				vet[raiz] = aux;
				aplicarHeap(vet, n, raiz);
			}
	}
}
