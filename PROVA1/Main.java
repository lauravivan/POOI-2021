
public class Main {

	public static void main(String[] args) {
		
		//ESTUDANTES ENSINO SUPERIOR
		
		//ESTUDANTE 1
		EnsinoSuperior estudante1 = new 
				EnsinoSuperior("Lucas Souza", "Homem", 21, "Matemática");
		
		estudante1.setEmail("souza.lucas@email.com");
		estudante1.setNumeroDaMatricula(20188720);
		estudante1.setCpf("234.653.682-98");
		estudante1.setFase(7);
		estudante1.setEstagiando(true);
		estudante1.setBolsista(false);
		estudante1.setMediaSemestral(8.5f);
		estudante1.setQndDeFases(8);
		
		Data dataNascEstudante1 = new Data(8, 8, 1999);
		Data dataIngressoEstudante1 = new Data(3, 3, 2018);
		estudante1.setDataDeNascimento(dataNascEstudante1);
		estudante1.setDataDeIngresso(dataIngressoEstudante1);
		
		//ESTUDANTE 2
		EnsinoSuperior estudante2 = new 
				EnsinoSuperior("Luara Kim", "Mulher", 18, "Artes Visuais");
		
		estudante2.setEmail("kimara@email.com");
		estudante2.setNumeroDaMatricula(20217638);
		estudante2.setCpf("287.093.863-24");
		estudante2.setFase(1);
		estudante2.setEstagiando(false);
		estudante2.setBolsista(false);
		estudante2.setMediaSemestral(9.3f);
		estudante2.setQndDeFases(8);
		
		Data dataNascEstudante2 = new Data(22, 2, 2003);
		Data dataIngressoEstudante2 = new Data(20, 2, 2021);
		estudante2.setDataDeNascimento(dataNascEstudante2);
		estudante2.setDataDeIngresso(dataIngressoEstudante2);
		
		//ESTUDANTE 3
		EnsinoSuperior estudante3 = new 
				EnsinoSuperior("Sofia Salazar", "Mulher", 24, "Sistemas de Informação");
		
		estudante3.setEmail("so.salazando@email.com");
		estudante3.setNumeroDaMatricula(20206732);
		estudante3.setCpf("113.098.725-83");
		estudante3.setFase(3);
		estudante3.setEstagiando(false);
		estudante3.setBolsista(true);
		estudante3.setMediaSemestral(8.8f);
		estudante3.setQndDeFases(8);
		
		Data dataNascEstudante3 = new Data(14, 3, 1997);
		Data dataIngressoEstudante3 = new Data(15, 3, 2020);
		estudante3.setDataDeNascimento(dataNascEstudante3);
		estudante3.setDataDeIngresso(dataIngressoEstudante3);
		
		//ESTUDANTES ENSINO MÉDIO 
		
		//ESTUDANTE 1
		EnsinoMedio estudanteUm = new 
				EnsinoMedio("Luana Lobato", 17, "Mulher", "678.090.089-09", 3);
		
		estudanteUm.setEmail("lobato_luana@email.com");
		estudanteUm.setNumeroDaMatricula(20117834);
		estudanteUm.setMediaFinal(8.2f);
		estudanteUm.setInicioDoEnsinoMedio(2019);
		estudanteUm.setCursoEscolhido("Ciência da Computação");
		
		Data dataNascEstudanteUm = new Data(3, 1, 2004);
		estudanteUm.setDataDeNascimento(dataNascEstudanteUm);

		//ESTUDANTE 2
		EnsinoMedio estudanteDois = new 
				EnsinoMedio("Gabriel Pereira", 16, "Homem", "763.540.384-26", 2);
		
		estudanteDois.setEmail("gabipereira@email.com");
		estudanteDois.setNumeroDaMatricula(20128493);
		estudanteDois.setMediaFinal(9.0f);
		estudanteDois.setInicioDoEnsinoMedio(2020);
		estudanteDois.setCursoEscolhido("Pedagogia");
		
		Data dataNascEstudanteDois = new Data(29, 3, 2005);
		estudanteDois.setDataDeNascimento(dataNascEstudanteDois);
		
		//ESTUDANTE 3
		EnsinoMedio estudanteTres = new 
				EnsinoMedio("Victor Andrade", 15, "Homem", "854.983.903-13", 1);
		
		estudanteTres.setEmail("vicandrade@email.com");
		estudanteTres.setNumeroDaMatricula(20136234);
		estudanteTres.setMediaFinal(5.0f);
		estudanteTres.setInicioDoEnsinoMedio(2021);
		estudanteTres.setCursoEscolhido("Medicina");
		
		Data dataNascEstudanteTres = new Data(20, 2, 2006);
		estudanteTres.setDataDeNascimento(dataNascEstudanteTres);
		
		//TESTANDO OUTROS MÉTODOS (ENSINO SUPERIOR)
		
		/* estudante1.mostrarStatus(); //tava na fase 7
		System.out.println(estudante1.isAprovado());
		estudante1.passarDeFase();
		estudante1.mostrarStatus(); //agora está na 8
		estudante1.setMediaSemestral(5.9f);
		estudante1.passarDeFase(); //não consegue passar de fase
		System.out.println(estudante1.getFase()); //ainda se encontra na 8
		estudante1.mostrarStatus(); //no status continua 8
		estudante1.setMediaSemestral(6.0f);
		estudante1.passarDeFase(); //conseguiu se formar
		estudante1.passarDeFase(); //o método nao funciona mais pois já se formou
		System.out.println(estudante1.getFase()); //zerou a fase pois já se formou
		estudante1.mostrarStatus(); //formado */
		
		/*System.out.println(estudante2.getIdade());
		estudante2.fazAniversario();
		System.out.println(estudante2.getIdade());
		estudante2.mostrarStatus();
		System.out.println(estudante2.isAprovado());
		estudante2.passarDeFase();
		estudante2.mostrarStatus();
		estudante2.setBolsista(true);
		estudante2.mostrarStatus();
		estudante2.mudarDeCurso();
		estudante2.provaParaMudarDeCurso(6.0f);
		System.out.println(estudante2.isAprovadoParaMudarDeCurso());
		estudante2.mudarDeCurso(); */
		
		/*estudante3.mostrarStatus();
		estudante3.provaParaMudarDeCurso(8.0f);
		System.out.println(estudante3.isAprovadoParaMudarDeCurso());
		estudante3.mudarDeCurso();
		estudante3.setCursoDaGraduacao("Cinema");
		estudante3.mostrarStatus(); */
		
		//TESTANDO OUTROS MÉTODOS (ENSINO MÉDIO)
		
		/*estudanteUm.mostrarStatus();
		System.out.println(estudanteUm.isAprovado());
		System.out.println(estudanteUm.getAno());
		estudanteUm.passarDeAno();
		estudanteUm.mostrarStatus();
		estudanteUm.passarDeAno();
		System.out.println(estudanteUm.getAno()); 
		
		estudanteDois.mostrarStatus();
		System.out.println(estudanteDois.getIdade());
		estudanteDois.fazAniversario();
		System.out.println(estudanteDois.getIdade());
		
		estudanteTres.mostrarStatus(); */
		
		estudante1.mostrarStatus();
		estudante1.provaParaMudarDeCurso(6.0f);
		System.out.println(estudante1.isAprovadoParaMudarDeCurso());
		estudante1.mudarDeCurso();
		estudante1.setNovoCursoDaGraduacao("Odontologia");
		estudante1.mostrarStatus();
			
	}
}
