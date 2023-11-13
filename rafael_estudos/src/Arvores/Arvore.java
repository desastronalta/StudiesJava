package Arvores;

public class Arvore<tipo extends Comparable> { 
	private Elemento<tipo> raiz;
	
	public Arvore() {
		this.raiz = null;
	}
	public void adicionar(tipo valor) {
		Elemento<tipo> novoElemento = new Elemento<tipo>(valor);
		if(raiz == null) {
			this.raiz = novoElemento;
		}else {
			Elemento<tipo> atual = this.raiz;
			while(true) {
				if (novoElemento.getValor().compareTo(atual.getValor())== -1) {
					if(atual.getEsquerda() != null) {
						atual = atual.getEsquerda();
					}else{
						atual.setEsquerda(novoElemento);
						break;
					}
				}else{
					if(atual.getDireita() != null) {
						atual = atual.getDireita();
					}else {
						atual.setDireita(novoElemento);
						break;
					}
				}
			}
		}
	}
	
	public Elemento<tipo> getRaiz(){
		return raiz;
	}
	
	public void ordenado(Elemento<tipo> atual) {
		if(atual != null){
			ordenado(atual.getEsquerda());
			System.out.println(atual.getValor());
			ordenado(atual.getDireita());
		}
	}
	public void posOrdenado(Elemento<tipo> atual) {
		if(atual != null) {
			posOrdenado(atual.getEsquerda());
			posOrdenado(atual.getDireita());
			System.out.println(atual.getValor());
		}
	}
	public void preOrdenado(Elemento<tipo> atual) {
		if(atual != null) {
			System.out.println(atual.getValor());
			posOrdenado(atual.getEsquerda());
			posOrdenado(atual.getDireita());
		}
	}
	
	public boolean remover(tipo valor) {
		//busca elemento na arvore
		Elemento<tipo> atual = this.raiz;
		Elemento<tipo> paiAtual = null;
		while(atual != null) {
			if(atual.getValor().equals(valor)) {
				break;
			}else if(valor.compareTo(atual.getValor()) == -1) {
				paiAtual = atual;
				atual = atual.getEsquerda();
			}else {
				paiAtual = atual;
				atual = atual.getDireita();
			}
		}
		//verica se existe o elemento
		if(atual != null) {
			if(atual.getDireita() != null) {
				
				Elemento<tipo> substituto = atual.getDireita();
				Elemento<tipo> paiSubstituto = atual;
				while(substituto.getEsquerda() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getEsquerda();
				}
				substituto.setEsquerda(atual.getEsquerda());
				if(paiAtual != null) {
					// atual < paiAtual
					if(atual.getValor().compareTo(paiAtual.getValor()) == -1) {
						paiAtual.setEsquerda(substituto);
					}else paiAtual.setDireita(substituto);
				}else {//se nao tem pai atual entao é raiz
					this.raiz = substituto;
					paiSubstituto.setEsquerda(null);
					this.raiz.setDireita(paiSubstituto);
					this.raiz.setEsquerda(atual.getEsquerda());
				}
				
				//removeu o elemento
				//paiSubstituto > substituto 
				if(substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) {
					paiSubstituto.setEsquerda(null);
				}else paiSubstituto.setDireita(null);
			}
			//tem filho só a esquerda
			else if(atual.getEsquerda() != null) {
				Elemento<tipo> substituto = atual.getEsquerda();
				Elemento<tipo> paiSubstituto = atual;
				while(substituto.getDireita() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getDireita();
				}
				if(paiAtual !=  null) {
					//atual < paiAtual
					if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {
						paiAtual.setEsquerda(substituto);
					}else paiAtual.setDireita(substituto);
				// se for raiz
				}else this.raiz = substituto;
			// removeu o elemento da arvore 
				//substituto < paiSubstituto
				if(substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) {
					paiSubstituto.setEsquerda(null);
				}else paiSubstituto.setDireita(null);
			
			}else {// don't has sun
				if(paiAtual != null){
					if(atual.getValor().compareTo(paiAtual.getValor()) == -1) {//atual < paiAtual
						paiAtual.setEsquerda(null);
					}else paiAtual.setDireita(null);
				}else this.raiz = null; // é a raiz
			}
			return true;
		}else return false;
		
	}
}
