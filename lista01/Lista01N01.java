import javax.swing.JOptionPane;

public class Lista01N01 {
	
	/* 1) Uma empresa decidiu fazer um levantamento em relação aos candidatos que
	se apresentaram para preenchimento de vagas no seu quadro de funcionários.
	Fazer um algoritmo que leia o conjunto de informações de cada candidato,
	contendo:
	- Idade(em anos)
	- Sexo (1=M / 2=F)
	- Experiência no serviço (1=S / 2=N).
	O algoritmo deve calcular:
	A) Quantidade de candidatos do sexo feminino,
	B) Quantidade de candidatos do sexo masculino,
	C) Idade media dos homens com experiência no serviço,
	D) Porcentagem dos homens com mais de 45 anos, em relação ao total de
	homens,
	E) Quantidade de mulheres com idade inferior a 35 anos e com experiência no
	serviço.
	OBS.: Existem 20 candidatos inscritos. */

	public static void main(String[] args) {
		
		double age, gender, exp, staff = 0, sumWomen = 0, sumMen = 0, sumMenAges = 0,
				averageMenAges = 0, percentualMen = 0, menMoreThan45 = 0, women35AndExp = 0,
				menWithExp = 0;
		String inputValue;
		
		while (staff < 10 )  {
			inputValue = JOptionPane.showInputDialog ("Inform age: ");
			age = Integer.parseInt (inputValue);
			inputValue = JOptionPane.showInputDialog ("Inform gender: "
										+ "\n1 = Woman"
										+ "\n2 = Man");
			gender = Integer.parseInt (inputValue);
			inputValue = JOptionPane.showInputDialog ("Inform experience: "
										+ "\n1 = Yes" 
					    					+ "\n2 = No");
			exp = Integer.parseInt (inputValue);
			
			if (gender == 1) {
				sumWomen++;
				if(age < 35 & exp == 1) {
					women35AndExp++;
				}
			} else {
				sumMen++;
				if (exp == 1) {
					sumMenAges+= age;
					menWithExp++;
				} 
				//else if entraria na condição abaixo se a anterior fosse falsa, mas não é.
				if (age > 45){
					menMoreThan45++;
				};
			}
			staff++;
		}
		
		averageMenAges = sumMenAges/menWithExp;
		percentualMen = (menMoreThan45/sumMen) * 100;
		
		System.out.println("\n Total of women: " +(int) sumWomen
				           + "\n Total of men: " +(int) sumMen
				           + "\n Average age of men w/ experience: " +averageMenAges
				           + "\n Percentual of men more than 45 about total of men: " +percentualMen+ "%"
				           + "\n Total of women less than 35 and w/ experience: " +(int) women35AndExp);
	}
}
