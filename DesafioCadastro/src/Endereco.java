
public class Endereco {

	private static String rua, bairro;
	private static int numero;

	public String getRua() {
		return rua;
	}

	public static void setRua(String rua) {
		Endereco.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public static void setBairro(String bairro) {
		Endereco.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public static void setNumero(int numero) {
		Endereco.numero = numero;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", numero=" + numero + "]";
	}

	public Endereco(String texto) {

		String[] arrayAuxiliar1 = texto.split(","); // o split localiza o caractere informado e quebra os espacos entre
													// esse caractere, e os armazena em variaveis
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("="); // separacao split usando o =
		this.rua = arrayAuxiliar2[1].trim(); // o trim localiza e apaga os espacos na variavel que foi pega no texto

		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.numero = Integer.parseInt(arrayAuxiliar3[1].trim());

		String[] arrayAuxiliar4 = arrayAuxiliar1[2].split("=");
		this.bairro = arrayAuxiliar4[1].trim();
	}
}
