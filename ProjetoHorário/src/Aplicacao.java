
public class Aplicacao {

	public static void main(String[] args) {

		Data d1 = new Data(10, 03, 2000, 0, 30, 10); // primeiro estilo de data

		d1.imprimir(Data.FORMATO_12H);
		d1.imprimir(Data.FORMATO_24H);

		Data d2 = new Data(15, 06, 2000, 23, 15, 20); // segundo estilo de data
		d2.imprimir(Data.FORMATO_12H);
		d2.imprimir(Data.FORMATO_24H);

		Data d3 = new Data(5, 10, 2005); // terceiro estilo de data
		d3.imprimir(Data.FORMATO_12H);
		d3.imprimir(Data.FORMATO_24H);

	}

}
