
public class Aplicacao {

	public static void main(String[] args) {

		Matematica matematica = new Matematica();
		
		//sem o static
//		int resultado = matematica.somar(2, 3); // valores a serem somados
//		System.out.println(resultado);
//		
//		resultado = matematica.subtrair(10, 4); // valores a serem subtraidos
//		System.out.println(resultado);
		
		// com o static
//		int resultado = Matematica.somar(2, 4);
//		System.out.println(resultado); // o println tbm é static, pq chama direto do system
//		
//		resultado = Matematica.subtrair(10, 11);
//		System.out.println(resultado);
		
//		Contador contador1 = new Contador();
//		Contador contador2 = new Contador();
//		Contador contador3 = new Contador();
//		contador1.incrementar();
//		System.out.println(contador1.getValor());
//		System.out.println(contador2.getValor());
//		System.out.println(contador3.getValor());
		
//		Contador.incrementar(); // chamando o metodo diretamente
//		Contador.incrementar();
//		Contador.incrementar();
//		
//		System.out.println(Contador.getValor());
		
		System.out.println(Constantes.MEDIA_DA_PROVA);
		
	}

}
