import java.io.BufferedReader; // importacoes pra fazer alguns recursos rodarem
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscreverLerTXT {

	public static void main(String[] args) throws IOException {

		String linha = ""; //string onde vai o texto
		String string = "\n";

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um texto: ");
		linha = teclado.nextLine(); //scanner onde vai o que a pessoa digitar
		
		System.out.println("\nGravando no .txt... ");
		
		System.out.println("Lendo o .txt... ");

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {
			escrever.write(linha); //escreve no saida.txt
		}

		try (BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))) { //le o que esta escrito no .txt

			while ((linha = reader.readLine()) != null) {
				string += linha + "\n"; //soma a linha com a string e coloca um \n
			}
			System.out.println(string); //exibicao do texto no console
		}

	}

}
