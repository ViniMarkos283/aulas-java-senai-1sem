
public class Pessoa {

	private static String nome;
	private static int idade;
	Endereco Endereco;
	private Sexo gen;

	private enum Sexo {
		MASCULINO, FEMININO;
	}

	public Sexo getGen() {
		return gen;
	}

	public void setGen(Sexo gen) {
		this.gen = gen;
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

	public Pessoa(String texto) {

		String[] arrayAuxiliar1 = texto.split(","); // o split localiza o caractere informado e quebra os espacos entre
													// esse caractere, e os armazena em variaveis
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("="); // separacao split usando o =
		this.nome = arrayAuxiliar2[1].trim(); // o trim localiza e apaga os espacos na variavel que foi pega no texto

		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.idade = Integer.parseInt(arrayAuxiliar3[1].trim());

		String[] arrayAuxiliar4 = arrayAuxiliar1[1].split("=");
		this.gen(Sexo.valueOf(arrayAuxiliar4[1].trim()));

	}

	public Pessoa() {

	}

	public void setEndereco(Endereco endereco) {
		this.Endereco = Endereco;
	}
	
	public getEndereco() {
	return Endereco;
	}

// "value of" converte string para enum 
// "Integer.parseint" converte string para inteiro

}
