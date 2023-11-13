package complexidadeAlgoritimos;
import java.util.Random;
public class SelectSort {

	public static void main(String[] args) {
		int tam= 5;
		int [] vetor = new int [tam];	
		Random rand = new Random();
		for(int i=0; i < vetor.length; i++) {
			vetor[i] = rand.nextInt(10);
			System.out.println(vetor[i]);
		}
		int menorPos, aux;
		for(int i = 0; i < vetor.length; i++) {
			menorPos = i;
			for(int j = i+1; j < vetor.length; j++) {
				if(vetor[j] < vetor[menorPos]){
					menorPos = j;
				}
			}
			aux = vetor[menorPos];
			vetor[menorPos] = vetor[i];
			vetor[i] = aux;
		}
		System.out.println("vetor ordenado");
		for(int i=0; i < vetor.length; i++) {
			
			System.out.println(vetor[i]);
		}
	}
}
