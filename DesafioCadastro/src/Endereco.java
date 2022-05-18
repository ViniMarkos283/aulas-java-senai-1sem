
public class Endereco {

	String rua, bairro;
	int numero;

	public Endereco(String rua, String bairro, int numero) {
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", numero=" + numero + "]";
	}
	
	

}
