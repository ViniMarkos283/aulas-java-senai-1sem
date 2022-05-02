
public class main {

	public static void main(String[] args) {

		//variável (nome da classe) + endereço = construtor de objeto
		ContaBancaria conta1 = new ContaBancaria();
		
//		conta1.ativo = true;
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50;
//		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo); 
		
//		//informa o valor a receber
//		conta1.receber(100.8); 
//		
//		//valor a dar
//		conta1.dar(72.5);
		
		//mostra na tela o saldo
//		System.out.println(conta1.saldo());
//		
//		ContaBancaria conta2 = new ContaBancaria();
//	
//		System.out.println(conta2.saldo());
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Marcos");
		cliente1.setCpf(74554645);
		cliente1.setNumConta(74554645);
		
		//mostra dados separados
//		System.out.println(cliente1.getNome());
//		System.out.println(cliente1.getCpf());
//		System.out.println(cliente1.getNumConta());
		
		System.out.println(cliente1);
	
		//independente de quantos cliente tiver, a formula funciona msm assim
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("Marcos");
		cliente2.setCpf(7455645);
		cliente2.setNumConta(74554645);
		
		System.out.println(cliente2);
		
//		cliente2 = cliente1;
		
		//mostra tudo de uma vez
		//System.out.println(cliente.toString());
		
		if (cliente1 == cliente2) { //compara o endereço dos objetos
			System.out.println("Os objetos são iguais"); //  só ficará igual quando ambos objetos apontam pro msm endereço
		}else {
			System.out.println("Os objetos são diferentes"); // os objetos sempre serão diferentes, só os dos atributos são iguais
		}
		
		if (cliente1.getNome() == cliente2.getNome()) { //compara apenas o atributo nome
			System.out.println("Os nomes são iguais"); 
		}else {
			System.out.println("Os nomes são diferentes");
		}
		
		if (cliente1.equals(cliente2)) { // o equal compara todos os atributos dos objetos
			System.out.println("Os atributos dos objetos são iguais");
		}else {
			System.out.println("Os atributos dos objetos são diferentes");
		}
		
		
	}

}
