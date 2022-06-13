
public class Conta {

	private double saldo;
	private double limite;

	public Conta(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}

	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		}
		this.saldo -= valor;
		return true;
	}

	public boolean depositar(double valor) {
		if (this.saldo < valor) {
			return false;
		}
		this.saldo += valor;
		return true;

	}

	public boolean transferir(Cliente Cliente, double valor) {
		if (this.saldo < valor) {
			return false;
		}
		this.saldo -= valor;
		Cliente.getConta().depositar(valor);
		return true;

	}

	// teste com Magic numbers (MN), sao atraves de numeros retornados que vai saber
	// se a operecao funcionou, igual o navegador faz
	public int sacarMN(double valor) {
		if ((this.saldo < valor) && (this.saldo >= limite * -1)) {
			return 101;
		} else if (this.saldo < (limite * -1)) {
			return 102;
		}
		return 100;

	}

	public int transferirMN(Cliente Cliente, double valor) {
		if ((this.saldo < valor) && (this.saldo >= limite * -1)) {
			this.saldo -= valor;
			return 101;
		} else if ((this.saldo < valor) && (this.saldo >= limite * -1)) {
			return 102;
		}
		this.saldo -= valor;
		Cliente.getConta().depositar(valor); // vai enviar o valor armazenado para outra conta, e subtrai-lo da propria
		return 100;

	}

	public double getSaldo() { // mostrar saldo
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	// teste com exception
	public void sacarEX(double valor) throws ContaException { // lancando a excecao da classe de contaException, pois
																// esse metodo e perigoso de executar

		if (this.saldo < valor) { // condicoes que causarao as mensagens de erro
			throw new ContaException("Saldo Insulficiente"); // mensagem de erro que vai exibir
		} else if ((this.saldo - valor) < limite * -1) {
			throw new ContaException("Limite Insulficiente");
		}
		this.saldo -= valor; // caso as condicoes n sejam atendidas ele vai executar normalmente

	}

}
