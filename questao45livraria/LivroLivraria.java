package questao45livraria;

public class LivroLivraria extends Livro {
    private double preco;

    public LivroLivraria(String titulo, String autor, int numPaginas, double preco) {
        super(titulo, autor, numPaginas);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return super.toString() + " - R$ " + preco;
    }
}
