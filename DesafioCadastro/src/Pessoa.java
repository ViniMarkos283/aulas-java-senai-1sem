
public class Pessoa {

	private String nome;
	private int idade;
	private Sexo sexo;
	Endereco endereco;

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [ nome = " + nome + ", idade=" + idade + ", sexo = " + sexo + ", endereco = " + endereco + "]\n";
	}

	public Pessoa(String texto) {

		String[] arrayAuxiliar1 = texto.split(","); // o split localiza o caractere informado e quebra os espacos entre
													// esse caractere, e os armazena em variaveis
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("="); // separacao split usando o =
		this.nome = arrayAuxiliar2[1].trim(); // o trim localiza e apaga os espacos na variavel que foi pega no texto

		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.idade = Integer.parseInt(arrayAuxiliar3[1].trim());

		String[] arrayAuxiliar4 = arrayAuxiliar1[2].split("=");
		this.sexo = Sexo.valueOf(arrayAuxiliar4[1].trim());

		Endereco endereco = new Endereco();
		this.endereco = endereco;

	}

	public Pessoa() {

	}

	public Endereco setEndereco(Endereco endereco) {
		return this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

// "value of" converte string para enum 
// "Integer.parseint" converte string para inteiro

}
