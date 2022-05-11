
public class Pessoa {
	
	//variaveis
	String nome;
	int numFigurinhas; // variaveis globais, guardadas no heap
	
	//metodos (variaveis dentro do metodo são variaveis locais, somem após o uso)
	void receber(int numFigurinhas) { // metodo para receber informação
		this.numFigurinhas += numFigurinhas; //this = acessa os atributos do objeto chamado
		
	}
	
	void dar(int numFigurinhas, Pessoa pessoa) { // A classe é pessoa porque chama o objeto, o Pessoa pessoa faz com que qualquer um seja chamado, n é um especifico
		this.numFigurinhas -= numFigurinhas;
			
		pessoa.receber(numFigurinhas);
		
	}
	
	//metodo alternativo: usar o boolean no lugar do void do DAR
	//os retornos serão true e false, dentro do if que ficar no pessoa

	

}
