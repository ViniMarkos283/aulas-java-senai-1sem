
public class circunferencia implements AreaCalculavel{

	@Override
	public void calcularArea(double x, double y) {
		System.out.println("A area da sua circunferencia é: " + 2 * Math.PI * x);		
	}

}
