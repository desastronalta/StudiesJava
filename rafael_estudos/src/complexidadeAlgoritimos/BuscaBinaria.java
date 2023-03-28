package complexidadeAlgoritimos;

import java.util.Scanner;

public class BuscaBinaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam = 1000000;
		int [] vetor = new int [tam];
		int buscado = sc.nextInt();
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = i*2;
		}
		int counter = 0;
		boolean find = false;
		int inicio = 0;
		int fim = vetor.length-1;
		int meio;
		while(inicio <= fim) {
			meio = (int)((inicio + fim)/2);
			if (vetor[meio] == buscado) {
				find = true;
				break;
			}else if(vetor[meio] < buscado ) {
				inicio = meio+1;
			}else {
				fim = meio-1;
			}
			counter ++;
		}
		if(find == true) {
			System.out.println("O numero buscado foi encontrado");
		}else {
			System.out.println("O numero buscado nao foi encontrado");
		}
		System.out.println("o numero de buscas foi: " + counter);
		sc.close();
	}

}
