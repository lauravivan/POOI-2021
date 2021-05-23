
public class Estudante {
	private String nome;
	private int idade;
	private String genero;
	private String email;
	private int numeroDaMatricula;
	private String cpf;
	private Data dataDeNascimento;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String no) {
		this.nome = no;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int id) {
		this.idade = id;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String gen) {
		this.genero = gen;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumeroDaMatricula() {
		return this.numeroDaMatricula;
	}

	public void setNumeroDaMatricula(int numMat) {
		this.numeroDaMatricula = numMat;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Data getDataDeNascimento() {
		return this.dataDeNascimento;
	}

	public void setDataDeNascimento(Data dataNasc) {
		this.dataDeNascimento = dataNasc;
	}

	public void fazAniversario() {
		this.setIdade(this.getIdade() + 1);
	}

}
