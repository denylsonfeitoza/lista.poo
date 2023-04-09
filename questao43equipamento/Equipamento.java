package questao43equipamento;

public class Equipamento {
    private String marca;
    private int preco;

    public Equipamento(String marca, int preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Equipamento: " + " Marca - " + marca + ", Preço - " + preco;
    }
}