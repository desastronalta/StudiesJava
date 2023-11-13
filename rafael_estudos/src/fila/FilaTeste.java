package fila;

public class FilaTeste {
	public static void main(String[]args) {
		Fila<String> fila = new Fila<String>();
		fila.adicionar("jao");
		fila.adicionar("alex");
		fila.adicionar("rafael");
		fila.adicionar("maria");
		
		System.out.println("primeiro da fila " + fila.get());
		fila.remover();
		System.out.println("novo primeiro da fila" + fila.get());
	}
}
