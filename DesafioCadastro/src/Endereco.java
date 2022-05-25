
public class Endereco {

	private static String rua, bairro;
	private static int numero;

	public String getRua() {
		return rua;
	}

	public static void setRua(String rua) {
		rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public static void setBairro(String bairro) {
		bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public static void setNumero(int numero) {
		numero = numero;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", numero=" + numero + "]";
	}
	
	

}
