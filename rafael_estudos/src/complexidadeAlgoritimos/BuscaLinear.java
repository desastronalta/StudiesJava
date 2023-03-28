package complexidadeAlgoritimos;

import java.util.Scanner;

public class BuscaLinear {

	public static void main(String[] args) {
		//busca Lineaar
		boolean falso = true;
		int tam = 8;
		int [] vetor = new int [tam];
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random()*4);
		}
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] ==valor) {
				System.out.println("o valor foi encontrado");
				falso = false;
				break;
			}
		}
		if(falso) {
			System.out.println("o valor nao foi encontrado");
		}
		
		
		sc.close();
	}
}
