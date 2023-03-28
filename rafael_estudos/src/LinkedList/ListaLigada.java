package LinkedList;

public class ListaLigada<tipo> {

	private Elemento <tipo> Ultimo;
	private Elemento <tipo> primeiro;
	private int tamanho;
	public Elemento<tipo> getUltimo() {
		return Ultimo;
	}
	public void setProximo(Elemento<tipo> proximo) {
		this.Ultimo = proximo;
	}
	public Elemento<tipo> getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Elemento<tipo> primeiro) {
		this.primeiro = primeiro;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public void adicionar(tipo  novoValor) {
		Elemento<tipo> novoElemento = new Elemento<tipo>(novoValor);
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
	public void remover(tipo valorProcurado) {
		Elemento<tipo> anterior = null;
		Elemento<tipo> atual = this.primeiro;
		for(int i = 0; i <getTamanho(); i++) {
			if(atual.getValor().equals(valorProcurado)) {
			
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
	public Elemento<tipo> Get(int posicao) {
		Elemento<tipo> atual = this.primeiro;
		for(int i = 0; i < posicao; i++) {
			if(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
				return atual;
	}
	public  IteratorLinkedList<tipo> getIterator(){
		return new IteratorLinkedList<tipo>(this.primeiro);
	}
	
}
