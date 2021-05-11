package exe5;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador L1, Lutador L2) {
        if ((L1.getCategoria().equals(L2.getCategoria())) && (L1 != L2)) {
            setAprovada(true);
            setDesafiado(L1);
            setDesafiante(L2);
            System.out.println("Luta marcada!");
        } else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
            System.out.println("Luta não pode ser marcada.");
        }
    }

    public void lutar() {
        int round = 1;
        int desafiadoGanhou = 0;
        int desafianteGanhou = 0;
        
        if (isAprovada() && (getRounds() != 0)) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
        }
        
        if (getRounds() == 0) {
            System.out.println("Indique a quantidade de rounds da luta");
        }
        
        while (round <= getRounds()) {
            if (isAprovada() && (getRounds() != 0)) {
                Random numero = new Random();
                int vencedor = numero.nextInt(3);
                
                System.out.println();
                System.out.println("        ROUND " + round);
                System.out.println();
                switch (vencedor) {
                    case 0:
                        System.out.println("        EMPATE!");
                        desafiadoGanhou++;
                        desafianteGanhou++;
                        break;
                    case 1:
                        System.out.println("    " + 
                                this.desafiado.getNome().toUpperCase() + " VENCEU!");
                        desafiadoGanhou++;
                        break;
                    case 2:
                        System.out.println("    " + 
                                this.desafiante.getNome().toUpperCase() + " VENCEU!");
                        desafianteGanhou++;
                        break;
                }
                System.out.println();
            }
            round++;
        }
        
        if (getRounds() != 0) {
            if (desafianteGanhou > desafiadoGanhou) {
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                System.out.println();
                System.out.println("-RESULTADO DA LUTA-");
                System.out.println(this.desafiante.getNome().toUpperCase() + " É O VENCEDOR!!");
            } else if (desafiadoGanhou > desafianteGanhou) {
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                System.out.println();
                System.out.println("-RESULTADO DA LUTA-");
                System.out.println(this.desafiado.getNome().toUpperCase() + " É O VENCEDOR!!");
            } else {
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                System.out.println();
                System.out.println("-RESULTADO DA LUTA-");
                System.out.println("EMPATOU!");
            }
        }
    }

}



