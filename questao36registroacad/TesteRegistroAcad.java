package questao36registroacad;

public class TesteRegistroAcad {
    public static void main(String[] args) {
        RegistroAcademico aluno1 = new RegistroAcademico("João", 1, 0.5);
        RegistroAcademico aluno2 = new RegistroAcademico("Maria", 2, 0.7);
        RegistroAcademico aluno3 = new RegistroAcademico("Pedro", 3, 0.8);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Código do curso: " + aluno1.getCodigoCurso());
        System.out.println("Percentual de cobrança: " + aluno1.getPercentualDeCobranca());

        System.out.println("\nAluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Matrícula: " + aluno2.getMatricula());
        System.out.println("Código do curso: " + aluno2.getCodigoCurso());
        System.out.println("Percentual de cobrança: " + aluno2.getPercentualDeCobranca());

        System.out.println("\nAluno 3:");
        System.out.println("Nome: " + aluno3.getNome());
        System.out.println("Matrícula: " + aluno3.getMatricula());
        System.out.println("Código do curso: " + aluno3.getCodigoCurso());
        System.out.println("Percentual de cobrança: " + aluno3.getPercentualDeCobranca());
    }
}