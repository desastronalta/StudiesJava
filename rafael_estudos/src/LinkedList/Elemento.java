package LinkedList;

public class Elemento<tipo> {
	private tipo Valor;
	private Elemento <tipo> proximo;
	public Elemento(tipo novoValor) {
		this.Valor = novoValor;
	}
	public tipo getValor() {
		return Valor;
	}
	public void setValor(tipo Valor) {
		this.Valor = Valor;
	}
	public Elemento<tipo> getProximo() {
		return proximo;
	}
	public void setProximo(Elemento<tipo> proximo) {
		this.proximo = proximo;
	}
	
}
