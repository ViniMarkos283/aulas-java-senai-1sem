
public class main {

	public static void main(String[] args) {
		
		
		Pessoa pessoa1 = new Pessoa(); // o new cria um novo espaço na heap, a stack guarda o endereço do objeto, sem ele o objeto se perde
		
		pessoa1.nome = "Marcos"; // nome da pessoa
		pessoa1.numFigurinhas = 1; // quantia de figs que já possui
		
		pessoa1.receber(3);
		
		System.out.println("Usuário: " + pessoa1.nome);
		System.out.println("Saldo de figurinhas: " + pessoa1.numFigurinhas);
		
		Pessoa pessoa2 = new Pessoa(); // fez outra pessoa, a que vai pegar as figs
		
		pessoa2.nome = "Junin";
		pessoa2.numFigurinhas = 5; // figs que ela já possui
		
		System.out.println("Usuário: " + pessoa2.nome);
		System.out.println("Saldo de figurinhas: " + pessoa2.numFigurinhas);
		
		pessoa1.dar(4, pessoa2); // é por causa desse comando que o pessoa passou a ser o pessoa2
		
		if (pessoa1.numFigurinhas >= 0) { // comando IF, é o SE só que do java
			
			System.out.println("");
		System.out.println("transferência aceita com sucesso! os novos valores agora são:");
		System.out.println("");
		
		System.out.println("Usuário: " + pessoa1.nome);
		System.out.println("Saldo de figurinhas: " + pessoa1.numFigurinhas);
		
		System.out.println("Usuário: " + pessoa2.nome);
		System.out.println("Saldo de figurinhas: " + pessoa2.numFigurinhas);
		}
		
		else { // ELSE é o senão do java
			
			System.out.println("");
			System.out.println("transferência recusada, o saldo de nenhum usuário pode ficar negativo");
		}
		
		//metodo alternativo part2
		//aqui o retorno precisa ser true pra informação aparecer.
		//o  true precisa ser uma condição do if no Main.
	}

}
