package polimorfismosBebidas;

public class Preparador {

	public void prepararbebida(Bebida bebida) {
		System.out.println("Preparando a bebida: " + bebida.getNome());

		if (bebida.isAquecer()) { // metodo aquecedor em booleano, se vai ou não aquecer
			System.out.println("Aquecendo a bebida: " + bebida.getNome());
		}
		
		bebida.preparar(); // metodo que descreve a preparação das bebidas
		
		System.out.println("Colocando o " + bebida.getNome() + " no copo"); // economia de codigo, aqui já fala q a bebida foi pro copo

		System.out.println("Seu " + bebida.getNome() + " foi preparado com sucesso!!! \n");

	}

}
