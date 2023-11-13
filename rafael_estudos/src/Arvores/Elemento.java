package Arvores;

public class Elemento<tipo> {
	private tipo valor;
	private Elemento<tipo> esquerda;
	private Elemento<tipo> direita;
	
	public Elemento(tipo novoValor) {
		this.valor = novoValor;
		this.esquerda = null;
		this.direita = null;
	}

	public tipo getValor() {
		return valor;
	}

	public void setValor(tipo valor) {
		this.valor = valor;
	}

	public Elemento<tipo> getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Elemento<tipo> esquerda) {
		this.esquerda = esquerda;
	}

	public Elemento<tipo> getDireita() {
		return direita;
	}

	public void setDireita(Elemento<tipo> direita) {
		this.direita = direita;
	}
	
}
