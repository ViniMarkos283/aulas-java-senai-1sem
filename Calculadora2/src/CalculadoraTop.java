import java.util.Scanner;

public class CalculadoraTop {

	public static void main(String[] args) {
		
		int n1;
		int n2;
		
		String op = "";
		int control = 0;
		
		Scanner entrada = new Scanner(System.in); // sintaxe do scanner, que pega as informaçoes
		
		System.out.println("Digite a operação que deseja fazer ( +, -, *, /): ");
		op = entrada.nextLine(); // coleta a informação, é como se fosse um Leia
		
		System.out.println("Digite um valor: ");
		n1 = Integer.parseInt(entrada.nextLine()); // passa o valor para inteiro
		
		System.out.println("Digite outro valor: ");
		n2 = Integer.parseInt(entrada.nextLine());
		
		if(op.equals("+")) { // If é o "Se" que muda o metodo de acordo com o sinal fornecido
			System.out.println("O resultado da soma é: "+ (n1 + n2));
			control++;
		}
		if(op.equals("-")) {
			System.out.println("O resultado da subtração é: "+ (n1 - n2));
			control++;
		}
		if(op.equals("*")) { 
			System.out.println("O resultado da multiplicação é: "+ (n1 * n2));
			control++;
		}
		if(op.equals("/")) { 
			System.out.println("O resultado da divisão é: "+ (n1 / n2));
			control++;
		}
		if(control == 0) {
			System.out.println("Operação inválida, Tente Novamente ");
		}

	}

}
