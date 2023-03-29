package questao1a27;
public class questao25Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private int numPag;
    private boolean disp;

    public questao25Livro(String titulo, String autor, String editora, int anoPublicacao, int numPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.numPag = numPag;
        this.disp = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getNumPag() {
        return numPag;
    }

    public boolean isDisp() {
        return disp;
    }

    public void setDisp(boolean disp) {
        this.disp = disp;
    }
}
