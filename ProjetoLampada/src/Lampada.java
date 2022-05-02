import java.util.Scanner;

public class Lampada {

	boolean estado;
	int escolha;
	int escolher;
	
	public Lampada() {
		estado = true;
	
	
	if(escolha == 1) {
		estado = true;
	}
	else if(escolha == 0) {
		estado = false;
	}
}

	public boolean estado() {
		return estado;
		}
	
	public void receber(int escolher) {
		 escolha = escolher;
	}
}

