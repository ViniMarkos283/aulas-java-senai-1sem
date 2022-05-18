
public class Aplicacao { //interfaces só possuem metodos

	public static void main(String[] args) {

//		Rota rota = new Rota(); // instancia para a rota
		
		Ferrari ferrari = new Ferrari(); // instancia de ferrari
//		Fusca fusca = new Fusca(); // instancia do fusca
//		
//		rota.Ir(fusca); // mesma rota mas agr com o fusca
//		rota.Ir(ferrari); // chamou o veiculo para funcionar na rota, isso é um meio de polimorfismo
//		
//		Automovel automovel = new Ferrari(); // metodo alternativo
//		rota.Ir(automovel);
//		
//		automovel = new Fusca();
//		rota.Ir(automovel);
		
		
		//possibilidade de implementar 2 interfaces no msm elemento
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari);
		

		
	}

}
