package Grafos;

import java.util.ArrayList;

public class Vertice<T> {
	private T dado;
	private ArrayList<Arestas<T>> arestaEntrada;
	private ArrayList<Arestas<T>> arestaSaida;
	
	public Vertice(T valor) {
		this.dado = valor;
		this.arestaEntrada = new ArrayList<Arestas<T>>();
		this.arestaSaida = new ArrayList<Arestas<T>>();
	}

	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}
	
	 public void adicionarArestaEntrada(Arestas<T> aresta){
	        this.arestaEntrada.add(aresta);
	    }
	    
	    public void adicionarArestaSaida(Arestas<T> aresta){
	        this.arestaSaida.add(aresta);
	    }

	    public ArrayList<Arestas<T>> getArestasEntrada() {
	        return arestaEntrada;
	    }

		public ArrayList<Arestas<T>> getArestasSaida() {
	        return arestaSaida;
	    }
}
