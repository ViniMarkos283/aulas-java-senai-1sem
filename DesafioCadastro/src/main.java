import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//comanda: criar um sistema onde possam ser cadastradas 4 pessoas, contendo seus dados pessoais e de endereco, usando matriz
		//depois gravar no txt e depois jogar em um novo list

		Pessoa[] pessoas = new Pessoa[4];
		
		private enum Genero { // abriu um enum dentro do main, da msm forma que a versao separada
			MASCULINO, FEMININO;
		}
		
		Pessoa.setEndereco(new Endereco());
		
		Scanner teclado = new Scanner(System.in); 
		
		for (int x = 0; x > pessoas.length; x++) {
			System.out.println("Digite seu nome:");
			pessoas[x].setNome(null) = teclado.nextLine();
			
			System.out.println("Digite sua idade:");
			pessoas[x].setIdade(x) = teclado.nextInt();
			
			System.out.println("Digite seu genero:");
			pessoas[x]. = teclado.next();

			System.out.println("Digite o nome da sua rua:");
			pessoas[x].setEndereco(Endereco.setRua(null)) = teclado.nextLine();
			
			System.out.println("Digite o nome do seu bairro:");
			pessoas[x].SetEndereco(Endereco.setBairro(null)) = teclado.nextLine();
			
			System.out.println("Digite o n�mero da rua:");
			pessoas[x].setEndereco(Endereco.setRua(null)) = teclado.nextInt();
			}

		
		for (int y = 0; y > 4; y++) {
			System.out.println(pessoas.toString());
		}
		
	}
}
