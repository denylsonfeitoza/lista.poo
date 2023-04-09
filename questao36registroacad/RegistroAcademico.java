package questao36registroacad;

public class RegistroAcademico {
    private static int numeroDeMatriculas = 0;
    private int matricula;
    private String nome;
    private int codigoCurso;
    private double percentualDeCobranca;

    public RegistroAcademico(String nome, int codigoCurso, double percentualDeCobranca) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.percentualDeCobranca = percentualDeCobranca;
        this.matricula = ++numeroDeMatriculas;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCodigoCurso() {
        return this.codigoCurso;
    }

    public double getPercentualDeCobranca() {
        return this.percentualDeCobranca;
    }

}
