import javax.swing.JOptionPane;

public class UsaContaBancaria {

	public static void main(String[] args) {
		ContaBancaria um, dois;
		String entra;
		int aux;
		
		entra = JOptionPane.showInputDialog("Informe o n�mero da conta");
		aux = Integer.parseInt(entra);
		entra = JOptionPane.showInputDialog("Informe o titular da conta");
		um = new ContaBancaria(aux, entra);
		
		entra = JOptionPane.showInputDialog("Informe o n�mero da conta");
		aux = Integer.parseInt(entra);
		entra = JOptionPane.showInputDialog("Informe o titular da conta");
		dois = new ContaBancaria(aux, entra);
		
		System.out.println("Saldo da conta um " +um.consultar());
		System.out.println("Saldo da conta dois " +dois.consultar());
		System.out.println();
		um.depositar(500);
		dois.depositar(300);
		System.out.println("Saldo da conta ap�s dep�sito " +um.consultar());
		System.out.println("Saldo da conta dois ap�s dep�sito " +dois.consultar());
		System.out.println();
		if(um.sacar(400)) {
			System.out.println("SAQUE EFETUADO COM SUCESSO");
			System.out.println("Saldo da conta um ap�s saque: " +um.consultar());
		} 
		System.out.println();
		if(dois.sacar(800) == false) {
			System.out.println("SALDO INSUFICIENTE");
			System.out.println("Saldo da conta dois: " +dois.consultar());
		}
		System.out.println();
	} 

}
