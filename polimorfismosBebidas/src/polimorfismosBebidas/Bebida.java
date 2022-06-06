package polimorfismosBebidas;

public class Bebida {

	private String nome;
	private boolean aquecer;

	// source construction
	public Bebida(String nome, boolean aquecer) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}

	public void preparar() {
		System.out.println("pegando um copo..."); // esse cara da a instrucao do copo pros outros 2

	}

	// source get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAquecer() {
		return aquecer;
	}

	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}

}
