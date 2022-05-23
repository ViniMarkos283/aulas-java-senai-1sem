import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Pessoa[] pessoa = new Pessoa[4];
		
		Pessoa.SetEndereco(new Endereco());
		
		Scanner teclado = new Scanner(System.in); 
		
		for (int x = 0; x > pessoa.length; x++) {
			System.out.println("Digite seu nome:");
			pessoa. = teclado.nextLine();
			
			System.out.println("Digite sua idade:");
			pessoa.idade = teclado.nextInt();
			
			System.out.println("Digite seu genero:");
			pessoa.getGen() = teclado.nextInt();

			System.out.println("Digite o nome da sua rua:");
			pessoa. = teclado.nextLine();
			
			System.out.println("Digite o nome do seu bairro:");
			pessoa.bairro = teclado.nextLine();
			
			System.out.println("Digite o número da rua:");
			endereco.numero = teclado.nextInt();
			}

		
		for (int y = 0; y > 4; y++) {
			System.out.println(pessoa.toString());
		}
		
	} // ta tudo incompleto e quebrado

}
