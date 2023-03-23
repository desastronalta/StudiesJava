package LinkedList;
import java.util.Scanner;
public class Client {
	private String cpf;
	private String nome;
	private Scanner sc = new Scanner(System.in);
	public Client (String novoCpf, String novoNome) {
		this.cpf = novoCpf;
		this.nome = novoNome;
		
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String toString() {
		return this.nome;
	}
	
}
