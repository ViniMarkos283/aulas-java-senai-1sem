import java.util.Scanner;

public class Area_calculator {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		Calculos calculos = new Calculos();
		
		System.out.println("Calculadora area de formas:");
		System.out.println("digite a medida da largura: ");
		int x = scanner.nextInt();
		
		System.out.println("digite a medida da altura: ");
		int y = scanner.nextInt();
		
		
		if(x == y) {
		int area = calculos.area(x);
				System.out.println("A area do seu quadrado é de: " + area + "cm");
		}
		
		else if (x != y){
		int area = calculos.area(x, y);
				System.out.println("A area do seu retangulo é de: " + area + "cm");
		}
		
		else if (x != int){
		double area = calculos.area(x, y);
				System.out.println("A area do seu triangulo é de: " + area + "cm");
		}
	}

}
