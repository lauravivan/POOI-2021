
public class Main {

	public static void main(String[] args) {
		
		PlacaDeVideo placaVideo = new PlacaDeVideo("Intel Graphics 620", "Modelo Y", 
				"4", 1);
		PlacaDeSom placaSom = new PlacaDeSom("Intel Audio", "Modelo Z", "1", 20);
		DiscoRigido disco = new DiscoRigido("HD", "Modelo X", "3", 120);
		
		placaVideo.mostrarInformacoes();
		placaVideo.desativar();
		placaVideo.mostrarStatus();
		
		placaSom.mostrarInformacoes();
		System.out.println(placaSom.isAtivado());
		placaSom.mostrarStatus();
		
		disco.mostrarInformacoes();
		disco.usarEspaco(58);
		disco.mostrarStatus();
		disco.liberarEspaco(58);
		disco.mostrarStatus();
		disco.usarEspaco(120);
		disco.mostrarStatus();
	}
}
