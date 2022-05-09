package polimorfismosBebidas;

public class Aplicacao {

	public static void main(String[] args) {

		Preparador preparador = new Preparador();

		LeiteQuente leiteQuente = new LeiteQuente();
		preparador.prepararbebida(leiteQuente);

		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararbebida(refrigerante);

	}

}
