
public class Sabonete {
	// comanda: guardar os dados no txt e dps transforma-los novamente em variaveis
	// por meio dos metodos de quebra

	private String cheiro, cor;

	public Sabonete(String cheiro, String cor) { // () = construtor, e importante deixar os parametos com as informacoes
													// para
													// que de possam preenche-las no main
		this.cheiro = cheiro;
		this.cor = cor;
	}

	@Override
	public String toString() { // toString, converte varias strings em uma s�
		return "Sabonete: cheiro = " + cheiro + ", cor = " + cor + "\n";
	}

	public Sabonete(String texto) {

		String[] arrayAuxiliar1 = texto.split(","); // o split localiza o caractere informado e quebra os espacos entre
													// esse caractere, e os armazena em variaveis
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("="); // separacao split usando o =
		this.cheiro = arrayAuxiliar2[1].trim(); // o trim localiza e apaga os espacos na variavel que foi pega no texto

		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.cor = arrayAuxiliar3[1].trim();

	}

}
