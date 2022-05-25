import java.io.BufferedReader; // importacoes pra fazer alguns recursos rodarem
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscreverLerTXT {

	public static void main(String[] args) throws IOException {

		String linha = "";
		String string = "\n";

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um texto: ");
		linha = teclado.nextLine();
		
		System.out.println("\nGravando no .txt... ");
		
		System.out.println("Lendo o .txt... ");

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {
			escrever.write(linha);
		}

		try (BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))) {

			while ((linha = reader.readLine()) != null) {
				string += linha + "\n";
			}
			System.out.println(string);
		}

	}

}
