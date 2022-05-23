import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException { // erro caso de errado
		
		String s = "texto para ser gravado no arquivo";
		
		// o try protege o arquivo de ser corrompido
		 try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {  // o filewrite cria e escreve dentro dele
		
		escrever.write(s); // string a ser gravada
		 }
		
		//dando refresh faz aparecer o arquivo txt
	}

}
