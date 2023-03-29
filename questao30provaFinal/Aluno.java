package questao30provaFinal;

public class Aluno {
    
    private int matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    public Aluno(int matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public double media() {
        return (notaProva1 * 2.5 + notaProva2 * 2.5 + notaTrabalho * 2) / 7;
    }

    public double provaFinal() {
        double media = this.media();
        if (media < 4.0) {
            return 10.0;
        } else if (media < 7.0) {
            return Math.ceil((5.0 - 0.4 * media) * 10) / 10;
        } else {
            return 0.0;
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

}
