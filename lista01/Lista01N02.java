import javax.swing.JOptionPane;

public class Lista01N02 {
	
	/* 2) Um cinema deseja saber a opinião dos espectadores sobre o filme que está
	sendo exibido. Cada espectador, respondeu a um questionário, contendo sua
	idade e sua opinião sobre o filme: (1)ótimo, (2)bom, (3)regular, (4)ruim,
	(5)péssimo. Elaborar um algoritmo que, lendo estes dados, calcule e escreva:
	- a quantidade de respostas Ótimo,
	- a diferença de votos entre respostas Bom e Regular,
	- a média de idade das pessoas que responderam ruim,
	- a percentagem de respostas Péssimo
	Obs: Foram ouvidos 20 clientes. */

	public static void main(String[] args) {
		
		int age, opinion, clients = 0, sumGreat = 0, sumGood = 0, sumRegular = 0, sumBad = 0, sumAge = 0,
				sumTerrible = 0, differenceGoodRegular = 0, avgOfAgeBad = 0,
						percentualTerrible = 0;
		String inputValue;
		
		while (clients < 10) {
		inputValue = JOptionPane.showInputDialog ("Inform age: ");
		age = Integer.parseInt(inputValue);
		inputValue = JOptionPane.showInputDialog("Inform opinion: "
								+ "\n(1) GREAT"
								+ "\n(2) GOOD"
								+ "\n(3) REGULAR"
								+ "\n(4) BAD"
								+ "\n(5) TERRIBLE");
		opinion = Integer.parseInt(inputValue);
		
		if (opinion == 1) {
			sumGreat++;
		} else if (opinion == 2){
			sumGood++;
		} else if (opinion == 3){
			sumRegular++;
		} else if (opinion == 4) {
			sumBad++;
			sumAge += age;
		} else {
			sumTerrible++;
		}	
		clients++;
	}
		
		differenceGoodRegular = sumGood - sumRegular;
		avgOfAgeBad = sumAge/sumBad;
		percentualTerrible = (sumTerrible/clients) * 100;
		
		System.out.println("\n Total of answers Great: " +sumGreat
							+ "\n Difference between answers Good and Regular: " +differenceGoodRegular
							+ "\n Average of people age that answered Bad: " +avgOfAgeBad
							+ "\n Percentual of answers Terrible: " +percentualTerrible+ "%");
}

}
