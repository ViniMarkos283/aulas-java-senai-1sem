
public class main {

	public static void main(String[] args) {
		
		double x = 7; // largura (ou raio)
		double y = 6; // altura
		
		AreaCalculavel areaCalculavel = new quadrado();
		areaCalculavel.calcularArea(x, y);
		
		areaCalculavel = new retangulo();
		areaCalculavel.calcularArea(x, y);
		
		areaCalculavel = new circunferencia();
		areaCalculavel.calcularArea(x, y);
			
		
		
		
		
		
		
	}

}
