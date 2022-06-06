
public class ContaBancaria {
	protected double saldo;
	
	public void calcularSaldo() { // metodo obrigatorio nas subclasses
		
	}

	//metodos acessiveis para as classes vinculadas com a principal, tanto a correste quanto a investimento tem acesso a estes metodos
	public void depositar(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double saldo) {
		saldo -= saldo;
	}
	
	public void transferir(double contaBancaria) {
		saldo -= saldo;
	}

	public double getSaldo() {
		return saldo; 
	}

	
	

	
}

