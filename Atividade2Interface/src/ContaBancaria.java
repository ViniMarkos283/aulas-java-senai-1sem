
public class ContaBancaria {
	protected double saldo;
	
	public void calcularSaldo() {
		
	}

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

