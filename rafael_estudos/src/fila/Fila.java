package fila;

import LinkedList.*;

public class Fila<tipo> {
	private ListaLigada <tipo> lista;
	public Fila() {
		this.lista = new ListaLigada<tipo>();
	}
	public void adicionar(tipo novoValor) {
		this.lista.adicionar(novoValor);
	}
	public void remover() {
		this.lista.remover(this.get());
	}
	public tipo get() {
		return this.lista.getPrimeiro().getValor();
	}
}
