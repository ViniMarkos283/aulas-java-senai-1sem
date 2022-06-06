
public class Carro extends Veiculo{ // acessa a superclasse

	private boolean quatroPortas;
	
	

	@Override
	public void imprimir() {

		System.out.println("tem quatro portas: " + quatroPortas);
		super.imprimir(); // o super executa o imprimir da super class e dps roda o da sub
	}

	public boolean isQuatroPortas() { // o is e uma pergunta pra saber se e ou nao
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
	
	
	
}
