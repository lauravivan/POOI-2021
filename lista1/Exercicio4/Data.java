
public class Data {

	private int dia, mes, ano;

	public int getDia() {
		return this.dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String formatoBrasileiro() {
		//(DD-MM-AAAA)

		String dataBrasileira = "(" + getDia() + "-" + getMes() 
		+ "-" + getAno() + ")";

		return dataBrasileira;
	}

	public String formatoEstadunidense() {
		//(MM-DD-AAAA)

		String dataEstadunidense = "(" + getMes() + "-" + getDia()
		+ "-" + getAno() + ")";

		return dataEstadunidense;
	}
}

