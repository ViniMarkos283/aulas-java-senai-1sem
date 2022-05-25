import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException {

		String s = "texto para ser gravado no arquivo";

		Sabonete sabonete1 = new Sabonete("forte", "Vermelho");
		Sabonete sabonete2 = new Sabonete("suave", "Branco");
		Sabonete sabonete3 = new Sabonete("Amargo", "Amarelo");

		List<Sabonete> listaDeSabonetes = new ArrayList<Sabonete>();

		listaDeSabonetes.add(sabonete1); //
		listaDeSabonetes.add(sabonete2);
		listaDeSabonetes.add(sabonete3);

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("listaDeSabonetes.txt"))) {

			for (Sabonete sabonete : listaDeSabonetes)
				escrever.write(sabonete.toString());
		}

		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))){
			String line;
			String string = "";
			
			while((line = reader.readLine()) != null) { 
				string += line + "\n"; 
			}
			System.out.println(string);
		}
		
		
		String teste = "";
		
		Sabonete sabonete = new Sabonete(teste);
		
		System.out.println(sabonete);

	}

}
