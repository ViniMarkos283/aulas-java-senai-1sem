
public class Pessoa {
	
	//variaveis
	String nome;
	int numFigurinhas; // variaveis globais, guardadas no heap
	
	//metodos (variaveis dentro do metodo são variaveis locais, somem após o uso)
	void receber(int numFigurinhas) { // metodo para receber informação
		this.numFigurinhas += numFigurinhas; //this = acessa os atributos do objeto chamado
		
	}
	
	
	
	

}
