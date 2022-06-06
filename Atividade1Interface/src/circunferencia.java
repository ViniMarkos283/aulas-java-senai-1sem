
public class circunferencia implements AreaCalculavel{ //implementacao da clase para a interface

	@Override
	public void calcularArea(double x, double y) { // formula da circunferencia, que vai sobescrever o metodo calcular area
		System.out.println("A area da sua circunferencia é: " + 2 * Math.PI * x);	//math.pi é o equivalente do PI usado na matematica	
	}

}
