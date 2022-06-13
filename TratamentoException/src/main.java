
public class main {

	public static void main(String[] args) {

		Conta conta1 = new Conta(1200, 100);
		Conta conta2 = new Conta(2500, 2000);

		Cliente cliente1 = new Cliente("Thiago", 99999999, conta1);
		Cliente cliente2 = new Cliente("Joel", 88888888, conta2);

		// teste com boleano
		if (cliente1.getConta().sacar(100) == true) {
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Saque nao realizado, vc n possui saldo o suficiente para essa operacao!");
		}
		System.out.println("Saldo Atual: " + cliente1.getConta().getSaldo() + "\n");

		
		// teste com Magic Number
		switch (cliente1.getConta().sacarMN(100)) {
		case 100:
			System.out.println("Saque realizado com sucesso!\n");
			break;
		case 101:
			System.out.println("Saque realizado com sucesso, mas com o uso do limite\n");
			break;
		case 102:
			System.out.println("Saque não realizado, voce superou o seu limite!\n");
			break;
		}
		
		// teste com exception
		// "throws declaration" joga a responsabilidade para quem chamou o metodo, para ele tratar os erros
		//try catch o proprio programador trata os erros usando seus exceptions (aqui ele e a classe "ContaException"
		
		try { //try protege a operacao / gerado pelo try catch
			cliente1.getConta().sacarEX(10000);
		} catch (ContaException e) { // o "e" e o evento, 
			e.printStackTrace(); // vai exibir a mensagem de erro la do exception (stack trace significa rastreio de pilha)
			
			System.out.println("Nao foi possivel realizar esta operacao: " + e.getMessage()); // e.get captura a mensagem de erro
		}
		//na parte dos erros do stack trace mostra a linha que quebrou ex: main.java:39
		//nos foruns colocar a linha de codigo e a linguagem e a IDE usada
	}
}
