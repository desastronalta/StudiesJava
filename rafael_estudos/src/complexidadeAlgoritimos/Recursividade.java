package complexidadeAlgoritimos;

public class Recursividade {

	public static void main(String[] args) {
		int [] vet = new int [5];
		for(int i= 0; i < vet.length; i++) {
			vet[i] = (int ) (Math.random() * 100);
		}
		for(int i= 0; i < vet.length; i++) {
			System.out.println(vet[i]);		}
		System.out.println(somar(0 ,0, vet));
	}
	public static int somar(int soma ,int posicao ,int [] vetor) {
		if(posicao < vetor.length) {
			soma += vetor[posicao];
			return somar(soma, posicao+1, vetor);
		}else {
		return soma;
		}
	}
}
