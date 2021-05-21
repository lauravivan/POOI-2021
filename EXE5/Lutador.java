
public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(em);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria() {
        if (getPeso() < 52.2f) {
            this.categoria = "INVÁLIDO";
        } else if (getPeso() <= 70.3f) {
            this.categoria = "LEVE";
        } else if (getPeso() <= 83.9f) {
            this.categoria = "MÉDIO";
        } else if (getPeso() <= 120.2f) {
            this.categoria = "PESADO";
        } else {
            this.categoria = "INVÁLIDO";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

    public void apresentar() {
        System.out.println("-----APRESENTAÇÃO " + getNome().toUpperCase() + "-----");
        System.out.println("ORIGEM: " + getNacionalidade().toUpperCase());
        System.out.println("IDADE: " + getIdade() + " ANOS");
        System.out.println("ALTURA: " + getAltura() + " m");
        System.out.println("PESO: " + getPeso() + " Kg");
        System.out.println("CATEGORIA: " + getCategoria());
        System.out.println("VITÓRIAS: " + getVitorias());
        System.out.println("DERROTAS: " + getDerrotas());
        System.out.println("EMPATES: " + getEmpates());
        System.out.println("-------------------------------");
    }

    public void status() {
        System.out.println("-----STATUS " + getNome().toUpperCase() + "-----");
        System.out.println("        PESO " + getCategoria() + "     ");
        System.out.println("        " + getVitorias() + " VITÓRIAS     ");
        System.out.println("        " + getDerrotas() + " DERROTAS     ");
        System.out.println("        " + getEmpates() + " EMPATES       ");
        System.out.println("-------------------------");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}
