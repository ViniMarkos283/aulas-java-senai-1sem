import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException { // excecao leitura de porta e excecao de leitura de arquivo
		
		//o fileReader lê e guarda no "entrada.txt"
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))){ // o BufferedReader é memoria temporaria responsavel por ler
			String line;
			String string = "";
			
			while((line = reader.readLine()) != null) { //o readline lê linha por linha, enquanto a proxima linha for diferente de null(linha vazia)
				string += line + "\n"; // ele lê e soma com a string, e adiciona um pula linha
			}
			System.out.println(string);
		}
		
		
		//metodo usando os parametros
//		Sabonete sabonete1 = new  Sabonete("azedo", "verde");
//		String s = sabonete1.toString();
		
		//metodo usando Strings
		String teste = "Sabonete; cheiro = azedo, Cor = verde";
		
		Sabonete sabonete2 = new Sabonete(teste);
		
		System.out.println(sabonete2);
		
	}

}
