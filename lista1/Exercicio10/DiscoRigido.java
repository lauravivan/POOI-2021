
public class DiscoRigido extends PecaComputador {
	String modelo;
	float capacidade;
	float espacoUsado;
	float espacoLivre;
	boolean vazio = true;
	boolean cheio;

	public DiscoRigido(String no, String mo, String ve, float ca) {
		setNome(no);
		setModelo(mo);
		setVersao(ve);
		setCapacidade(ca);
	}

	public float getCapacidade() {
		return this.capacidade;
	}

	public void setCapacidade(float ca) {
		this.capacidade = ca;
	}

	public float getEspacoUsado() {
		return this.espacoUsado;
	}

	private void setEspacoUsado(float usado) {
		this.espacoUsado = usado;
	}

	public float getEspacoLivre() {
		return this.espacoLivre;
	}

	private void setEspacoLivre(float livre) {
		this.espacoLivre = livre;
	}

	public boolean isVazio() {
		return this.vazio;
	}

	private void setVazio(boolean vazio) {
		if (getEspacoUsado() == 0) {
			this.vazio = vazio;
		}
	}

	public boolean isCheio() {
		return this.cheio;
	}

	private void setCheio(boolean cheio) {
		if(getEspacoUsado() == getCapacidade()) {
			this.cheio = cheio;
		}
	}

	public void usarEspaco(float armazenar) {

		setVazio(false);

		if (armazenar <= 0 || armazenar > getCapacidade()) {
			System.out.println("error message");
		} else if (armazenar == getCapacidade() && (getEspacoUsado() == 0)){
			setEspacoUsado(armazenar);
			setEspacoLivre(0);
			setCheio(true);
		} else if (armazenar == getCapacidade() && (getEspacoUsado() != 0)) {
			System.out.println("Error message");
		} else {
			setEspacoUsado(getEspacoUsado() + armazenar);
			setEspacoLivre(getCapacidade() - getEspacoUsado());
			if (getEspacoUsado() == getCapacidade()) {
				setCheio(true);
			} else {
				setCheio(false);
			}
		}
	}

	public void liberarEspaco(float liberar) {
		if (liberar > 0 && liberar <= getEspacoUsado()) {
			setEspacoUsado(getEspacoUsado() - liberar);
			setEspacoLivre(getCapacidade() - getEspacoUsado());
		} else {
			System.out.println("error message");
		}
	}

	public void mostrarStatus() {
		System.out.println("----STATUS DO HD----");
		System.out.println("Nome do dispositivo: " + getNome());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Capacidade: " + getCapacidade());
		System.out.println("Espa�o utilizado: " + getEspacoUsado() +
				", com " + getEspacoLivre() + " de espa�o livre");
		if (isCheio()) {
			System.out.println("Alerta: Capacidade usada totalmente. "
					+ "Limpe o seu disco.");
		} else {
			System.out.println("O disco se encontra ok");
		}
		System.out.println();
	}
}
