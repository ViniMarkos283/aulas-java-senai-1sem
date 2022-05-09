
public class main {

	public static void main(String[] args) {

//		Animal animal = new Cachorro(); // polimorfismo: variavel = animal, mas instancia =  cachorro
//		animal.Falar(); //uma só variavel...
//		animal = new Gato(); //vantagem, chamando gato já vai aparecer o dialogo dele, porque mudou a instancia, e consequentemente mudou sua forma de agir
//		animal.Falar(); //...mas faz 2 açoes diferentes
		
		Gato gato = new Gato(); // construção do objeto gato
		Cachorro cachorro = new Cachorro(); // construção do objeto cachorro
		Falar(gato);
		Falar(cachorro);	
	}
	
	public static void Falar (Animal a) { //metodo generico pra chamar metodos de outra classe, irá de imediato pq está estatico
		a.Falar();
		
		if(a instanceof Cachorro) { // Instanceof: caso a instancia (no caso o "a") seja cachorro, o metodo morder vai aparecer
		Cachorro c = (Cachorro) a;
			c.Morder();
	}
}
}

