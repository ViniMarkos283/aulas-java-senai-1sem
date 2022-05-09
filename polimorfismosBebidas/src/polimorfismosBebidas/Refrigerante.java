package polimorfismosBebidas;

public class Refrigerante extends Bebida {

	public Refrigerante() { // criado pela sugestao do proprio programa

		super("Refrigerante", false); // substitui q tinha pelo que ele deve informar a outra classe
	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Colocando gelo no copo");
	}

}
