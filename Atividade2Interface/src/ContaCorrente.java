
public class ContaCorrente extends ContaBancaria {

	@Override
	public void calcularSaldo() { // sobescrita do metodo obrigatório
		saldo = saldo * 0.9;
		super.calcularSaldo(); // leva o valor para a superclasse
	}
	
	
	
	
	
	
	
}
