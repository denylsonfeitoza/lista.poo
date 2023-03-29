package questao1a27;
// Questão 23
public class questao23Lampada {

    private String marca;
    private double potencia;
    private double preco;
    private boolean ligada;

    public questao23Lampada(String marca, double potencia, double preco) {
        this.marca = marca;
        this.potencia = potencia;
        this.preco = preco;
        this.ligada = false;
    }
    
    public questao23Lampada() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void imprimir() {
        System.out.println("Lâmpada " + marca + ", potência: " + potencia + "W, preço: R$" + preco);
        if (ligada) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }

}
