package questao31elevador;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public Elevador(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }

    public void entra() {
        if (this.pessoasPresentes < this.capacidade) {
            this.pessoasPresentes++;
        } else {
            System.out.println("Elevador está cheio.");
        }
    }

    public void sai() {
        if (this.pessoasPresentes > 0) {
            this.pessoasPresentes--;
        } else {
            System.out.println("Não há ninguém no elevador.");
        }
    }

    public void sobe() {
        if (this.andarAtual < this.totalAndares) {
            this.andarAtual++;
        } else {
            System.out.println("Já está no último andar.");
        }
    }

    public void desce() {
        if (this.andarAtual > 0) {
            this.andarAtual--;
        } else {
            System.out.println("Já está no térreo.");
        }
    }

    public int getAndarAtual() {
        return this.andarAtual;
    }

    public int getTotalAndares() {
        return this.totalAndares;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public int getPessoasPresentes() {
        return this.pessoasPresentes;
    }
}
