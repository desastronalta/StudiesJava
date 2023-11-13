package Arvores;

public class ArvoreBinaria {
	public static void main(String[]args) {
		Arvore<Integer> arvore = new Arvore<Integer>();
		arvore.adicionar(10);
		arvore.adicionar(5);
		arvore.adicionar(18);
		arvore.adicionar(8);
		arvore.adicionar(17);
		arvore.adicionar(15);
		arvore.adicionar(21);
		arvore.adicionar(3);
		System.out.println("Ordenado");
		arvore.ordenado(arvore.getRaiz());
		System.out.println("preOrdenado");
		arvore.preOrdenado(arvore.getRaiz());
		System.out.println("posOrdenado");
		arvore.posOrdenado(arvore.getRaiz());
	}
}
