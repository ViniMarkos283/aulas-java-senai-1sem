import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {

		// comanda: criar um sistema onde possam ser cadastradas 4 pessoas, contendo
		// seus dados pessoais e de endereco, usando matriz
		// depois gravar no txt e depois jogar em um novo list

		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();

		int opcao = 0;

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);

		Scanner teclado = new Scanner(System.in);

		for (int x = 0; x > pessoas.size(); x++) {
			System.out.println("Digite seu nome:");
			Pessoa.setNome(teclado.nextLine());

			System.out.println("Digite sua idade:");
			Pessoa.setIdade(teclado.nextInt());

			System.out.println("Digite seu genero: 1 = Masculino, 2 = Feminino: ");
			opcao = teclado.nextInt();

//			while (opcao != 1 || opcao != 2) {
//				if (opcao == 1) {
//					Pessoa.setGen(Sexo.MASCULINO);
//				} else if (opcao == 2) {
//					Pessoa.setGen(Sexo.FEMININO);
//				} else {
//					System.out.println("Opção inválida");
//					System.out.println("Digite seu genero: 1 = Masculino, 2 = Feminino: ");
//				}
//			}

			System.out.println("Digite o nome da sua rua:");
			Pessoa.setRua(teclado.nextLine());

			System.out.println("Digite o nome do seu bairro:");
			Pessoa.setBairro(teclado.nextLine());

			System.out.println("Digite o número da rua:");
			Pessoa.setNumero(teclado.nextInt());

		}

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("cadastros.txt"))) {

			for (Pessoa cadastrados : pessoas)
				escrever.write(cadastrados.toString());
		}

		List<String> cadastrosLidos = new ArrayList<String>();

		try (BufferedReader reader = new BufferedReader(new FileReader("cadastros.txt"))) {

			String linha;
			while ((linha = reader.readLine()) != null) {
				Pessoa pessoa = new Pessoa(linha);
				cadastrosLidos.add(pessoa.toString());

			}

			System.out.println(cadastrosLidos);

		}

	}
}
