
public class Sabonete {

	private String Nome, cheiro, cor;

	

	public Sabonete(String nome, String cheiro, String cor) { // construtor, é importante deixar os parametos com as informaçoes para que dé para preenche-las no main
		this.Nome = nome;
		this.cheiro = cheiro;
		this.cor = cor;
	}

	@Override
	public String toString() { // toString, converte varias strings em uma só
		return "Sabonete [Nome=" + Nome + ", cheiro=" + cheiro + ", cor=" + cor + "]\n";
	}
	
	
	
	
	
	
	
	
	
	
}
