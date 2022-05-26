
public class Contador {

	private static int valor; //atributo
	
//	public Contador() { // faz começar com o 1
//		this.valor = 1;
//	}
	
	static { // executa só na primeira vez 
		valor = 1;
	}

	public static void incrementar() { // add +1
		valor ++;
	}

	public static int getValor() { // retorna valor
		return valor;
	}

	public void setValor(int valor) { // captura o valor
		this.valor = valor;
	}
	
	
	
	
	
	
}
