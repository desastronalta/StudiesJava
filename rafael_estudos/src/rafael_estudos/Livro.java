package rafael_estudos;

public class Livro {
	String nome;
	String descriçao;
	String autor;
	String isbn;
	double preço;
	String dataPub;

	void dadosLivros() {
		System.out.println("nome do livro: " + nome);
		System.out.println("descrição: " + descriçao);
		System.out.println("preço: " + preço);
		System.out.println("autor: " +autor);
		System.out.println("data de publicação: " + dataPub);
	}
}
