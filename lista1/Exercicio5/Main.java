
public class Main {

	public static void main(String[] args) {
		Pessoa eu = new Pessoa();
		
		eu.setNome("Laura");
		eu.setIdade(20);
		System.out.println(eu.getIdade());
		eu.fazAniversario();
		System.out.println(eu.getIdade());
	}

}
