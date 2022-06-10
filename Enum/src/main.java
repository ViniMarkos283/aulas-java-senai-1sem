
public class main {
	
	public static final double PI = 3.14; // constante para Pi
	
	private enum Sexo { // abriu um enum dentro do main, da msm forma que a versao separada
		MASCULINO, FEMININO; //constantes, somente em maiusculas
	}

	public static void main(String[] args) {
		
		double pi = main.PI; // convocacao da constante estatica
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA; // chama a constante dos dias da semana
		int num = DiaDaSemana.SEGUNDA.getNum(); //captura do valor dentro de segunda
		
		System.out.println(num); // exibicao do valor acima
		
		String s = "TERCA";
		hoje = DiaDaSemana.valueOf(s); // conversao da string para constante, comparando e achando o resultado mais proximo existente ao que foi informado
		
		System.out.println(hoje.getNum()); // ver o valor dentro do "hoje"
		
		Sexo sexo = Sexo.FEMININO; // esse enum s� recebe os dois valores criados apenas
		sexo = Sexo.MASCULINO;
	}

}
