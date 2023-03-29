package quaetao28time;
// Questão 24
public class Time {

    private String nome;
    private int pontos;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int golsMarcados;
    private int golsSofridos;

    public Time(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
        this.golsMarcados = 0;
        this.golsSofridos = 0;
    }

    public Time() {
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    // métodos
    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
    }

    public void adicionarVitoria(int golsMarcados, int golsSofridos) {
        this.vitorias += 1;
        this.pontos += 3;
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;
    }

    public void adicionarEmpate(int golsMarcados, int golsSofridos) {
        this.empates += 1;
        this.pontos += 1;
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;
    }

    public void adicionarDerrota(int golsMarcados, int golsSofridos) {
        this.derrotas += 1;
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;
    }

    public int getSaldoDeGols() {
        return this.golsMarcados - this.golsSofridos;
    }
    
    @Override
    public String toString() {
        return "Time [nome=" + nome + ", pontos=" + pontos
                + ", vitorias=" + vitorias + ", empates=" + empates + ", derrotas=" + derrotas + ", golsMarcados="
                + golsMarcados + ", golsSofridos=" + golsSofridos + "]";
    }  
}
