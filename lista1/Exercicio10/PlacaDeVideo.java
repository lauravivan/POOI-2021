
public class PlacaDeVideo extends PecaComputador {
	String resolucao;
	boolean ativado = true;
	float capacidade;
	boolean ok = true;

	public PlacaDeVideo(String no, String mo, String ve, float ca) {
		setNome(no);
		setModelo(mo);
		setVersao(ve);
		setCapacidade(ca);
	}

	public String getResolucao() {
		return this.resolucao;
	}

	public void setResolucao(String re) {
		this.resolucao = re;
	}

	public float getCapacidade() {
		return this.capacidade;
	}

	public void setCapacidade(float ca) {
		this.capacidade = ca;
	}

	public boolean isAtivado() {
		return this.ativado;
	}

	private void setAtivado(boolean at) {
		this.ativado = at;
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
		System.out.println("----STATUS DA PLACA DE V�DEO----");
		System.out.println("Nome do dispositivo: " + getNome());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Resolu��o: " +getResolucao());
		System.out.println("Capacidade: " + getCapacidade());
		System.out.println("Est� ativado: " + isAtivado());
		System.out.println("Est� ok: " + isOk());
		if (!isOk()) {
			System.out.println("Ative o dispositivo para normalizar seu estado");
		}
		System.out.println();
	}

}
