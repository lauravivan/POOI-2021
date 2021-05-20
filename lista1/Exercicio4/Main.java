
public class Main {

	public static void main(String[] args) {

		Data novaData = new Data();
		
		novaData.setDia(1);
		novaData.setMes(5);
		novaData.setAno(1973);
		
		System.out.println(novaData.formatoBrasileiro());
		System.out.println(novaData.formatoEstadunidense());
	}

}
