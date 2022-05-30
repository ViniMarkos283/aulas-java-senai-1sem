
public class Pessoa {

	private static String nome;
	private static int idade;

	private enum Genero {
		MASCULINO, FEMININO;
	

	private static int gen;

	public static void setGen(int Genero) {
		gen = Genero;
	}

	public static void setNome() {
		nome = nome;
	}

	public static void setIdade() {
		idade = idade;
	}

	public static void SetEndereco(Endereco endereco) {

	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", genero =" + gen + "]";
	}
	
	
	
	}

}
