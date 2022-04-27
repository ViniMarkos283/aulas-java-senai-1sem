import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		//int x = 100;
		//double y  = 200.3;
		//int a = 0;
		//double b = 0;
		//short z = (short) 10000;
		
		//a = (int)y; // converte o double em int, senão perde informações //
		//b = x; // não precisou converter, porque o int cabe dentro do double //
		
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(z);
		
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
		
		//pra comentar todo o codigo é só usar o crtl + /
		
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
//		}while (x<10); // enquanto isso não ocorre
		
	
//		//for é um para
//		for(int x=0; x<10; x++) {
//			System.out.println(x);
//		}
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int y = entrada.nextInt();
		
		
		for(int x=0; x<=10; x++) {
			System.out.println(y + " x " + x + " = " + x*y);
		} 
		
		
	}

}
