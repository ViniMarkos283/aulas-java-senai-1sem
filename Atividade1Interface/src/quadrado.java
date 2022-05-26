
public class quadrado implements AreaCalculavel{

	@Override
	public void calcularArea(double x, double y) { // formula do quadrado, como o quadrado tem lados de tamnhos iguais, aqui só o X vai ser calculado
		System.out.println("A area do seu quadrado é: " +  Math.pow(x, 2));		
	}

}
