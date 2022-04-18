import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //metodo pra usar o scanner
				
		Matematica matematica = new Matematica();
		
		System.out.println("Somar dois Números");
		System.out.println("digite o primeiro valor: ");
		int x = scanner.nextInt(); //recebe o valor X digitado
		
		System.out.println("digite o segundo valor: ");
		int y = scanner.nextInt(); //recebe o valor q ocupa o Y

		
		//metodo 1
		int soma = matematica.somar(x, y);
		System.out.println("o resultado é " + soma + "!!!"); //concatenar: juntar strings diferentes, representado pelo +
		
		//metodo 2: com 3 valores
		soma = matematica.somar(x, y, 5);
		System.out.println("o resultado é " + soma + "!!!");
		
		//metodo 3: usando o double
		double soma2 = matematica.somar(x, y);
		System.out.println("o resultado é " + soma2 + "!!!");
		

	}

}
