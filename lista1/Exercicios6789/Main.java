
public class Main {

	public static void main(String[] args) {
	
		Casa casa = new Casa("ROSA");
		Porta porta2 = new Porta(1, 2, 3, "rosa");
		Porta porta1 = new Porta(1, 2, 3, "rosa");
		//Porta porta3 = new Porta(1, 2, 3, "rosa");
		
		casa.setPorta1(porta1);
		casa.setPorta2(porta2);
		//casa.setPorta3(porta3);
		porta1.abre();
		System.out.println(casa.quantasPortasEstaoAbertas());

	}
}
