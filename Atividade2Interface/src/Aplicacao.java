
public class Aplicacao {

	public static void main(String[] args) {
		
		ContaBancaria bancaria = new ContaCorrente(); //instancia do contaCorrente pelo ContaBancaria
		bancaria.depositar(200); //metodo depositar
		bancaria.sacar(0); //metodo sacar
		bancaria.transferir(0); //metodo transferir
		System.out.println("conta corrente > Saldo atual: " + bancaria.getSaldo());
		
		
		bancaria = new ContaInvestimento(); //instancia do ContaInvestimento, reaproveitando o ContaBancaria usado lá em cima
		bancaria.depositar(0);
		bancaria.sacar(0);
		bancaria.transferir(0);
		System.out.println("conta investimento > Saldo atual: " + bancaria.getSaldo());		
		
		
		
		
		
	}

}
