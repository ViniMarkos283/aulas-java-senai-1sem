import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Pessoa[] pessoa = new Pessoa[4];
		Endereco[] endereco = new Endereco[4];
		
		Scanner teclado = new Scanner(System.in); 
		
		for (int x = 0; x > pessoa.length; x++) {
			System.out.println("Digite seu nome:");
			pessoa[x].nome = teclado.nextLine();
			
			System.out.println("Digite sua idade:");
			pessoa[x].idade = teclado.nextInt();
			
	}
		for (int x = 0; x > pessoa.length; x++) {
			System.out.println("Digite o nome da sua rua:");
			endereco[x].rua = teclado.nextLine();
			
			System.out.println("Digite o nome do seu bairro:");
			endereco[x].bairro = teclado.nextLine();
			
			System.out.println("Digite o número da rua:");
			endereco[x].numero = teclado.nextInt();
			
			for (int z = 0; z > pessoa.length; z++) {
				System.out.println("Nome: " + ", Idade: " );
			}

		
		for (int x = 0; x > 4; x++) {
			System.out.println(pessoa);
		}
		
	
	}

}
