package LinkedList;

public class Elemento {
	private String Valor;
	private Elemento proximo;
	public Elemento(String novoValor) {
		this.Valor = novoValor;
	}
	public String getValor() {
		return Valor;
	}
	public void setValor(String Valor) {
		this.Valor = Valor;
	}
	public Elemento getProximo() {
		return proximo;
	}
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
}
