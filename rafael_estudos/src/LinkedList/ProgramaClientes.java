package LinkedList;

public class ProgramaClientes {
	public static void main(String[]args) {
		ListaLigada<Client> cliente = new ListaLigada<Client>();
		cliente.adicionar(new Client("342","rafa"));
		cliente.adicionar(new Client("324","ravi"));
		cliente.adicionar(new Client("243","jose"));
		cliente.adicionar(new Client("423","kaique"));
		int i = 0;
		while( i < cliente.getTamanho() ) {
			System.out.println(cliente.Get(i).getValor() );
			i++;
		}
	}
}
