import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException {

		Sabonete sabonete1 = new Sabonete("forte", "Vermelho");
		Sabonete sabonete2 = new Sabonete("suave", "Azul");
		Sabonete sabonete3 = new Sabonete("Amargo", "Amarelo"); //instancia de 3 tipos de sabonete

		List<Sabonete> listaDeSabonetes = new ArrayList<Sabonete>(); //instancia do array do sabonete

		listaDeSabonetes.add(sabonete1); //adicao dos sabonetes na lista
		listaDeSabonetes.add(sabonete2);
		listaDeSabonetes.add(sabonete3);

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("listaDeSabonetes.txt"))) { //escreve a lista no txt
			for (Sabonete sabonete : listaDeSabonetes)
				escrever.write(sabonete.toString());
		}

		List<String> sabonetesLidos = new ArrayList<String>(); // nova lista para leitura, mas sob a instancia String
		try (BufferedReader reader = new BufferedReader(new FileReader("listaDeSabonetes.txt"))) { // leitor do txt

			String line; // carinha que vai pegar as strings do txt e guarda-las

			while ((line = reader.readLine()) != null) { // enquanto o leitor n der Null, vai ler linha por linha
				Sabonete sab = new Sabonete(line); // nova variavel sob instancia sabonete usando o carinha da leitura acima
				sabonetesLidos.add(sab.toString()); // adicao do tostring no novo list

			}

			System.out.println(sabonetesLidos); // exibiçao do resultado da nova lista

		}
	}
}
