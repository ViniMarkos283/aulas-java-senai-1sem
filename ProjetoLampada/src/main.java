import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		int situacao = 0; //cara que vai mudar a situacao da lampada
		Lampada lamp = new Lampada(true); // instancia da classe lampada

		Scanner entrada = new Scanner(System.in); // scanner que vai pegar a informacao digitada

		System.out.println("Voce encontrou uma lampada, e ela se encontra acesa!"); //dialogo para parecer um jogo RPG
		System.out.println("Deseja mudar o estado da lâmpada? 1- Sim  2-Não\n");
		situacao = entrada.nextInt(); //aqui vai ser digitado o valor

		if (situacao != 1) { // caso 1, ele vai mudar o estado da lampada
			lamp.imprimir();
		} else { // caso 2, ele vai manter ela ligada e soltar a mensagem
			lamp.desligar(); 
			lamp.imprimir();
		}
	}
}
