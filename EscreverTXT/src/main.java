import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException { // erro caso de errado
		
		String s = "texto para ser gravado no arquivo"; // string onde ficar� o texto que vai pro "saida.txt"
		
		Sabonete sabonete1 = new Sabonete("forte", "Vermelho"); //instancia dos sabonetes
		Sabonete sabonete2 = new Sabonete("suave", "Branco"); // aqui da pra deixar as informacoes a respeito das strings, por causa dos parametros dentro do construtor na classe "sabonete"
		Sabonete sabonete3 = new Sabonete("Amargo", "Amarelo");
		
		List<Sabonete> listaDeSabonetes = new ArrayList<Sabonete>(); // ArrayList
		
		listaDeSabonetes.add(sabonete1); //adicao das variaveis dentro da lista
		listaDeSabonetes.add(sabonete2);
		listaDeSabonetes.add(sabonete3);
		
		// o try protege o arquivo de ser corrompido
		 try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {  // o filewrite cria e escreve dentro dele
			 //o buffered trata-se de uma memoria temporaria
			 //o writter escreve
		
			 for(Sabonete sabonete : listaDeSabonetes) // enchanced for
		escrever.write(sabonete.toString()); // string onde a informacao sera gravada
		 }
		//dando refresh na pasta "src" faz aparecer o arquivo txt
		 
		 
	}

}
