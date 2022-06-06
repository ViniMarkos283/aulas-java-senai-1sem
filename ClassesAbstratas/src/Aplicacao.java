
public class Aplicacao {

	public static void main(String[] args) {
		
		// Item Item = new Item();
		
		Item item = new Cogumelo(); // o primeiro ja cria a variavel
		item.pegar(); // exibe o conteuco colocado la na classe do cogumelo, mas o metodo usado em todos e o mesmo
		
		item = new Moeda(); // na segunda n�o precisa, porque ja foi feita na primeira vez, tamo so reutilizando
		item.pegar();
		
		item = new Diamante();
		item.pegar();
		
		
		
		
		
	}

}
