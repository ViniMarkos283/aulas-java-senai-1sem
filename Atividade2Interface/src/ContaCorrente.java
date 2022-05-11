
public class ContaCorrente extends ContaBancaria {

	@Override
	public void calcularSaldo() {
		saldo = saldo * 0.9;
		super.calcularSaldo();
	}
	
	
	
	
	
	
	
}
