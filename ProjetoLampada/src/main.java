import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Lampada lamp = new Lampada();
		
		Scanner entrada = new Scanner(System.in);
	
		while (lamp.escolha == 2) {
		if (lamp.estado = true) {
		System.out.println("lampada encontrada, mas está ligada, o que deseja fazer?");
		System.out.println("0 - desligar");
		System.out.println("2 - sair");

		int escolher = entrada.nextInt();
		}
		
		else if (lamp.estado = false) {
				System.out.println("lampada encontrada, mas está desligada, o que deseja fazer?");
				System.out.println("1 - ligar");
				
				int escolher = entrada.nextInt();
				}
		}
		
		switch (lamp.escolher) {
		case 0:
		System.out.println("Lampada Desligada");
		break;
		case 1:
			System.out.println("lampada Ligada");
		break;
	}
	}
}

	
		
	
		

