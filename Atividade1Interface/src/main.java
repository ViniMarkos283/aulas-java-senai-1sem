
public class main {

	public static void main(String[] args) {
		
		double x = 7; // largura (ou raio)
		double y = 6; // altura
		
		AreaCalculavel areaCalculavel = new quadrado(); //instanciando o quadrado dentro do objeto "areaCalculavel"
		areaCalculavel.calcularArea(x, y); //convocacao do metodo dentro do "areaCalculavel"
		
		areaCalculavel = new retangulo(); //instanciando o retangulo, dentro da mesma variavel usada anteriormente
		areaCalculavel.calcularArea(x, y);
		
		areaCalculavel = new circunferencia(); // repeticao de sintaxe, mas com a circunferencia
		areaCalculavel.calcularArea(x, y);
			
		
		
		
		
		
		
	}

}
