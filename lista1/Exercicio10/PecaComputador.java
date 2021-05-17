
public class PecaComputador {
	String nome;
	String descricao;
	String fabricante;
	String provedor;
	String versao;
	String modelo;
	String tipo;

	public String getNome() {
		return nome;
	}

	public void setNome(String no) {
		this.nome = no;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String de) {
		this.descricao = de;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fa) {
		this.fabricante = fa;
	}

	public String getProvedor() {
		return provedor;
	}

	public void setProvedor(String pro) {
		this.provedor = pro;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String ve) {
		this.versao = ve;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String mo) {
		this.modelo = mo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void mostrarInformacoes() {
		System.out.println("Nome: " + getNome());
		System.out.println("Descricao: " + getDescricao());
		System.out.println("Fabricante: " + getFabricante());
		System.out.println("Provedor: " + getProvedor());
		System.out.println("Versão: " + getVersao());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Tipo: " + getTipo());
		System.out.println();
	}	
}
