
public class EnsinoMedio extends Estudante {
	private int ano;
	private int inicioDoEnsinoMedio;
	private float mediaFinal;
	private boolean aprovado;
	private boolean cursando;
	private boolean formado;
	private String cursoEscolhido;

	public EnsinoMedio(String no, int id, String ge, String cpf, int ano) {
		setNome(no);
		setIdade(id);
		setGenero(ge);
		setCpf(cpf);
		setAno(ano);
	}

	public int getAno() {
		if (isFormado()) {
			setAno(0);
			return this.ano;
		} else {
			return this.ano;
		}
	}

	public void setAno(int ano) {
		if ((ano == 1) || (ano == 2) || (ano == 3)) {
			this.ano = ano;
		} else if (this.isFormado() && (ano == 0)) {
			this.ano = ano;
		} else {
			System.out.println("Error message: coloque um número válido!"
					+ " Exemplo: 1, 2, ou 3");
		}
	}

	public String getCursoEscolhido() {
		return this.cursoEscolhido;
	}

	public void setCursoEscolhido(String curso) {
		this.cursoEscolhido = curso;
	}

	public float getMediaFinal() {
		return this.mediaFinal;
	}

	public void setMediaFinal(float media) {
		this.mediaFinal = media;
	}

	public boolean isAprovado() {
		if ((this.mediaFinal >= 7) && (this.mediaFinal <= 10)) {
			setAprovado(true);
		} else {
			setAprovado(false);
		}
		return this.aprovado;
	}

	private void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public int getInicioDoEnsinoMedio() {
		return this.inicioDoEnsinoMedio;
	}

	public void setInicioDoEnsinoMedio(int inicio) {
		this.inicioDoEnsinoMedio = inicio;
	}

	public boolean isFormado() {
		return this.formado;
	}

	private void setFormado(boolean formado) {
		this.formado = formado;
	}

	public boolean isCursando() {
		if (this.isFormado()) {
			setCursando(false);
		} else {
			setCursando(true);
			System.out.println("Está cursando");
		}
		return this.cursando;
	}

	private void setCursando(boolean cursando) {
		this.cursando = cursando;
	}

	public void passarDeAno() {
		if (this.isFormado()) {
			System.out.println("Esse estudante já se formou");
		} else {
			if (this.isAprovado()) {
				if ((this.getAno() == 1) || (this.getAno() == 2)) {
					this.setAno(this.getAno() + 1);
				} else {
					setFormado(true);
					System.out.println("FORMADO(A)!");
				} 
			} else {
				System.out.println("Error message: esse estudante não foi aprovado, "
						+ "portanto não pode passar de ano");
			}
		}
	}

	public void mostrarStatus() {
		if (this.isFormado()) {
			System.out.println("STATUS DO(A) " + this.getNome().toUpperCase()
					+ ": esse estudante já se formou");
		} else {
			System.out.println("Nome do Estudante: " + this.getNome());
			System.out.println(this.getGenero());
			System.out.println("Matrícula: " + this.getNumeroDaMatricula());
			System.out.println("Data de Nascimento: " + this.getDataDeNascimento());
			System.out.println("Ano em que iniciou o EM: " + this.getInicioDoEnsinoMedio());
			this.isCursando();
			System.out.println("Quer cursar na faculdade: " + this.getCursoEscolhido());
			System.out.println();
		}
	}

}
