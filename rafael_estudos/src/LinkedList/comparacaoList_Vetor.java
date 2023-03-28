package LinkedList;

import java.util.ArrayList;

public class comparacaoList_Vetor {
	public static void main(String[]args) {	
		ListaLigada<Integer> lista = new ListaLigada<Integer>();
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		int limite = 1000000;
		long tempInicial = System.currentTimeMillis();
		for(int i = 0; i < limite; i++ ) {
			vetor.add(i);
		}
		long tempFinal = System.currentTimeMillis();
		System.out.println("adicionou "+ limite + " valores no vetor");
		System.out.println(tempFinal - tempInicial);
		
		tempInicial = System.currentTimeMillis();
		for(int i = 0; i < limite; i++ ) {
			lista.adicionar(i);
		}
		tempFinal = System.currentTimeMillis();
		System.out.println("adicionou "+ limite + " valores na lista");
		System.out.println(tempFinal - tempInicial);
		 //ler valores
        tempInicial = System.currentTimeMillis();
        for(int i=0; i < vetor.size(); i++){
            vetor.get(i);
        }
        tempFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura do vetor");
        System.out.println(tempFinal - tempInicial);
        
        tempInicial = System.currentTimeMillis();
        IteratorLinkedList<Integer> iterator = lista.getIterator();
        while(iterator.temProximo()){
            iterator.getProximo();
        }
        tempFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura da lista");
        System.out.println(tempFinal - tempInicial);
        
        
    }
}
	
