package questao45livraria;

public class TesteLivraria {
    public static void main(String[] args) {
        LivroLivraria ll = new LivroLivraria("O Senhor dos Anéis", "J.R.R. Tolkien", 100, 0);
        ll.setPreco(50.0);

        LivroBiblioteca lb = new LivroBiblioteca("Dom Casmurro", "Machado de Assis", 200, 3);
        lb.setQtdCopiasDisponiveis(2);

        System.out.println(ll);
        System.out.println(lb);
    }
}
