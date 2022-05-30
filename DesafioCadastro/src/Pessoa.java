
public class Pessoa {

	private static String nome;
	private static int idade;

	private static int gen;

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Pessoa.nome = nome;
	}

	public static int getIdade() {
		return idade;
	}

	public static void setIdade(int idade) {
		Pessoa.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", genero =" + gen + "]";
	}

	public static void setEndereco(Endereco endereco) {
		
	}

}
