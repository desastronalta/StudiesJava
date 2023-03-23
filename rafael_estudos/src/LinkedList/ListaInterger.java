package LinkedList;

public class ListaInterger {
	public static void main(String[]args) {
		ListaLigada<Integer> lista = new ListaLigada<Integer>();
		lista.adicionar(1);
		lista.adicionar(3);
		lista.adicionar(7);
		lista.adicionar(9);
		lista.adicionar(2);
		lista.adicionar(5);
		System.out.println(lista.getTamanho());
		System.out.println(lista.getPrimeiro().getValor());
		System.out.println(lista.getUltimo().getValor());
		int i = 0;
		while( i < lista.getTamanho() ) {
			System.out.println(lista.Get(i).getValor() );
			i++;
		}
		lista.remover(6);
		System.out.println("apos o valor ser removido");
		 i = 0;
		while( i < lista.getTamanho() ) {
			System.out.println(lista.Get(i).getValor() );
			i++;
		}
	
	}
}
