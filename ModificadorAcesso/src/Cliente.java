import java.util.Objects;

public class Cliente {
	
	private String nome;
	private int cpf;
	private int numConta;
	
	
	//gerado pelo constructor do source
	public Cliente() {
		
	}

	//gerados pelo source > getter e setter: retorna e pega dados dos atributos
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


	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	// gerado pelo source > toString
	@Override // significa sobrescrita, le a classe filho ao inves do pai
	public String toString() {
		return "Cliente: \n nome = " + nome + ", \n CPF = " + cpf + ", \n Numero da conta = " + numConta + "\n *********************************";
	}

	
	//gerado pelo hashcode e equal
	@Override
	public int hashCode() { // o hashcode retorna um inteiro informando a localizacao da informacao desejada
		return Objects.hash(cpf, nome, numConta);
	}

	@Override
	public boolean equals(Object obj) { // o equals faz a comparacao
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta; // Esse && e o E, precisa atingir as tres condicoes para dar true.
	}
	
	
	
	
	
}
