
public class Aplicacao {

	public static void main(String[] args) {
		
		// Item Item = new Item();
		
		Item item = new Cogumelo(); // o primeiro já cria a variavel
		item.pegar(); // exibe o conteuco colocado lá na classe do cogumelo, mas o metodo usado em todos é o mesmo
		
		item = new Moeda(); // na segunda não precisa, porque já foi feita na primeira vez, tamo só reutilizando
		item.pegar();
		
		item = new Diamante();
		item.pegar();
		
		
		
		
		
	}

}
