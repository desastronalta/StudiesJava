package test;
import java.util.Scanner;
public class TestandoJava {
	public static void main(String[]args) {
		Scanner le = new Scanner(System.in);
		System.out.println("insira uma palavra");
		String maior = "maior que 50";
		String menor = "menor que 50";
		int p = le.nextInt();
		int n =  le.nextInt();
		int soma = p + n;
		// '>' = maior que; '<' = menor que;''==' igual à; != diferente;
		if (soma < 50) {
			System.out.println(menor);
		}if (soma > 50) {
			System.out.println(maior);
		}
		soma = 0;
		int i = 0;
		while(i < 10) {
			soma += le.nextInt();
			i++;
		}
		for(i = 0; i < 10; i++) {
			
		}
		System.out.println(soma);
		le.close();
	}
}
