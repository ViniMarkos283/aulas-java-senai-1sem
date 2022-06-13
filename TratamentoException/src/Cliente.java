
public class Cliente {

	private String nome;
	private int cpf;
	private Conta conta;

	public Cliente(String nome, int cpf, Conta conta) {
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
