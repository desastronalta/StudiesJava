package LinkedList;

public class ListaLigada {

	private Elemento Ultimo;
	private Elemento primeiro;
	private int tamanho;
	public Elemento getUltimo() {
		return Ultimo;
	}
	public void setProximo(Elemento proximo) {
		this.Ultimo = proximo;
	}
	public Elemento getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public void adicionar(String  novoValor) {
		Elemento novoElemento = new Elemento(novoValor);
		if(this.primeiro == null && this.Ultimo == null) {
			this.primeiro = novoElemento;
			this.Ultimo = novoElemento;	
		}
		else {
		this.Ultimo.setProximo(novoElemento);
		this.Ultimo = novoElemento;
		}
		this.tamanho ++;
	}
	public void remover(String valorProcurado) {
		Elemento anterior = null;
		Elemento atual = this.primeiro;
		for(int i = 0; i <getTamanho(); i++) {
			if(atual.getValor().equalsIgnoreCase(valorProcurado)) {
			
				if(this.tamanho==1) {
					this.primeiro = null;
					this.Ultimo = null;
				}
				else if(atual == primeiro) {
					this.primeiro = atual.getProximo();
				}
				else if(atual == Ultimo) {
					this.Ultimo = anterior;
					anterior.setProximo(null);
				}
				anterior.setProximo(atual.getProximo());
				atual = null;
				
				break;
			}
			anterior=atual;
			atual=atual.getProximo();
			
		}
	}
	public Elemento Get(int posicao) {
		Elemento atual = this.primeiro;
		for(int i = 0; i < posicao; i++) {
			if(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
				return atual;
	}
	
}
