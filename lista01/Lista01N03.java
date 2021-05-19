import javax.swing.JOptionPane;

public class Lista01N03 {
	
	/*	3) O Departamento de Trânsito do estado anotou dados de acidentes de trânsito
	no ultimo ano. Para cada um dos 20 motoristas envolvidos em acidentes, tem-se
	as seguintes informações:
	· Ano de nascimento;
	· Sexo (1=Masculino, 2=Feminino)
	Elaborar um algoritmo que :
	· Calcule e escreva a porcentagem de motoristas com menos de 21 anos;
	· Calcule e escreva o percentual de motoristas mulheres em relação ao total;
	· Calcule e escreva quantos motoristas tem idade maior que 60 anos;
	· Determine e escreva quantas mulheres têm idade maior que 60 anos; */

	public static void main(String[] args) {
		
		int yearOfBirth, drivers = 0, gender, driversLessThan21 = 0, sumWomen = 0, driversMoreThan60 = 0,
				womenMoreThan60 = 0, percentualDriversLessThan21 = 0, percentualWomen = 0;
		String inputValue;
		
		while(drivers < 10) {
			
			inputValue = JOptionPane.showInputDialog ("Inform year of birth: ");
			yearOfBirth = Integer.parseInt(inputValue);
			inputValue = JOptionPane.showInputDialog ("Inform gender: "
														+ "\n1 = Man"
														+ "\n2 = Woman");
			gender = Integer.parseInt(inputValue);
			
			if ((2021 - yearOfBirth) < 21) {
				driversLessThan21++;
			}
			if (gender == 2) {
				sumWomen++;
				if ((2021 - yearOfBirth) > 60) {
					womenMoreThan60++;
				}
			}
			if ((2021 - yearOfBirth) > 60) {
				driversMoreThan60++;
			}
		drivers++;
		}
		
		percentualDriversLessThan21 = (driversLessThan21/drivers) * 100;
		percentualWomen = (sumWomen/drivers) * 100;
		
		System.out.println("\n Percentual of drivers with less than 21 years old: " +percentualDriversLessThan21
							+ "\n Percentual of women drivers about total of drivers: " +percentualWomen
							+ "\n Total of drivers with more than 60 years old: " +driversMoreThan60
							+ "\n Total of women with more than 60 years old: " +womenMoreThan60);
	}

}
