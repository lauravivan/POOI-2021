
public class Data {
	private int dia, mes, ano;
	
	public Data(int dia, int mes, int ano) {
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}

	public int getDia() {
		return this.dia;
	}

	private void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return this.mes;
	}

	private void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return this.ano;
	}

	private void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
	
}
