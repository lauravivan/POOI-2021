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
        if (isAprovada()) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();

            Random numero = new Random();
            int vencedor = numero.nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome().toUpperCase() + " É O VENCEDOR!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiante.getNome().toUpperCase() + " É O VENCEDOR!!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        } 
    }

}



