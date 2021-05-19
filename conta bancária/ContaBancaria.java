
public class ContaBancaria {
	private int numero;
	private String titular;
	private int saldo;
	
	ContaBancaria(int nm, String quem) {
		numero = nm;
		titular = quem;
		saldo = 0;
	}
	
	public void depositar(int quanto) {
		saldo = saldo + quanto;
	}
	
	public boolean sacar(int quanto) {
		if (quanto > saldo) {
			return false;
		}
			saldo = saldo - quanto;
			return true;
	}
	
	public int consultar() {
		return saldo;
	}
}
