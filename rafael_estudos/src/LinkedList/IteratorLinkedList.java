package LinkedList;

public class IteratorLinkedList<tipo> {
	private Elemento<tipo> elemento;
	
	public IteratorLinkedList(Elemento<tipo> atual) {
		this.elemento = atual;
	}
	
	public boolean temProximo() {
		if(elemento.getProximo()==null) {
			return false;
		}else {
			return true;
		}
	}
	
		public Elemento<tipo> getProximo(){
			elemento =elemento.getProximo();
		return elemento;
	}
}
