package LinkedList;

public class singState {
	public static void main(String[]args) {
		
		ListaLigada lista = new ListaLigada();
		lista.adicionar("AC");
		lista.adicionar("BA");
		lista.adicionar("SP");
		lista.adicionar("PR");
		lista.adicionar("RS");
		lista.adicionar("ES");
		System.out.println(lista.getTamanho());
		System.out.println(lista.getPrimeiro().getValor());
		System.out.println(lista.getUltimo().getValor());
		int i = 0;
		while( i < lista.getTamanho() ) {
			System.out.println(lista.Get(i).getValor() );
			i++;
		}
		lista.remover("ba");
		System.out.println("lista com o elemento removed \n\n\n");
		 i = 0;
		while( i < lista.getTamanho() ) {
			System.out.println(lista.Get(i).getValor() );
			i++;
		}
	}
}
