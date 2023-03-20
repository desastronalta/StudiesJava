package rafael_estudos;

public class principal {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.nome = "josue peixera";
		livro.descriçao = "aventuras de josué peixera";
		livro.isbn = "124154254134";
		livro.preço = 45.95;
		livro.autor = "fábinho rato";
		livro.dataPub = "15/05/2020";
		
		livro.dadosLivros();
	}

}
