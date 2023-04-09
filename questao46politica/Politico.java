package questao46politica;

public class Politico extends Pessoa {
    private String partido;

    public Politico(String nome, int idade, String partido) {
        super(nome, idade);
        this.partido = partido;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return "Politico: " + "nome=" + getNome() + ", idade=" + getIdade() + ", partido=" + partido;
    }
}