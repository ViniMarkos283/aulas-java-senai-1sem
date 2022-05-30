
public class Pessoa {

	private static String nome;
	private static int idade;

	private enum Genero {
		MASCULINO, FEMININO;

		private static int gen;

		public static void setNome(Pessoa nome) {
			nome = nome;
		}

		public static void setGen(int gen) {
			Genero.gen = gen;
		}

		public static void SetEndereco(Endereco endereco) {
			endereco.getNumero();
			endereco.getBairro();
			endereco.getRua();
		}

		@Override
		public String toString() {
			return "Pessoa [nome=" + nome + ", idade=" + idade + ", genero =" + gen + "]";
		}

	}

}
