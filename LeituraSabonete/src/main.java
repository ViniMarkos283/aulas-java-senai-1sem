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
		Sabonete sabonete3 = new Sabonete("Amargo", "Amarelo");

		List<Sabonete> listaDeSabonetes = new ArrayList<Sabonete>();

		listaDeSabonetes.add(sabonete1); //
		listaDeSabonetes.add(sabonete2);
		listaDeSabonetes.add(sabonete3);

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("listaDeSabonetes.txt"))) {
			for (Sabonete sabonete : listaDeSabonetes)
				escrever.write(sabonete.toString());
		}

		List<Sabonete> sabonetesLidos = new ArrayList<Sabonete>();
		try (BufferedReader reader = new BufferedReader(new FileReader("listaDeSabonetes.txt"))) {

			String line;
			String text = "";

			while ((line = reader.readLine()) != null) {
				text += line;
				sabonetesLidos.add(sabonete);
				
			}

			System.out.println(sabonetesLidos);

		} // terminar em casa !!!
	}
}
