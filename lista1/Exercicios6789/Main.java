
public class Main {

	public static void main(String[] args) {
	
		Casa minhaCasa = new Casa("verde");
		Porta porta1 = new Porta(3, 1, 42, "laranja");
		Porta porta2 = new Porta(5.2f, 6, 22, "roxo");
		
		minhaCasa.setPorta1(porta1);
		minhaCasa.setPorta2(porta2);
		porta1.abre();
		System.out.println(minhaCasa.quantasPortasEstaoAbertas());
		System.out.println(porta1.isAberta());
		System.out.println(porta2.isAberta());
		minhaCasa.getPorta1();
		minhaCasa.getPorta2();
		
		Edificio meuEdificio = new Edificio(5, 5, "preto");
		Porta[] portas = new Porta[meuEdificio.getTotalPortas()];
		
		portas[0] = new Porta(4, 6, 80, "azul");
		portas[1] = new Porta(3, 2, 10, "vermelho");
		portas[2] = new Porta(5, 3, 1, "amarela");
		portas[3] = new Porta(7, 4, 1, "verde");
		portas[4] = new Porta(4, 8, 40, "rosa");
		
		meuEdificio.setPortas(portas);
		meuEdificio.getPortas();

	}
}
