package polimorfismosBebidas;

public class Aplicacao {

	public static void main(String[] args) {

		Preparador preparador = new Preparador(); //instancia do preparador

		LeiteQuente leiteQuente = new LeiteQuente(); // instancia de bebidas 
		preparador.prepararbebida(leiteQuente);

		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararbebida(refrigerante);

	}

}
