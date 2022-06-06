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

		List<Pessoa> pessoasList = new ArrayList<Pessoa>(); //list onde ficarão as pessoas cadastradas
		Scanner teclado = new Scanner(System.in); //scanner do teclado

		for (int x = 0; x < 4; x++) { //vai repetir o cadastro até ter os 4 cadastros
			Pessoa pessoa = new Pessoa(); // instancia uma nova pessoa toda vez q é repetido
			pessoa.setEndereco(new Endereco()); //liga o endereco a variavel pessoa

			System.out.println("Digite seu nome:");
			pessoa.setNome(teclado.next());

			System.out.println("Digite sua idade:");
			pessoa.setIdade(teclado.nextInt());

			int opcao = 0; //seletor: vai determinar qual constante sera escolhida

			while (opcao != 1 && opcao != 2) {
				System.out.println("Digite seu genero: 1 = Masculino, 2 = Feminino: ");
				opcao = teclado.nextInt();

				if (opcao == 1) { // caso digite 1, ele vai puxar a constante "MASCULINO" para o enum
					pessoa.setSexo(Sexo.MASCULINO);
				} else if (opcao == 2) { // caso 2, vai fazer o mesmo mas com "FEMININO"
					pessoa.setSexo(Sexo.FEMININO);
				} else { // caso nenhuma delas seja escolhida, vai dar a mensagem de erro e vai repetir
					System.out.println("Opcao invalida, meu nobre");
				}
			}

			System.out.println("Digite o nome da sua rua:");
			pessoa.getEndereco().setRua(teclado.next()); // puxou um metodo de endereco por meio do pessoa

			System.out.println("Digite o nome do seu bairro:");
			pessoa.getEndereco().setBairro(teclado.next());

			System.out.println("Digite o numero da rua:");
			pessoa.getEndereco().setNumero(teclado.nextInt());

			pessoasList.add(pessoa); //adicao do cadastrado ao list

		}

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("cadastros.txt"))) { //sintaxe da escrita

			for (Pessoa pessoa : pessoasList) {
				escrever.write(pessoa.toString()); //escrita dos dados em conjunto ao padrao do toString do pessoa
			}
		}

		List<String> cadastrosLidos = new ArrayList<String>(); //nova list, onde vai ser escrito as informacoes do list anterior

		try (BufferedReader reader = new BufferedReader(new FileReader("cadastros.txt"))) { //sintaxe do leitor

			String linha;
			while ((linha = reader.readLine()) != null) { //enquanto o leitor n se deprar com uma linha vazia, ele continuara lendo
				Pessoa pessoa = new Pessoa(linha);
				cadastrosLidos.add(pessoa.toString()); //mesclagem do toString do pessoa com a variavel da list

			}
		}

		System.out.println(cadastrosLidos); //exibicao da nova list

	}
}
