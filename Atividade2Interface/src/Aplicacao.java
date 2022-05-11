
public class Aplicacao {

	public static void main(String[] args) {
		
		ContaBancaria bancaria = new ContaCorrente();
		bancaria.depositar(200);
		bancaria.sacar(0);
		bancaria.transferir(0);
		System.out.println("conta corrente > Saldo atual: " + bancaria.getSaldo());
		
		
		bancaria = new ContaInvestimento();
		bancaria.depositar(0);
		bancaria.sacar(0);
		bancaria.transferir(0);
		System.out.println("conta investimento > Saldo atual: " + bancaria.getSaldo());		
		
		
		
		
		
	}

}
