
public class Imovel {
	private String cor;
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void pinta(String cor) {
		setCor(cor);
	}
}
