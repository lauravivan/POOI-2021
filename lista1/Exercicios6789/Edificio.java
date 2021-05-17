
public class Edificio extends Imovel {

	private int totalPortas;
	private int totalAndares;
	private Porta[] portas;

	public Edificio(int totalPortas, int totalAndares, String cor) {
		setTotalPortas(totalPortas);
		setTotalAndares(totalAndares);
		setCor(cor);
	}

	public int getTotalPortas() {
		return this.totalPortas;
	}

	public void setTotalPortas(int totalPortas) {
		this.totalPortas = totalPortas;
	}

	public int getTotalAndares() {
		return this.totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public void getPortas() {
		int numero = 1;
		for (int i = 0; i < getTotalPortas(); i++) {
			System.out.println("Cor da porta " + numero + ": " 
					+ this.portas[i].getCor());
			System.out.println("Dimensões: " + this.portas[i].getDimensaoX()
					+ ", " + this.portas[i].getDimensaoY() + ", "
					+ this.portas[i].getDimensaoZ() + "\n");
			numero++;
		}
	}

	public void setPortas(Porta[] portas) {
		if (portas.length == getTotalPortas()) {
			this.portas = portas;
		} else {
			System.out.println("O tamanho do array precisa ser "
					+ "igual a quantidade de portas");
		}
	} 

	public void adicionarAndar() {
		setTotalAndares(getTotalAndares() + 1);
	}	
}
