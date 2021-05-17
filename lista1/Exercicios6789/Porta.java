
public class Porta {
	private boolean aberta;
	private String cor;
	private float dimensaoX, dimensaoY, dimensaoZ;

	public Porta(float X, float Y, float Z, String cor) {
		setDimensaoX(X);
		setDimensaoY(Y);
		setDimensaoZ(Z);
		setCor(cor);
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getDimensaoX() {
		return this.dimensaoX;
	}

	public void setDimensaoX(float X) {
		this.dimensaoX = X;
	}

	public float getDimensaoY() {
		return this.dimensaoY;
	}

	public void setDimensaoY(float Y) {
		this.dimensaoY = Y;
	}

	public float getDimensaoZ() {
		return this.dimensaoZ;
	}

	public void setDimensaoZ(float Z) {
		this.dimensaoZ = Z;
	}

	public boolean isAberta() {
		return this.aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public void abre() {
		if (!isAberta()) {
			this.aberta = true;
			System.out.println("Você abriu a porta.");
		} else {
			System.out.println("A porta já está aberta!");
		}
	}

	public void fecha() {
		if(isAberta()) {
			this.aberta = false;
			System.out.println("Você fechou a porta.");
		} else {
			System.out.println("A porta já está fechada!");
		}
	}
}
