import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		// int x = 100;
		// double y = 200.3;
		// int a = 0;
		// double b = 0;
		// short z = (short) 10000;

		// a = (int)y; // converte o double em int, senão perde informações //
		// b = x; // não precisou converter, porque o int cabe dentro do double //

		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(z);

//		int idadePessoa = 19;
//		
//		if(idadePessoa < 18) { // primeira condição //
//			System.out.println("você não pode beber");
//		}
//		else if(idadePessoa < 60) { // segunda condição //
//			System.out.println("Bora tomar uma?");
//		}
//		else { // caso o valor n se encaixe em nenhuma das condicoes //
//			System.out.println("Aposentado ou pensionista?");
//		}
//
//		System.out.println("Você tem " + idadePessoa + " anos");

//		int  num = 2;
//		
//		switch(num) { // função escolha
//		case 1: //caso
//			System.out.println("Domingo");
//			break; //manda o switch parar e vai pra depois da chave
//		case 2:
//			System.out.println("Segunda");
//			break;
//		case 3:
//			System.out.println("Terça");
//			break;
//		case 4:
//			System.out.println("Quarta");
//			break;
//		case 5:
//			System.out.println("Quinta");
//			break;
//		case 6:
//			System.out.println("Sexta");
//			break;
//		case 7:
//			System.out.println("Sábado");
//			break;
//		default: // serve de outrocaso, caso nenhum dos outros sejam atendidos
//			System.out.println("Este número não corresponde a nenhum dia da semana");
//		} //chave*

		// pra comentar todo o codigo é só usar o crtl + /

		// char significa caractere
//		char caractere = 'b'; // com caractere unico usa-se a aspas simples, senão vira uma string
//		
//		switch (caractere) {
//		case 'a':
//			System.out.println("seu caractere é: a");
//			break;
//		case 'b':
//			System.out.println("seu caractere é: b");
//			break;
//		default:
//			System.out.println("valor não encontrado");
//
//		}

//		String farol = "verde";
//		
//		switch(farol) {
//			case "verde":
//		System.out.println(farol);
//		System.out.println("Luz Verde: Prossiga");
//		break;
//			case "amarelo":
//		System.out.println(farol);
//		System.out.println("Luz Amarela: Atenção");
//		break;
//			case "vermelho":
//		System.out.println(farol);
//		System.out.println("Luz Vermelha: Pare");
//		break;
//			default:
//		System.out.println("Cor inválida, o farol de transito não possui a cor correspondente");
//		System.out.println("Sugestão: use cores como: verde, amarelo ou vermelho");
//			break;
//	
//		}

//		int x = 0;
//		
//		//while é o enquanto, repete algo até a condição ser atendida, começa verificando a condição e depois faz 
//		while(x<10) {
//			System.out.println(x);
//			x = x + 1;
//		}	
//		
//		// segundo tipo de while, o "do" significa faça. ele faz primeiro e depois atende a condição
//		do {
//			System.out.println(x);
//			x = x + 1;
//		}while (x<10); // enquanto isso n�o ocorre

//		//for é um para
//		for(int x=0; x<10; x++) {
//			System.out.println(x);
//		}
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Digite um valor: ");
//		int y = entrada.nextInt();
//		
//		
//		for(int x=0; x<=10; x++) {
//			System.out.println(y + " x " + x + " = " + x*y);
//		} 
//		

		// metodo de um por um
//		int x1 = 3;
//		int y1 = 5;
//		int z1 = 7;
//
//		System.out.println(x1);
//		System.out.println(y1);
//		System.out.println(z1);
//		System.out.println();
//
//		// metodo matriz para double
//		double x[] = { 3, 5, 3, 5 }; // O sinal [] ta fazendo o Array, que no caso é a matriz, onde se coloca varias
//										// infos em uma variavel só
//
//		for (int aux = 0; aux < x.length; aux++) { // esse length pega o valor que corresponde ao total das variaveis da
//													// matriz
//			System.out.println("Valor do indice " + aux + " = " + x[aux]); // aqui o "x" tá recebendo a matriz do aux
//		}
//
//		// metodo matriz para string
//		String nome[] = { "nome1", "nome2", "nome3" };
//		for (int aux1 = 0; aux1 < nome.length; aux1++) {
//			System.out.println(nome[aux1]);
//			if (nome[aux1] == "nome3") { // caçando o numero da indice através da informação dentro dela
//				System.out.println("O indice é o : " + aux1);
//			}
//		}

//		int[] arrayInt = new int[5];  // cria 5 endere�os que apontam pra cinco lugares onde ir�o os inteiros
//		String[] arrayString = new String[4];
//		double[] arrayDouble = new double[3];
//
//		arrayInt[3] = 4;
//
//		int[] numero = new int[6];
//		Scanner teclado = new Scanner(System.in); // metodo "leia" 
//
//		for (int aux2 = 0; aux2 < numero.length; aux2++) {
//			System.out.println("Digite algum valor: ");
//			numero[aux2] = teclado.nextInt(); // vai ler a informação dada pelo usuario, vai ser gravados em posiçoes
//												// diferentes
//		}
//		for (int aux2 = 0; aux2 < numero.length; aux2++) {
//			System.out.println("Indice " + aux2 + " = " + numero[aux2]); // vai exibir as infos que foram guardadas na
//																			// matriz
//		} 

//		int[] arrayQualquer = new int[3];
//		Object[] arrayObject = new Object[6]; // matriz generica que recebe qualquer coisa
//
//		arrayObject[0] = 12; // recebe inteiro
//		arrayObject[1] = "Marcos"; // recebe string
//		arrayObject[2] = 13.0; // recebe double
//		arrayObject[3] = true; // recebe boolean
//		arrayObject[5] = arrayQualquer; // e at� endere�o
//
//		for (int aux2 = 0; aux2 < arrayObject.length; aux2++) {
//			System.out.println("Indice " + aux2 + " = " + arrayObject[aux2]);
//		}

		int[][] arrayBidirecional = new int[3][3]; // matriz com linha e coluna
		
		arrayBidirecional[0][0] = 8;
		arrayBidirecional[2][1] = 7;
		

		for (int linha = 0; linha < arrayBidirecional.length; linha++) { // esse length v� a linha
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) { // o zero confere o tamanho do
																					// segundo indice
				System.out.print( // print sozinho deixa os valores um do lado do outro
						"Indice [" + linha + "][" + coluna + "] = " + arrayBidirecional[linha][coluna] + " | ");

			}
			System.out.println(); 
		}
	}
}
