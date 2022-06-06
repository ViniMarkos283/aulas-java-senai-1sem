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

		List<Pessoa> pessoasList = new ArrayList<Pessoa>();
		Scanner teclado = new Scanner(System.in);

		for (int x = 0; x < 4; x++) {
			Pessoa pessoa = new Pessoa();
			pessoa.setEndereco(new Endereco());

			System.out.println("Digite seu nome:");
			pessoa.setNome(teclado.next());

			System.out.println("Digite sua idade:");
			pessoa.setIdade(teclado.nextInt());

			int opcao = 0;

			while (opcao != 1 && opcao != 2) {
				System.out.println("Digite seu genero: 1 = Masculino, 2 = Feminino: ");
				opcao = teclado.nextInt();

				if (opcao == 1) {
					pessoa.setSexo(Sexo.MASCULINO);
				} else if (opcao == 2) {
					pessoa.setSexo(Sexo.FEMININO);
				} else {
					System.out.println("Opcao invalida, meu nobre");
				}
			}

			System.out.println("Digite o nome da sua rua:");
			pessoa.getEndereco().setRua(teclado.next());

			System.out.println("Digite o nome do seu bairro:");
			pessoa.getEndereco().setBairro(teclado.next());

			System.out.println("Digite o numero da rua:");
			pessoa.getEndereco().setNumero(teclado.nextInt());

			pessoasList.add(pessoa);

		}

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("cadastros.txt"))) {

			for (Pessoa pessoa : pessoasList) {
				escrever.write(pessoa.toString());
			}
		}

		List<String> cadastrosLidos = new ArrayList<String>();

		try (BufferedReader reader = new BufferedReader(new FileReader("cadastros.txt"))) {

			String linha;
			while ((linha = reader.readLine()) != null) {
				Pessoa pessoa = new Pessoa(linha);
				cadastrosLidos.add(pessoa.toString());

			}
		}

		System.out.println(cadastrosLidos);

	}
}
