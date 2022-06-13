
public class Lampada {

	private boolean estado; // variavel boleana

	public Lampada(boolean estado) { // construtor
		this.estado = estado;
	}

	public void ligar() { //metodo para ativar
		estado = true;
	}

	public void desligar() { //metodo para desativar
		estado = false;
	}

	public void imprimir() { //impressao do resultado
		if (estado == true) {
			System.out.println("Acao registrada!");
			System.out.println("A lampada est� Ligada");
		} else {
			System.out.println("Acao registrada!");
			System.out.println("A lampada est� Desligada");
		}
	}
}
