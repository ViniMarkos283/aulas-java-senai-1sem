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

		int opcao = 0;

		List<Pessoa> pessoasList = new ArrayList<Pessoa>();
		Scanner teclado = new Scanner(System.in);

		for (int x = 0; x > pessoasList.size(); x++) {
			Pessoa pessoa = new Pessoa();
			pessoa.setEndereco(new Endereco());

			System.out.println("Digite seu nome:");
			pessoa.setNome(teclado.nextLine());

			System.out.println("Digite sua idade:");
			pessoa.setIdade(teclado.nextInt());

			System.out.println("Digite seu genero: 1 = Masculino, 2 = Feminino: ");
			opcao = teclado.nextInt();

			while (opcao != 1 || opcao != 2) {
				if (opcao == 1) {
					pessoa.setGen(Sexo.MASCULINO);
				} else if (opcao == 2) {
					pessoa.setGen(Sexo.FEMININO);
				} else {
					System.out.println("Opção inválida");
					System.out.println("Digite seu genero: 1 = Masculino, 2 = Feminino: ");
				}
			}

			System.out.println("Digite o nome da sua rua:");
			pessoa.setEndereco();

			System.out.println("Digite o nome do seu bairro:");

			System.out.println("Digite o número da rua:");

		}

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("cadastros.txt"))) {

			for (Pessoa cadastrados : pessoasList)
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
