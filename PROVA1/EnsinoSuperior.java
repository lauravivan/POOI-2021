
public class EnsinoSuperior extends Estudante {
	private String cursoDaGraduacao;
	private int fase;
	private boolean estagiando;
	private boolean bolsista;
	private Data dataDeIngresso;
	private float mediaSemestral;
	private boolean aprovado;
	private int qndDeFases;
	private boolean formado;
	private float notaProvaDeTransferencia;
	private boolean aprovadoParaMudarDeCurso;
	private boolean provaDeTransferenciaFeita;
	private String novoCursoDaGraduacao;

	public EnsinoSuperior(String no, String ge, int id, String curso) {
		setNome(no);
		setGenero(ge);
		setIdade(id);
		setCursoDaGraduacao(curso);
	}

	public String getCursoDaGraduacao() {
		return this.cursoDaGraduacao;
	}

	public void setCursoDaGraduacao(String curso) {
		this.cursoDaGraduacao = curso;
	}

	public String getNovoCursoDaGraduacao() {
		return this.novoCursoDaGraduacao;
	}

	public void setNovoCursoDaGraduacao(String novoCurso) {
		if (this.isAprovadoParaMudarDeCurso()) {
			setFase(1);
			setBolsista(false);
			this.novoCursoDaGraduacao = novoCurso;
		}
	}

	public int getFase() {
		if (this.isFormado()) {
			setFase(0);
			return this.fase;
		} else {
			return this.fase;
		}
	}

	public void setFase(int fase) {
		this.fase = fase;
	}

	public boolean isEstagiando() {
		return this.estagiando;
	}

	public void setEstagiando(boolean estagiando) {
		this.estagiando = estagiando;
	}

	public boolean isBolsista() {
		return this.bolsista;
	}

	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}

	public Data getDataDeIngresso() {
		return this.dataDeIngresso;
	}

	public void setDataDeIngresso(Data ingresso) {
		this.dataDeIngresso = ingresso;
	}

	public float getMediaSemestral() {
		return this.mediaSemestral;
	}

	public void setMediaSemestral(float media) {
		this.mediaSemestral = media;
	}

	public boolean isFormado() {
		return this.formado;
	}

	private void setFormado(boolean formado) {
		this.formado = formado;
	}

	public boolean isAprovado() {
		if ((this.mediaSemestral >= 6) && (this.mediaSemestral <= 10)) {
			setAprovado(true);
		} else {
			setAprovado(false);
		}
		return this.aprovado;
	}

	private void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public int getQndDeFases() {
		return this.qndDeFases;
	}

	public void setQndDeFases(int fases) {
		this.qndDeFases = fases;
	}

	public void passarDeFase() {
		if (this.isFormado()) {
			System.out.println("Esse estudante j� se formou");
		} else {
			if (this.isAprovado()) {
				if (this.getFase() != this.getQndDeFases()) {
					this.setFase(this.getFase() + 1);
				} else {
					setFormado(true);
					System.out.println("FORMADO(A) NO CURSO DE " 
							+ this.getCursoDaGraduacao().toUpperCase());
				} 
			} else {
				System.out.println("Error message: esse estudante n�o foi aprovado, "
						+ "portanto n�o pode passar de fase");
			}
		}
	}

	public float getNotaProvaDeTransferencia() {
		return this.notaProvaDeTransferencia;
	}

	private void setNotaProvaDeTransferencia(float nota) {
		this.notaProvaDeTransferencia = nota;
	}

	public boolean isAprovadoParaMudarDeCurso() {
		if ((this.notaProvaDeTransferencia >= 7.5f) && 
				(this.notaProvaDeTransferencia <= 10.0)) {
			setAprovadoParaMudarDeCurso(true);
		} else {
			setAprovadoParaMudarDeCurso(false);
		}
		return this.aprovadoParaMudarDeCurso;
	}

	private void setAprovadoParaMudarDeCurso(boolean aprovado) {
		this.aprovadoParaMudarDeCurso = aprovado;
	}

	public void provaParaMudarDeCurso(float notaDaProva) {
		setNotaProvaDeTransferencia(notaDaProva);
		setProvaDaTransferenciaFeita(true);
	}

	public boolean isProvaDaTransferenciaFeita() {
		return this.provaDeTransferenciaFeita;
	}

	private void setProvaDaTransferenciaFeita(boolean feita) {
		this.provaDeTransferenciaFeita = feita;
	}

	public void mudarDeCurso() {
		if (this.isProvaDaTransferenciaFeita()) {
			if (this.isAprovadoParaMudarDeCurso()) {
				System.out.println("Voc� foi aprovado para fazer a mudan�a"
						+ " do seu curso.\nPor favor, escolha um novo curso de"
						+ " gradua��o");
			} else {
				System.out.println("Voc� n�o pode mudar de curso pois a nota foi"
						+ " abaixo do esperado");
			}
		} else {
			System.out.println("Voc� precisa fazer a prova de transfer�ncia "
					+ "de curso para conseguir mudar");
		}
	}

	public void mostrarStatus() {
		if (this.isFormado()) {
			System.out.println("STATUS DO(A) " + this.getNome().toUpperCase()
					+ ": esse estudante j� se formou");
		} else {
			System.out.println("Nome do Estudante: " + this.getNome());
			System.out.println(this.getGenero());
			System.out.println("Matr�cula: " + this.getNumeroDaMatricula());
			System.out.println("Data de Nascimento: " + this.getDataDeNascimento());
			System.out.println("Curso da gradua��o: " + this.getCursoDaGraduacao());
			System.out.println("Fase: " + this.getFase());
			if (this.isBolsista()) {
				System.out.println("� bolsista");
			} else if (this.isEstagiando()) {
				System.out.println("Est� estagiando");
			} else {
				System.out.println("N�o estagia, nem � bolsista");
			}
			System.out.println("Data de ingresso na universidade: " 
					+ this.getDataDeIngresso());
			System.out.println();
		}
	}

}