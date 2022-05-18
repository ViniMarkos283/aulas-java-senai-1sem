import java.util.ArrayList;
import java.util.List; // importa�oes, usando o crtl + shift + o

public class main { // a list � uma interface

	public static void main(String[] args) {

//		// n�o precisou colocar o tamanho da matriz, pq o list j� configurou
//		// automaticamente
//		List lista = new ArrayList(); // ambos foram importados do java.util
//
//		lista.add("abc"); // o Add insere info na variavel pertencente ao list
//		lista.add(1234);
//		lista.add(true);
//
//		// metodo 1
//		for (int x = 0; x < lista.size(); x++) { // o size � o substituto do length nessa opera��o
//			System.out.println(lista.get(x)); // meio pra expor o indice, que � diferente da forma da matriz
//		}
//
//		// metodo 2
//		System.out.println();
//		lista.remove(0); // metodo para apagar um dos itens, tirando ele da lista
//		for (Object valor : lista) { // o tipo object recebe todos os tipos de info
//			System.out.println(valor);
//		}
//
//		System.out.println();
//		lista.add(0, "def"); // adiciona uma info na posi��o escolhida sem apagar
//		for (Object valor : lista) { // o tipo object recebe todos os tipos de info
//			System.out.println(valor);
//		}
//		System.out.println();
//		lista.set(0, "ghi"); // altera os valores para valores novos
//		for (Object valor : lista) { // o tipo object recebe todos os tipos de info
//			System.out.println(valor);
//		}
//		System.out.println();
//		lista.clear(); // limpa toda a lista
//		if (lista.isEmpty()) { // isEmpty confere se est� ou n�o vazia
//			System.out.println("Sua lista est� V�zia");
//		}

		Conta conta1 = new Conta("Agua", 60.00);
		Conta conta2 = new Conta("Luz", 120.00);

		List<Conta> listaDeContas = new ArrayList<Conta>(); // O <x> � o generics, ele limita ao objeto a receber apenas
															// os informacoes que pertencem ao "Conta"
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		for (Conta conta : listaDeContas) {
			System.out.println(conta);
		}

	}
}
