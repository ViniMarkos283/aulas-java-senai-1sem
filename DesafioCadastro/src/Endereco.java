
public class Endereco {

	private String rua, bairro;
	private int numero;

	public Endereco() {
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua() {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro() {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero() {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", numero=" + numero + "]";
	}
	
	

}
