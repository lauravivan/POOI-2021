
public class BancoDoMotorista {
    private int posicao;
    private boolean totalmenteAbaixado;
    private boolean totalmenteLevantado;
    private boolean abaixado;
    private boolean levantado;
    
    //Quando a posição se encontra em 0 = TOTALMENTE ABAIXADO
    //Quando a posição se encontra em 1 ou 2 = ABAIXADO
    //Quando a posição se encontra em 3 ou 4 = LEVANTADO
    //Quando a posição se encontra em 5 = TOTALMENTE LEVANTADO
    
    public BancoDoMotorista() {
    }

    public void setPosicao(int posicao) {
        if (posicao >= 0 && posicao <= 5) {
            this.posicao = posicao;
        } else {
            System.out.println("Error message: Posição Inválida! Tente outra vez!");
        }
    }
    
    public void getPosicao() {
            System.out.println("Posição se encontra em " + this.posicao + ".");
    }

    public void isTotalmenteAbaixado() {
        if (this.posicao != 0) {
            this.totalmenteAbaixado = false;
            System.out.println("Não, o banco não está totalmente abaixado pois "
                    + "não se encontra na posição ZERO.");
        }
        if (this.posicao == 0) {
            this.totalmenteAbaixado = true;
            System.out.println("Sim, o banco está totalmente abaixado! Portanto, "
                    + "não force a alavanca para baixo!");
        }
    }
    
    public void isTotalmenteLevantado() {
        if (this.posicao != 5) {
            this.totalmenteLevantado = false;
            System.out.println("Não, o banco não está totalmente levantado pois "
                    + "não se encontra na posição CINCO.");
        }
        if (this.posicao == 5) {
            this.totalmenteLevantado = true;
            System.out.println("Sim, o banco está totalmente levantado! Portanto, "
                    + "não force a alavanca para cima!");
        }
    }
    
    public void isAbaixado() {
        if (this.posicao == 1 || this.posicao == 2 || this.posicao == 0) {
            System.out.println("Sim, o banco está abaixado pois se encontra na "
                    + "posição " + this.posicao);
        } else {
            System.out.println("Não, o banco não está abaixado pois está na posição " 
                    + this.posicao + ".");
        }
    }

    public void isLevantado() {
        if (this.posicao == 3 || this.posicao == 4 || this.posicao == 5) {
            System.out.println("Sim, o banco está levantado pois se encontra na "
                    + "posição " + this.posicao);
        } else {
            System.out.println("Não, o banco não está levantado pois está na posição " 
                    + this.posicao + ".");
        }
    }
    
    public void abaixarBanco() {
        if (this.posicao == 0) {
            System.out.println("Não force a alavanca, o banco não pode mais ser abaixado!");
        } else {
            System.out.println("Você abaixou o banco!");
            this.posicao -= 1;
        }
    }
    
    public void subirBanco() {
        if (this.posicao == 5) {
            System.out.println("Não force a alavanca, o banco não pode mais ser levantado!");
        } else {
            System.out.println("Você subiu o banco!");
            this.posicao += 1;
        } 
    }
}
