package questao43equipamento;

public class Computador extends Equipamento {
    private int memoria;
    private String processador;

    public Computador(String marca, int preco, int memoria, String processador) {
        super(marca, preco);
        this.memoria = memoria;
        this.processador = processador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return "Computador: " + " Marca - " + getMarca() + ", Preço - " + getPreco() + 
        ", Memória - " + memoria + "GB" +" e Processador - " + processador;
    }
}