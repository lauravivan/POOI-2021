
public class Main {

	public static void main(String[] args) {
		
		PlacaDeVideo placaVideo = new PlacaDeVideo("Intel Graphics 620", "Modelo Y", 
				"1000.1", 1);
		PlacaDeSom placaSom = new PlacaDeSom("Intel Audio", "Modelo Z", "2456.1", 20);
		DiscoRigido disco = new DiscoRigido("Disco 1", "Modelo X", "001", 100);
		
		disco.usarEspaco(100);
		disco.mostrarStatus();

	}

}
