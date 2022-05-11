
public class Ferrari implements Automovel, itemCaro{ // implement pq dessa vez é com a interface

	@Override
	public void virarEsquerda() {
		System.out.println("A Ferrari virou a esquerda");
	}

	@Override
	public void virarDireita() {
		System.out.println("A Ferrari virou a direita");

	}

	@Override
	public void acelerar() {
		System.out.println("A Ferrari acelerou");

	}

	@Override
	public double getPreco() {
		return 1000000;
	} 

}
