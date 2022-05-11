
public class Fusca implements Carro{

	@Override
	public void virarEsquerda() {
		System.out.println("O fusca virou a esquerda");
	}

	@Override
	public void virarDireita() {
		System.out.println("O fusca virou a direita");

	}

	@Override
	public void acelerar() {
		System.out.println("O fusca tentou acelerar");

	}

	@Override
	public void abriPorta() {
		System.out.println("Abriu a porta");
		
	}

}
