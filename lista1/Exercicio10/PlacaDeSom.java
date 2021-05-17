
public class PlacaDeSom extends PecaComputador {
	int frequencia;
	int nivelDeRuido;
	int resolucao;
	boolean ativado = true;
	boolean ok = true;

	public PlacaDeSom(String no, String mo, String ve, int f) {
		setNome(no);
		setModelo(mo);
		setVersao(ve);
		setFrequencia(f);
	}

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int f) {
		this.frequencia = f;
	}

	public int getNivelDeRuido() {
		return nivelDeRuido;
	}

	public void setNivelDeRuido(int ruido) {
		this.nivelDeRuido = ruido;
	}

	public int getResolucao() {
		return resolucao;
	}

	public void setResolucao(int re) {
		this.resolucao = re;
	}

	private void setAtivado(boolean ativado) {
		this.ativado = ativado;
	}

	public boolean isAtivado() {
		return this.ativado;
	}

	public void ativar() {
		setAtivado(true);
		setOk(true);
	}

	public void desativar() {
		setAtivado(false);
		setOk(false);
	}

	public boolean isOk() {
		return this.ok;
	}

	private void setOk(boolean ok) {
		this.ok = ok;
	}

	public void mostrarStatus() {
		System.out.println("----STATUS DA PLACA DE SOM----");
		System.out.println("Nome do dispositivo: " + getNome());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Nível de ruído: " + getNivelDeRuido());
		System.out.println("Está ativado: " + isAtivado());
		System.out.println("Está ok: " + isOk());
		if (!isOk()) {
			System.out.println("Ative o dispositivo para normalizar seu estado");
		}
		System.out.println();
	}
}
