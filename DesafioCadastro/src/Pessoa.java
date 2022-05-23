
public class Pessoa {

	private String nome;
	private int idade;
	
	public Pessoa() {
		this.nome = nome;
		this.idade = idade;
		this.gen = gen;
	}

	private enum Genero {
		MASCULINO, FEMININO;
	}

	private int gen;

	public void setGen(int Genero) {
		this.gen = gen;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public static void SetEndereco(Endereco pessoa) {
	
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", genero =" + gen + "]";
	}
	
	
	
	

}
