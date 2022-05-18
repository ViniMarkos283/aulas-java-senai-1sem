
public class Conta {

	String nome;
	double valor;

	public Conta(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "conta [nome = " + nome + ", valor = " + valor + "]"; // gerado pelo toString
	}

}
