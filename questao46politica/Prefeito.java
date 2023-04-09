package questao46politica;

public class Prefeito extends Politico {
    private String cidade;

    public Prefeito(String nome, int idade, String partido, String cidade) {
        super(nome, idade, partido);
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Prefeito: " + "nome=" + getNome() + ", idade=" + getIdade() + ", partido=" + getPartido() +
                ", cidade=" + cidade;
    }
}