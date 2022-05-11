
public abstract class Item { // classe abstrata, carrega em si o padrão para as subclasses usarem
	
	private int posX; // posiçao X
	private int posY; // posiçao Y
	
	public abstract void pegar() ; // metodo abstrato, acaba com ";" e obriga as sub classes a criarem implementacoes

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
	
	
	
}
