package questao45livraria;

public class LivroBiblioteca extends Livro {
    private int qtdCopiasDisponiveis;

    public LivroBiblioteca(String titulo, String autor, int numPaginas, int qtdCopiasDisponiveis) {
        super(titulo, autor, numPaginas);
        this.qtdCopiasDisponiveis = qtdCopiasDisponiveis;
    }

    public int getQtdCopiasDisponiveis() {
        return qtdCopiasDisponiveis;
    }

    public void setQtdCopiasDisponiveis(int qtdCopiasDisponiveis) {
        this.qtdCopiasDisponiveis = qtdCopiasDisponiveis;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + qtdCopiasDisponiveis + " cópias disponíveis";
    }
}
