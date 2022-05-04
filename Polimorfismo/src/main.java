
public class main {

	public static void main(String[] args) {

		Animal animal = new Cachorro(); // polimorfismo: variavel animal mas instancia cachorro
		
		animal.Falar(); //uma só variavel...
		
		animal = new Gato(); //vantagem, chamando gato já vai aparecer o dialogo dele, porque mudou a instancia, mudou de forma
		
		animal.Falar(); //...mas 2 açoes diferentes
		
		
	}

}
