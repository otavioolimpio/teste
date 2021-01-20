package Cliente;

public class Usuario {

	private String nome;
	private int cnh, cpf;
	
	public Usuario(String nome, int cnh, int cpf) {
		this.nome = nome;
		this.cnh = cnh;
		this.cpf = cpf;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCnh() {
		return cnh;
	}
	public void setCnh(int cnh) {
		this.cnh = cnh;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		String cliente = "Nome: " + getNome() + " | CNH: " + getCnh() + " | CPF: " + getCpf();
		return cliente;
	}
}
