
public class ContaInvestimento extends ContaBancaria{

	@Override
	public void calcularSaldo() {  // sobescrita do metodo obrigatório
		saldo = saldo * 1.05;
		super.calcularSaldo(); // leva o valor para a superclasse
	}
	
	
	
	
	
}
