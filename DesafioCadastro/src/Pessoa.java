
public class Pessoa {

	private static String nome;
	private static int idade;

	public enum sexo {
		MASCULINO(1), FEMININO(2);

		private int gen;

		sexo(int gen) {
			this.gen = gen;
		}

		public int getGen() {
			return gen;
		}

		public void setGen(int gen) {
			this.gen = gen;
		}
		
	}

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
		return "Pessoa [nome = " + nome + ", idade = " + idade + ", genero = " + " ]";
	}

	public Endereco getRua(Endereco rua) {
		return rua;
	}

	public static void setRua(String rua) {
		Endereco.setRua(rua);
	}

	public Endereco getBairro(Endereco bairro) {
		return bairro;
	}

	public static void setBairro(String bairro) {
		Endereco.setBairro(bairro);
	}

	public Endereco getNumero(Endereco numero) {
		return numero;
	}

	public static void setNumero(int numero) {
		Endereco.setNumero(numero);
	}
	
	public Pessoa(String texto) {

		String[] arrayAuxiliar1 = texto.split(","); // o split localiza o caractere informado e quebra os espacos entre
													// esse caractere, e os armazena em variaveis
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("="); // separacao split usando o =
		this.nome = arrayAuxiliar2[1].trim(); // o trim localiza e apaga os espacos na variavel que foi pega no texto

		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.idade = Integer.parseInt(arrayAuxiliar3[1].trim());
		
		String[] arrayAuxiliar4 = arrayAuxiliar1[1].split("=");
		this.Sexo = sexo.valueOf(arrayAuxiliar4[1].trim());

	}

	// "value of" converte string para enum
	// "Integer.parseint" converte string para inteiro

}
