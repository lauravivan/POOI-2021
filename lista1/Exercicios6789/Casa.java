
public class Casa extends Imovel {
	private Porta porta1, porta2, porta3;

	public Casa(String cor) {
		setCor(cor);
	}

	public void getPorta1() {
		if (this.porta1 != null) {
			System.out.println("Cor da porta 1: " + this.porta1.getCor());
			System.out.println("Dimensões: " + this.porta1.getDimensaoX() 
			+ ", " + this.porta1.getDimensaoY() + ", "
			+ this.porta1.getDimensaoZ() + "\n");
		} else {
			System.out.println("Porta 1 não existe");
		}
	}

	public void setPorta1(Porta porta1) {
		this.porta1 = porta1;
	}

	public void getPorta2() {
		if (this.porta2 != null) {
			System.out.println("Cor da porta 2: " + this.porta2.getCor());
			System.out.println("Dimensões: " + this.porta2.getDimensaoX() 
			+ ", " + this.porta2.getDimensaoY() + ", "
			+ this.porta2.getDimensaoZ() + "\n");
		} else {
			System.out.println("Porta 2 não existe");
		}
	}

	public void setPorta2(Porta porta2) {
		this.porta2 = porta2;
	}

	public void getPorta3() {
		if (this.porta3 != null) {
			System.out.println("Cor da porta 3: " + this.porta3.getCor());
			System.out.println("Dimensões: " + this.porta3.getDimensaoX() 
			+ ", " + this.porta3.getDimensaoY() + ", "
			+ this.porta3.getDimensaoZ() + "\n");
		} else {
			System.out.println("Porta 3 não existe");
		}
	} 

	public void setPorta3(Porta porta3) {
		this.porta3 = porta3;
	}

	public int quantasPortasEstaoAbertas() {
		int qndAbertas = 0;

		if (porta1 != null) {
			if (porta1.isAberta()) {
			qndAbertas++;
			}
		} 
		
		if (porta2 != null) {
			if (porta2.isAberta()) {
			qndAbertas++;
			}
		} 
		
		if (porta3 != null) {
			if (porta3.isAberta()) {
			qndAbertas++;
			}
		} 
		return qndAbertas;
	}
}
